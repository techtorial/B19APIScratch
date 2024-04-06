@regression
Feature: Testing General App Information

  Scenario Outline:
    Then User validates '<message>','<companyName>','<companyEmail>', and '<companyWebsite>' from App Response
    Examples:
      | message                               | companyName | companyEmail      | companyWebsite                |
      | Application data fetched successfully | techtorial  | company@email.com | https://techtorialacademy.com |