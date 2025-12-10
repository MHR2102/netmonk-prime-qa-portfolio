# Manual Test Cases — API Monitoring Feature

### TC-API-001 Create API Monitor (Functional + UI)
| Step | Action | Expected |
|------|--------|----------|
|1| Open API Monitoring page | Page loads correctly |
|2| Click Add Monitor | Modal opens |
|3| Input Name | Accepted |
|4| Input URL valid | No error |
|5| Select Method GET | Dropdown works |
|6| Set Interval=60 | Accepted |
|7| Set SLA Target=99 | Accepted |
|8| Save | Success toast |
|9| Check table | Status = ACTIVE |

---

### TC-API-002 SLA Badge Color Rendering
| uptime | SLA Target | Expected |
|-------|-------------|----------|
| 99.2 | 99 | GREEN |
| 96 | 99 | YELLOW |
| 92 | 99 | RED |
