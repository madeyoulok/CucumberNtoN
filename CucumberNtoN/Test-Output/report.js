$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Customers.feature");
formatter.feature({
  "name": "Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a new customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User open chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.ValidLogin.user_open_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to Url \"https://www.advanceshoppers.com/admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.ValidLogin.go_to_Url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email as \"bdsynchronise@gmail.com\" and password as \"123456\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.ValidLogin.user_enters_email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Admin login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.ValidLogin.click_on_Admin_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Deshbord",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.ValidLogin.user_can_view_Deshbord()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customers",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.ValidLogin.click_on_Customers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add New Customer",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.ValidLogin.click_on_Add_New_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view Add Customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.ValidLogin.user_can_view_Add_Customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter customer info",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.ValidLogin.user_enter_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.ValidLogin.close_browser()"
});
formatter.result({
  "status": "passed"
});
});