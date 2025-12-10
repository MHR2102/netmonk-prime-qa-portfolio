# API Monitoring — Latency, Uptime & SLA Evaluation

## 1. Background
Netmonk Prime previously monitored API endpoint availability but lacked SLA evaluation and latency analytics.  
This feature introduces:
- Latency tracking
- Uptime calculation
- SLA evaluation
- Dashboard badge (GREEN, YELLOW, RED)

## 2. Objectives
- Create API monitoring jobs
- Track latency & uptime
- Evaluate SLA based on target value
- Display SLA badge in dashboard

## 3. User Stories

### US-001 Create API Monitor
As a DevOps engineer, I want to create a monitoring job so I can track latency and uptime.

### US-002 SLA Evaluation
As a DevOps engineer, I want SLA automatically evaluated so I can detect degraded APIs.

### US-003 SLA Badge UI
As a user, I want SLA badges so I can understand API health at a glance.

## 4. Acceptance Criteria

### AC-001 Create Monitor
- All fields mandatory: name, URL, method, interval, SLA target
- URL must be valid
- Interval > 0
- SLA target 0–100

### AC-002 SLA Logic
- uptime ≥ sla_target → GREEN  
- sla_target - 5 ≤ uptime < sla_target → YELLOW  
- uptime < sla_target - 5 → RED  

### AC-003 Summary API Contract
Endpoint: `GET /api/monitors/{id}/summary`

```json
{
  "id": "mon-001",
  "latency_avg": 124,
  "uptime": 98.1,
  "sla_status": "YELLOW",
  "sla_target": 99,
  "last_check": "2025-02-12T10:00:00Z"
}
```

## 5. Non-Functional Requirements
- API response time < 800 ms  
- Dashboard refresh < 1 second  
