# Postman API Tests — API Monitoring Feature

## 1. Create Monitor — POST /api/monitors

### Body
```json
{
  "name": "User API Monitor",
  "url": "https://api.company.com/user",
  "method": "GET",
  "interval": 60,
  "sla_target": 99
}
```

### Pre-request Script
```javascript
if (!pm.environment.get("base_url")) {
    throw new Error("base_url is not set");
}
pm.environment.set("auth_token", "Bearer " + Math.random().toString(36).substring(2));
```

### Tests
```javascript
pm.test("Status code 201", () => {
  pm.response.to.have.status(201);
});

const body = pm.response.json();
pm.environment.set("monitor_id", body.id);

pm.test("Monitor status ACTIVE", () => {
  pm.expect(body.status).to.eql("ACTIVE");
});
```

---

## 2. Get Summary — GET /api/monitors/{{monitor_id}}/summary

### Tests
```javascript
pm.test("Status code 200", () => {
  pm.response.to.have.status(200);
});

const json = pm.response.json();

pm.test("Required fields present", () => {
  ["latency_avg","uptime","sla_status","last_check","sla_target"]
    .forEach(f => pm.expect(json).to.have.property(f));
});

pm.test("SLA logic validation", () => {
  const u = json.uptime;
  const t = json.sla_target;
  const expected = u >= t ? "GREEN" : u >= t - 5 ? "YELLOW" : "RED";
  pm.expect(json.sla_status).to.eql(expected);
});
```
