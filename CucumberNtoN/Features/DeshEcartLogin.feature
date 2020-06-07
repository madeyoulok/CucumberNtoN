Feature: login 


Scenario: Successfull Login with valid crdentials 
	Given User open chrome browser 
	When Go to Url "http://www.advanceshoppers.com" 
	And Click on login 
	And User enters email as "nahidbabu6@outlook.com" and password as "nahid1243" 
	And Click on login button 
	Then logout button should be visible 
	When Click logout button 
	And close browser 
	
	
Scenario Outline: Login data driven 
	Given User open chrome browser 
	When Go to Url "http://www.advanceshoppers.com" 
	And Click on login 
	And User enters email as "<Email>" and password as "<Password>" 
	And Click on login button 
	Then logout button should be visible 
	When Click logout button 
	And close browser 
	
	Examples: 
		|  Email |  Password | 
		|   nahidbabu6@outlook.com  | nahid1243 |
		|   nahidbabu36@outlook.com  | nahid1243 |