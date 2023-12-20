Feature: Log In to Claims

  Scenario Outline: Member Intimate a claim.
    Given User log In to Claim Website.
    When User enters valid credentials '<Username>', and click Next Button and enter '<Password>' and clicks sign in button.



    Examples:
      | Username                | Password       |
      | idirero@clientele.co.za | Ish@cyest#2004 |