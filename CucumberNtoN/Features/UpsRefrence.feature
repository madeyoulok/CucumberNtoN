Feature: UPS Reference Page


Background: 
When User open browser
Then User go to URL "https://www.ups.com/us/en/Home.page"
And User click on Tracking
And User click on Track and History
And User click on Track by Reference

@TC0001 @Regression
Scenario: Track by Freight Shipment type
When User select Freight 
Then Freight should be selected
And User closed browser

@TC0002 @Regression
Scenario: Track by Mail Innovation Shipment type
When User select Mail Innovation 
Then Mail Innovation should be selected
And User closed browser

@TC0003 @Regression
Scenario: Track by  Package Shipment type
When User select Package 
Then Package should be selected
And User closed browser

@TC0004	@Smoke
Scenario: Print the Country Destination List
When User select Destination Country or Territory
Then User should see all the country listed
And User closed browser

@TC0005 @Smoke
Scenario: Verify Bangladesh is in the list of Destination Country
When User select Destination Country or Territory
Then User should see Bangladesh on the dropdown list
And User closed browser



