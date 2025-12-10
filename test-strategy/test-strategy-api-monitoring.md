# Test Strategy — API Monitoring Feature

## Scope
- Create Monitor Form (UI)
- SLA Badge rendering logic
- Summary endpoint contract testing
- Negative & boundary tests
- Regression test for API Monitoring module

## Test Types
- Functional testing
- UI Validation testing
- Regression testing (5 releases)
- BDD acceptance testing (Squash)
- API Contract testing (Postman)
- Automation testing (Katalon UI + API)

## Tools
- Squash TM (100+ BDD test cases)
- Jira (bug tracking)
- Postman (automation)
- Katalon Studio
- Figma (UI validation)

## Risk Mitigation
- SLA miscalculation → Add boundary tests
- Wrong badge color → UI regression
- API timeout → add 3 retry tests
