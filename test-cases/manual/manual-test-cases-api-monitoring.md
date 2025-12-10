# Manual Test Cases — API Monitoring Feature

## TC-API-001 Create API Monitor

| Step | Action | Expected |
|------|--------|----------|
| 1 | Open API Monitoring page | Page loads correctly |
| 2 | Click "Add Monitor" | Modal opens |
| 3 | Enter Name | Field accepts input |
| 4 | Enter valid URL | No validation error |
| 5 | Select Method = GET | Option visible and selected |
| 6 | Input Interval = 60 | Field accepts numeric value |
| 7 | Input SLA Target = 99 | Field accepts 0–100 |
| 8 | Click Save | Success toast displayed |
| 9 | Check table row | Status = ACTIVE |

---

## TC-API-002 SLA Badge Rendering

| uptime | sla_target | expected_badge |
|--------|-------------|----------------|
| 99.2 | 99 | GREEN |
| 96 | 99 | YELLOW |
| 92 | 99 | RED |

---

## TC-API-003 Invalid URL Handling

| Step | Action | Expected |
|------|--------|----------|
| 1 | Enter URL "abc123" | URL validation error |
| 2 | Click Save | Monitor not created |
