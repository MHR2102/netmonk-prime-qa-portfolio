# Squash Test Case — Create API Monitor

## Preconditions
- User is logged in
- API Monitoring page accessible

## Steps
| # | Action | Data | Expected |
|---|--------|------|----------|
|1| Click "Add Monitor" | — | Modal displayed |
|2| Input Name | User API Monitor | Valid |
|3| Input URL | https://api.company.com/user | Valid |
|4| Select Method | GET | Selected |
|5| Input Interval | 60 | Accepted |
|6| Input SLA Target | 99 | Accepted |
|7| Click Save | — | Toast success; row appears |
