ResponseObject resp = WS.sendRequest(findTestObject('API/GetSummary'))
WS.verifyResponseStatusCode(resp, 200)

def json = new groovy.json.JsonSlurper().parseText(resp.responseBodyContent)

assert json.latency_avg >= 0
assert json.uptime >= 0 && json.uptime <= 100
assert ['GREEN','YELLOW','RED'].contains(json.sla_status)
