Feature: Using search field on HOME page of http://automationpractice.com/index.php site

  Is field available?
  Can you put any string in it?
  Can you see results when search phrase is approved?


  Scenario: Using search field in HOME page

    Given HOME page is open
    When I put search phrase "t-shirt" to search field and press Enter
    Then I can see search prahes results

  Scenario: Signing in to newsletter subscription

    Given Newsletter field is visible page is open
    When I put new e-mail address to newsletter field and press submit button
    Then I can see green statement

  Scenario: Redirect to social media using Follow us buttons

    Given HOME page is open and Follow us buttons are visible
    When I click a Facebook button new browser tab is open
    Then Selenium Framework Facebook page is open


  Scenario: Loging in with existing user account
    //mirek1@pl.pl,Pies1

    Given When HOME page is open
    When I click Sign in button
    And Put in e-mail address and password
    Then I'm signed in to may account

