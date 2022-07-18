Feature: Automation Excersise Practice

  Scenario: Login Functionality
    Given User launch the Browser
    When User enter the Userame in User Name field
    And User enter Password in Password field
    Then User is enter the Login button

  Scenario: Search Hotel first page
    Given User chooses the Location
    When User choose the Hotel
    And User choose Room Type
    And User choose No of Rooms
    And User enter check in date
    And User enter check out date
    And User mentions no of Adults in room
    And User mentions no fo child in room
    Then User is enter the Submit button

  Scenario: Search Hotel second page
    Given User selects the hotel
    Then User continue the booking

  Scenario: Book the hotel with personal informations
    Given User enter name in First Name field
    When User enter surname in Last Name field
    And User enter address in address field
    And User enter CreditCard number in CC number field
    And User choose type of Credit Card
    And User choose expiry month of Credit Card
    And User Choose expiry year of Credit Card
    And User enter CVV number of Credit Card
    Then User enter Book Now button

  Scenario: Conform the booking Hotel
    Given User check the detail in Booked Itinerary
    Then User enter logout
