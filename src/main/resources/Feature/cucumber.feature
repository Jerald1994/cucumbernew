Feature: Validating the login credentials and filling details

Scenario: Fill in the required details to book a room in hotel
Given verify home page with userName and pasword tab displayed
When user shoul verify whether "<userName>", and "<pass>" can be entered
And user should click the login button after filling the username and password
Then User should verify whether page is resdirected to the next page after login

When User should select "<location>", "<hotels>", "<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>", "<adultsPerRoom>" and "<childrenPerRoom>"
And user should click the search button after filling the required details
Then user should verify whether it is directing to the next page of selecting hotel

When User should select the hotel according to need by clicking radio button
And User should click the continue button after selecting the required hotel
Then User should verify whether it is directing to the next page of booking hotel

When User should enter the mandatory fields of "<firstName>", "<lastName>","<billingAddress>","<creditCardNumber>","<creditCardType>","<expiryDate>" and "<cvvNumber>"
And User Should click the bookNow button to book the hotel
Then User should verify it is directing to the confirmation page 
And User should print the order number from the confirmation page