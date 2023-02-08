@login
Feature: login to Souce home page

  @login_
  Scenario: Sucess login to Sauce home page
    Given Carlos is a Sauce Customer
    When He tries to login
    Then he should see to products list

#  Scenario Outline: Sucess login to Sauce home page
#    Given Carlos is a Sauce Customer
#    When He tries to login
#    Then he should see to products list
#
#    Examples: