# Test Strategy — API Monitoring Feature

## Scope
- API monitor creation (UI)
- SLA badge rendering logic
- Summary endpoint validation
- Negative and boundary conditions
- Regression test coverage

## Test Types
- Functional testing
- UI validation
- Regression testing
- BDD acceptance testing (Squash)
- API contract testing (Postman)
- UI automation (Katalon)

## Tools
- Squash TM  
- Postman  
- Katalon Studio  
- Jira  
- Figma  

## Risks and Mitigation
- Incorrect SLA calculation → Include boundary tests  
- Wrong badge UI color → Add UI regression tests  
- API timeout → Add retry and timeout scenarios  
