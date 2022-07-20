Feature: Excel Data Reader

  Scenario: User Login scenario With Excel
    Given User is at the login page of the application
    When User login with the following username and password with data in excel sheet
      | FileLocation                     | SheetName |
      | C:\\Data\\log\\MockTestData.xlsx | data      |
