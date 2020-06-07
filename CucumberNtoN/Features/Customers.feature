Feature: Customer 



Scenario: Add a new customer 
	Given User open chrome browser 
	When  Go to Url "https://www.advanceshoppers.com/admin" 
	And User enters email as "bdsynchronise@gmail.com" and password as "123456" 
	And Click on Admin login button 
	Then User can view Deshbord 
	And Click on Customers 
	And Click on Add New Customer 
	Then User can view Add Customer page 
	And User enter customer info 
	Then User view the Add Adress page
	And Click on Add Address Button
	And User enter Address info
	Then User view the Add Adress page
	And Click on Save Button 
	And close browser
	
	
	
         