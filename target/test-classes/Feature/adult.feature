@featureAdult
Feature: Verifying adactin details
@adult
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
      | vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Double       | 1 - One   | 16/10/2020  | 16/10/2020   | 1 - One     | 1 - One         | last      | f        | paris    | 
      | vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Standard     | 2 - Two   | 16/10/2020  | 16/10/2020   | 2 - Two     | 0 - None        | last      | f        | paris    | 
      | vvenu1994 | DRVU6C   | Sydney    | Hotel Hervey   | Double       | 3 - Three | 16/10/2020  | 16/10/2020   | 3 - Three   | 1 - One         | ramesh    | f        | paris    | 
      | vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Standard     | 4 - Four  | 16/10/2020  | 16/10/2020   | 4 - Four    | 0 - None        | last      | h        | paris    | 