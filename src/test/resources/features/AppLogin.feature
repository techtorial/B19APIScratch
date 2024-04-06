@regression
Feature: Testing Login Functionality

  Scenario Outline: Happy Path
    Then User calls and validates '<message>' from login end point call
    Examples:
      | message                |
      | Logged in successfully |