Feature: Retail Home Page

  Background: 
    Given User is on retail website

  @ShopBy1
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @ShopBy2
  Scenario Outline: Verify department sidebar options
    When User click on All section
    When User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |

  @AddtoCart
  Scenario: Verify User can add an item to cart
    When User click on Sign in option
    And User enter email 'ebrahimphantem@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @placeOrder
  Scenario: Verify User can place an order add Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'ebrahimphantem@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add Your  new Address
    Then User fill new address form with below information
      | country       | fullName       | phoneNumber | streetAddress | apt | city          | state      | zipCode |
      | United States | Ebrahim Nazami |  9168784444 | 908HomeStreet | 111 | San Francisco | California |   98076 |
    And User click Add Your Address button on cart
    And User click on add new payment
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard     | expirationMonth | expirationYear | securityCode |
      | 4812088739910018 | Ebrahim Nazami |              09 |           2024 |          701 |
    And User click on Add your card button
    And User click on Place Your Order
    Then there is a massage 'Order Placed Successfuly'

  @placeSecoundOrder
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'ebrahimphantem@tekschool.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on secound Item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then there is a massage 'Order Placed, Thanks'
