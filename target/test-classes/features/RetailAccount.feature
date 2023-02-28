Feature: Creat Account

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'ebrahimphantem@tekschool.us' and password 'Tek@123456'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @UpdateAccount @Account
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'ebrahim' and Phone '1234567890'
    And User click on Update button
    Then user profile information should be updated

  @UpdatePassword @Account
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@12345        | Tek@123456  | Tek@123456      |
    And User click on Change Password button
    Then a Profile Update message should be displayed 'Password Updated Successfully'

  @AddPaymentMethod @Account
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4813111122253224 | Ebrahim Nazami    |              08 |           2023 |          804 |
    And User click on Add your card button
    Then an Update Payment message should be displayed 'Payment Method added sucessfully'

  @EditPaymentMethod @Account
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And User click on edit link
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4812222233334444 | Nazami     |              08 |           2026 |          890 |
    And user click on Update Your Card button
    Then a message should be displayed'Payment Method updated Successfully'

  @RemovePaymentMethod
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove link of card section
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName       | phoneNumber | streetAddress | apt | City          | state      | zipCode |
      | United States | Ebrahim Nazami |  1234567890 | 100Home st    | 234 | San Francisco | California |   95690 |
    And User click Add Your Address button
    Then an update address message should be displayed 'Address Added Successfully'

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new  update address form with below information
      | country       | fullName       | phoneNumber | streetAddress  | apt | city       | state  | zipCode |
      | United States | Nazami Ebrahim |  9876543210 | 200 Sweet Home |  56 | Sacramento | Hawaii |   90553 |
    And User click update Your Address button
    Then an edit address message should be displayed 'Address Updated Successfully'

  @Removepayment
  Scenario: Verify User can remove Debit or Credit card
    And user click on last payment
    And User click on remove option of card section
    Then payment details should be removed
