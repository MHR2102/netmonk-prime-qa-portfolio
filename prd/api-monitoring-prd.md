# PRD: API Monitoring — Latency, Uptime & SLA Evaluation
Based on real QA responsibilities as SQA Automation & Manual Intern at PT Telkom Indonesia (2025)

## 1. Background
Netmonk Prime previously monitored API endpoint availability, but lacked SLA evaluation and latency analytics.  
This feature adds:
- Latency tracking
- Uptime calculation
- SLA evaluation engine
- UI badge for GREEN/YELLOW/RED status

## 2. Objectives
- Allow users to create API monitoring jobs
- Track latency every interval
- Calculate uptime %
- Evaluate SLA status based on SLA Target
- Display SLA badge in dashboard

## 3. User Stories

### US-001 Create API Monitor
As a DevOps engineer, I want to create a monitoring job so I can track latency & uptime.

### US-002 SLA Evaluation
As a DevOps engineer, I want SLA calculated automatically so I can detect issues fast.

### US-003 UI Visualization
As a user, I want SLA badges so I can instantly identify API health.

## 4. Acceptance Criteria

### AC-001 Create Monitor
- Name, URL, method, interval, SLA target are required
- Invalid URL → show error
- Interval must be > 0
- SLA Target must be 0–100

### AC-002 SLA Logic
If uptime ≥ sla_target → GREEN  
If uptime ≥ sla_target - 5 → YELLOW  
Else → RED  

### AC-003 API Contract — Summary Endpoint
GET /api/monitors/{id}/summary

```json
{
  "id": "mon-001",
  "latency_avg": 124,
  "uptime": 98.1,
  "sla_status": "YELLOW",
  "last_check": "2025-02-12T10:00:00Z"
}
