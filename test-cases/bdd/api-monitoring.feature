Feature: API Monitoring SLA & Latency

  Background:
    Given user is logged in
    And user is on the API Monitoring page

  Scenario: Create valid API monitor
    When the user fills monitor form with:
      | name       | User API Monitor             |
      | url        | https://api.company.com/user |
      | method     | GET                          |
      | interval   | 60                           |
      | sla_target | 99                           |
    And submits the form
    Then monitor is created with status "ACTIVE"

  Scenario Outline: SLA badge logic
    Given uptime is <uptime> and SLA target <target>
    When SLA engine evaluates
    Then SLA status should be <badge>

    Examples:
      | uptime | target | badge  |
      | 99.2   | 99     | GREEN  |
      | 96     | 99     | YELLOW |
      | 92     | 99     | RED    |
