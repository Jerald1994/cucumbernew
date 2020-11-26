@featureChild
Feature: Verifying adactin details
@child
  Scenario Outline: verifying adactin login details with valid credentials
  
   Given User is on the adactin page'
    When User should click login after entering "<userName>" and "<password>"
    And User should select "<location>","<hotel>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adulPerRoom>","<childrenPerRoom>"
    Then User should select the Hotel and continue
    And user should enter "<firstName>","<lastName>","<address>"
      | ccNo             | ccType           | expiryMonth | expiryYear | cvvNo |
      | 0123456789987456 | American Express | January     |       2022 |   123 |
      | 0123456789987456 | VISA             | March       |       2021 |   372 |
      | 0123456789987456 | Master Card      | September   |       2022 |   452 |
      | 0123456789987456 | VISA             | July        |       2021 |   253 |
    Then User should book the hotel and get the confirmation Order ID
    
    
     Examples: 
      | userName  | password | location  | hotel          | roomType     | noOfRooms | checkInDate | checkOutDate | adulPerRoom | childrenPerRoom | firstName | lastName | address  |
      | vvenu1994 | DRVU6C   | Sydney    | Hotel Creek    | Super Deluxe | 10 - Ten  | 16/10/2020  | 16/10/2020   | 2 - Two     | 0 - None        | sam       | a        | paris    | 
      | vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Super Deluxe | 6 - Six   | 16/10/2020  | 16/10/2020   | 2 - Two     | 1 - One         | last      | f        | paris    | 
      | vvenu1994 | DRVU6C   | Paris     | Hotel Sunshine | Standard     | 7 - Seven | 16/10/2020  | 16/10/2020   | 3 - Three   | 2 - Two         | daniel    | f        | paris    | 
      | vvenu1994 | DRVU6C   | Sydney    | Hotel Sunshine | Deluxe       | 8 - Eight | 16/10/2020  | 16/10/2020   | 2 - Two     | 3 - Three       | last      | w        | paris    | 
      | vvenu1994 | DRVU6C   | New York  | Hotel Sunshine | Standard     | 9 - Nine  | 16/10/2020  | 16/10/2020   | 3 - Three   | 4 - Four        | last      | f        | paris    |