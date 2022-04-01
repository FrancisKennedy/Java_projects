	Feature: verifying Adactin details

Scenario Outline: verifying Adactin login credentials

Given user is on Adactin Hotel Booking page
When user should enter "<username>" and "<password>"
And user should click the login button 
#And user should select "<location>","<hoteltype>","<roomtype>","<number of rooms>",
#"<check in date>","<check out date>","<adults per room>"and"<children per room>"
Then user should verify the success msg
Then user should select Location,Hoteltype,Roomtype,Number of Rooms,Check in date,Check out date,Adult per Room,Children per Room
Then user should click on search button
Then click logout
Then new user can click login

 Examples:
 |username			|password	|
 |franciskennedy|Keny@1395|	
 

Scenario Outline: verifying Adactin new login credentials
Given new user should enter "<username>" and "<password>"
When new user should click the login button 
And new user should verify the success msg
Then new user should select Location,Hoteltype,Roomtype,Number of Rooms,Check in date,Check out date,Adult per Room,Children per Room
Then new user should click on search button
Then new login click logout


 Examples:
 |username			|password	|
 |JafferBasha		|Jaff@123	|	

 #Paris	 |Hotel Sunshine|Super Deluxe|1							 |23/01/2022	 |24/01/2022    |2 							|2								|
 #location|hoteltype			|roomtype		 |number of rooms|check in date|check out date|adults per room|children per room|