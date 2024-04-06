@regression
Feature:Testing company information

  Scenario Outline: Happy Path
    Then User calls and validates '<message>','<name>','<email>','<phone>' from Company End point
    Examples:
      | message                               | name       | email             | phone      |
      | Application data fetched successfully | techtorial | company@email.com | 1234567891 |
