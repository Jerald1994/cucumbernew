@jerry
Feature: Verifying adactin details
    Background:
    Given User is on the adactin page'
    When User should click login after entering "<userName>" and "<password>"


  Scenario Outline: verifying adactin login details with valid credentials
    
    And user should clic login button
    

    #And User should select "<location>","<hotel>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adulPerRoom>","<childrenPerRoom>"
    #Then User should select the Hotel and continue
    #And user should enter "<firstName>","<lastName>","<address>"
    #| ccNo             | ccType           | expiryMonth | expiryYear | cvvNo |
    #| 0123456789987456 | American Express | January     |       2022 |   123 |
    #| 0123456789987456 | VISA             | March       |       2021 |   372 |
    #| 0123456789987456 | Master Card      | September   |       2022 |   452 |
    #| 0123456789987456 | VISA             | July        |       2021 |   253 |
    #Then User should book the hotel and get the confirmation Order ID
    Examples: 
      | userName  | password |
      | vvenu1994 | DRVU6C   |
      | vvenu1994 | DRVU6C   |
      
      
 
  Scenario Outline: verifying adactin login details with invalid credentials
    
    And user should clic login button
    Examples: 
      | userName  | password |
      | vvenu1994 | DR   |
      | vvenu1994 | DRVU6C   |
      
