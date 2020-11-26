$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/hotel.feature");
formatter.feature({
  "name": "Verifying adactin details",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@featureHotel"
    }
  ]
});
formatter.scenarioOutline({
  "name": "verifying adactin login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@hoteltype"
    }
  ]
});
formatter.step({
  "name": "User is on the adactin page\u0027",
  "keyword": "Given "
});
formatter.step({
  "name": "User should click login after entering \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should select \"\u003clocation\u003e\",\"\u003chotel\u003e\",\"\u003croomType\u003e\",\"\u003cnoOfRooms\u003e\",\"\u003ccheckInDate\u003e\",\"\u003ccheckOutDate\u003e\",\"\u003cadulPerRoom\u003e\",\"\u003cchildrenPerRoom\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should select the Hotel and continue",
  "keyword": "Then "
});
formatter.step({
  "name": "user should enter \"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003caddress\u003e\"",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "ccNo",
        "ccType",
        "expiryMonth",
        "expiryYear",
        "cvvNo"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "American Express",
        "January",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "VISA",
        "March",
        "2021",
        "372"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "Master Card",
        "September",
        "2022",
        "452"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "VISA",
        "July",
        "2021",
        "253"
      ]
    }
  ]
});
formatter.step({
  "name": "User should book the hotel and get the confirmation Order ID",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "location",
        "hotel",
        "roomType",
        "noOfRooms",
        "checkInDate",
        "checkOutDate",
        "adulPerRoom",
        "childrenPerRoom",
        "firstName",
        "lastName",
        "address"
      ]
    },
    {
      "cells": [
        "vvenu1994",
        "DRVU6C",
        "Paris",
        "Hotel Sunshine",
        "Deluxe",
        "1 - One",
        "16/10/2020",
        "16/10/2020",
        "2 - Two",
        "4 - Four",
        "last",
        "f",
        "paris"
      ]
    },
    {
      "cells": [
        "vvenu1994",
        "DRVU6C",
        "Brisbane",
        "Hotel Hervey",
        "Standard",
        "1 - One",
        "16/10/2020",
        "16/10/2020",
        "4 - Four",
        "3 - Three",
        "last",
        "l",
        "paris"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying adactin login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@featureHotel"
    },
    {
      "name": "@hoteltype"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the adactin page\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "NewStep.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click login after entering \"vvenu1994\" and \"DRVU6C\"",
  "keyword": "When "
});
formatter.match({
  "location": "NewStep.user_should_click_login_after_entering_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select \"Paris\",\"Hotel Sunshine\",\"Deluxe\",\"1 - One\",\"16/10/2020\",\"16/10/2020\",\"2 - Two\",\"4 - Four\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewStep.user_should_select(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the Hotel and continue",
  "keyword": "Then "
});
formatter.match({
  "location": "NewStep.user_should_select_the_Hotel_and_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"last\",\"f\",\"paris\"",
  "rows": [
    {
      "cells": [
        "ccNo",
        "ccType",
        "expiryMonth",
        "expiryYear",
        "cvvNo"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "American Express",
        "January",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "VISA",
        "March",
        "2021",
        "372"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "Master Card",
        "September",
        "2022",
        "452"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "VISA",
        "July",
        "2021",
        "253"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "NewStep.user_should_enter(String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should book the hotel and get the confirmation Order ID",
  "keyword": "Then "
});
formatter.match({
  "location": "NewStep.user_should_book_the_hotel_and_get_the_confirmation_Order_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "verifying adactin login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@featureHotel"
    },
    {
      "name": "@hoteltype"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the adactin page\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "NewStep.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click login after entering \"vvenu1994\" and \"DRVU6C\"",
  "keyword": "When "
});
formatter.match({
  "location": "NewStep.user_should_click_login_after_entering_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select \"Brisbane\",\"Hotel Hervey\",\"Standard\",\"1 - One\",\"16/10/2020\",\"16/10/2020\",\"4 - Four\",\"3 - Three\"",
  "keyword": "And "
});
formatter.match({
  "location": "NewStep.user_should_select(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select the Hotel and continue",
  "keyword": "Then "
});
formatter.match({
  "location": "NewStep.user_should_select_the_Hotel_and_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"last\",\"l\",\"paris\"",
  "rows": [
    {
      "cells": [
        "ccNo",
        "ccType",
        "expiryMonth",
        "expiryYear",
        "cvvNo"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "American Express",
        "January",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "VISA",
        "March",
        "2021",
        "372"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "Master Card",
        "September",
        "2022",
        "452"
      ]
    },
    {
      "cells": [
        "0123456789987456",
        "VISA",
        "July",
        "2021",
        "253"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "NewStep.user_should_enter(String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should book the hotel and get the confirmation Order ID",
  "keyword": "Then "
});
formatter.match({
  "location": "NewStep.user_should_book_the_hotel_and_get_the_confirmation_Order_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});