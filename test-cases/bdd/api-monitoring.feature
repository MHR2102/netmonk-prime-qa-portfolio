Feature: API Monitoring SLA & Latency

  Background:
    Given the user is logged in
    And the user is on the "API Monitoring" page

  Scenario: Create a valid API monitor
    When the user clicks "Add Monitor"
    And the user fills the monitor form with:
      | name       | User API Monitor             |
      | url        | https://api.company.com/user |
      | method     | GET                          |
      | interval   | 60                           |
      | sla_target | 99                           |
    And the user submits the form
    Then the monitor appears in the table
    And the monitor status is "ACTIVE"

  Scenario Outline: SLA badge logic validation
    Given an API monitor has uptime <uptime> and SLA target <target>
    When the SLA engine evaluates the API
    Then the SLA badge shown on the dashboard should be <badge>

    Examples:
      | uptime | target | badge  |
      | 99.2   | 99     | GREEN  |
      | 96     | 99     | YELLOW |
      | 92     | 99     | RED    |

  Scenario: Summary API returns expected fields
    When the system calls the summary API for monitor "mon-001"
    Then the response contains:
      | latency_avg |
      | uptime      |
      | sla_status  |
      | last_check  |
