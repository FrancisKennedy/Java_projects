$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AdactinBooking.feature");
formatter.feature({
  "name": "verifying Adactin details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verifying Adactin login credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on Adactin Hotel Booking page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify the success msg",
  "keyword": "Then "
});
formatter.step({
  "name": "user should select Location,Hoteltype,Roomtype,Number of Rooms,Check in date,Check out date,Adult per Room,Children per Room",
  "keyword": "Then "
});
formatter.step({
  "name": "user should click on search button",
  "keyword": "Then "
});
formatter.step({
  "name": "click logout",
  "keyword": "Then "
});
formatter.step({
  "name": "new user can click login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "franciskennedy",
        "Keny@1395"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying Adactin login credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on Adactin Hotel Booking page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefine.user_is_on_facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"franciskennedy\" and \"Keny@1395\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefine.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefine.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify the success msg",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefine.user_should_verify_the_success_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select Location,Hoteltype,Roomtype,Number of Rooms,Check in date,Check out date,Adult per Room,Children per Room",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefine.user_should_select_Location_Hoteltype_Roomtype_Number_of_Rooms_Check_in_date_Check_out_date_Adult_per_Room_Children_per_Room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefine.user_should_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click logout",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefine.click_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new user can click login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefine.new_user_can_click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verifying Adactin new login credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "new user should enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "new user should click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "new user should verify the success msg",
  "keyword": "And "
});
formatter.step({
  "name": "new user should select Location,Hoteltype,Roomtype,Number of Rooms,Check in date,Check out date,Adult per Room,Children per Room",
  "keyword": "Then "
});
formatter.step({
  "name": "new user should click on search button",
  "keyword": "Then "
});
formatter.step({
  "name": "new login click logout",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "JafferBasha",
        "Jaff@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying Adactin new login credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "new user should enter \"JafferBasha\" and \"Jaff@123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefine.new_user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new user should click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefine.new_user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new user should verify the success msg",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefine.new_user_should_verify_the_success_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new user should select Location,Hoteltype,Roomtype,Number of Rooms,Check in date,Check out date,Adult per Room,Children per Room",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefine.new_user_should_select_Location_Hoteltype_Roomtype_Number_of_Rooms_Check_in_date_Check_out_date_Adult_per_Room_Children_per_Room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new user should click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefine.new_user_should_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "new login click logout",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefine.new_login_click_logout()"
});
formatter.result({
  "status": "passed"
});
});