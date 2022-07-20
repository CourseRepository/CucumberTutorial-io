Feature: To use the csv file in the Scenario outline

  Scenario: To run the test from csv file
    Given I have a file

  Scenario Outline: Using the csv file to get the data
    Given I have a file <header1>

    Examples: 
     # @C:\\Data\\log\\test.csv

      | header1 | header2 |
