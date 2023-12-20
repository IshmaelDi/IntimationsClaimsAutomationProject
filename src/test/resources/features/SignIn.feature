Feature: Log In to Claims

  Scenario Outline: Member Intimate a claim.
    Given User log In to Claim Website.
    When User enters valid credentials '<Username>', and click Next Button and enter '<Password>' and clicks sign in button.
    When Navigate to Information Board, click and enter '<IDPassportNumber>' and click Search Button for results.



    Examples:
      | Username                | Password       | IDPassportNumber |
      | idirero@clientele.co.za | Ish@cyest#2004 | 5903175359082    |