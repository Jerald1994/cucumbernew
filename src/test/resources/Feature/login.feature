Feature: Verifying adactin details

  Scenario Outline: verifying adactin login details with valid credentials
    #  Given User is on the adactin page'
    #When User should enter "<userName>" and "<passWord>" a
    #And User should click the login button
    #Then User should verify the msg'
    #When user entered in search hotel page should select "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutdate>","<adultsPerRoom>","<childPerRoom>"
    #And user should click the search button
    #When user entered into search hotel page
    #When user entered hotel page click the radio button
    #And click continue button
    #Then user entered in book a hotel page
    #When user  should enter "<firstame>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<exipryMonth>","<exipryYear>","<cvvNo>"
    #And click the book now button
    #Then user entered into conformation page get the order no
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
      | vvenu1994 | DRVU6C   | Sydney    | Hotel Sunshine | Standard     | 1 - One   | 16/10/2020  | 17/10/2020   | 4 - Four    | 0 - None        | venu      | s        | fdghs    |
      #| vvenu1994 | DRVU6C   | Melbourne | Hotel Cornice  | Double       | 1 - One   | 17/10/2020  | 21/10/2020   | 2 - Two     | 0 - None        | raj       | d        | adayar   | 0123456789987456 | VISA             | March       |       2021 |   372 |
      #| vvenu1994 | DRVU6C   | Brisbane  | Hotel Hervey   | Deluxe       | 1 - One   | 20/10/2020  | 25/10/2020   | 3 - Three   | 3 - Three       | anil      | c        | chrompet | 0123456789987456 | Master Card      | September   |       2022 |   452 |
      #| vvenu1994 | DRVU6C   | New York  | Hotel Creek    | Super Deluxe | 1 - One   | 18/10/2020  | 19/10/2020   | 2 - Two     | 0 - None        | array     | s        | chennai  | 0123456789987456 | VISA             | July        |       2021 |   253 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Standard     | 1 - One   | 16/10/2020  | 16/10/2020   | 3 - Three   | 4 - Four        | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Sunshine | Deluxe       | 1 - One   | 16/10/2020  | 16/10/2020   | 2 - Two     | 4 - Four        | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Brisbane  | Hotel Hervey   | Standard     | 1 - One   | 16/10/2020  | 16/10/2020   | 4 - Four    | 3 - Three       | last      | l        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Cornice  | Double       | 3 - Three | 16/10/2020  | 16/10/2020   | 2 - Two     | 1 - One         | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | New York  | Hotel Creek    | Standard     | 1 - One   | 16/10/2020  | 16/10/2020   | 3 - Three   | 0 - None        | sad       | i        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Hervey   | Standard     | 2 - Two   | 16/10/2020  | 16/10/2020   | 2 - Two     | 1 - One         | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | New York  | Hotel Hervey   | Deluxe       | 3 - Three | 16/10/2020  | 16/10/2020   | 2 - Two     | 0 - None        | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Brisbane  | Hotel Creek    | Super Deluxe | 4 - Four  | 16/10/2020  | 16/10/2020   | 2 - Two     | 3 - Three       | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Hervey   | Standard     | 5 - Five  | 16/10/2020  | 16/10/2020   | 2 - Two     | 0 - None        | last      | h        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Sunshine | Standard     | 6 - Six   | 16/10/2020  | 16/10/2020   | 2 - Two     | 0 - None        | sam       | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Sydney    | Hotel Creek    | Double       | 7 - Seven | 16/10/2020  | 16/10/2020   | 2 - Two     | 0 - None        | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Standard     | 8 - Eight | 16/10/2020  | 16/10/2020   | 2 - Two     | 1 - One         | last      | s        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Sunshine | Standard     | 9 - Nine  | 16/10/2020  | 16/10/2020   | 2 - Two     | 0 - None        | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | New York  | Hotel Creek    | Standard     | 10 - Ten  | 16/10/2020  | 16/10/2020   | 2 - Two     | 0 - None        | rest      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Double       | 1 - One   | 16/10/2020  | 16/10/2020   | 1 - One     | 1 - One         | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Standard     | 2 - Two   | 16/10/2020  | 16/10/2020   | 2 - Two     | 0 - None        | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Sydney    | Hotel Hervey   | Double       | 3 - Three | 16/10/2020  | 16/10/2020   | 3 - Three   | 1 - One         | ramesh    | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Standard     | 4 - Four  | 16/10/2020  | 16/10/2020   | 4 - Four    | 0 - None        | last      | h        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Hervey   | Deluxe       | 5 - Five  | 16/10/2020  | 16/10/2020   | 2 - Two     | 1 - One         | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | New York  | Hotel Creek    | Super Deluxe | 6 - Six   | 16/10/2020  | 16/10/2020   | 3 - Three   | 1 - One         | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Sunshine | Standard     | 7 - Seven | 16/10/2020  | 16/10/2020   | 2 - Two     | 2 - Two         | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Deluxe       | 8 - Eight | 16/10/2020  | 16/10/2020   | 2 - Two     | 3 - Three       | west      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | New York  | Hotel Sunshine | Standard     | 9 - Nine  | 16/10/2020  | 16/10/2020   | 3 - Three   | 4 - Four        | last      | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Sydney    | Hotel Creek    | Super Deluxe | 10 - Ten  | 16/10/2020  | 16/10/2020   | 2 - Two     | 0 - None        | sam       | a        | paris    | 0123456789987456 | American Express | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Creek    | Super Deluxe | 6 - Six   | 16/10/2020  | 16/10/2020   | 2 - Two     | 1 - One         | last      | f        | paris    | 0123456789987456 | VISA             | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Paris     | Hotel Sunshine | Standard     | 7 - Seven | 16/10/2020  | 16/10/2020   | 3 - Three   | 2 - Two         | daniel    | f        | paris    | 0123456789987456 | Master Card      | May         |       2022 |   123 |
      #| vvenu1994 | DRVU6C   | Sydney    | Hotel Sunshine | Deluxe       | 8 - Eight | 16/10/2020  | 16/10/2020   | 2 - Two     | 3 - Three       | last      | w        | paris    | 0123456789987456 | Other            | May         |       2022 |   123 |
