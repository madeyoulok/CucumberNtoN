$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/UpsRefrence.feature");
formatter.feature({
  "name": "UPS Reference Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User open browser",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.UpsRefrenceStep.user_open_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User go to URL \"https://www.ups.com/us/en/Home.page\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.UpsRefrenceStep.user_go_to_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Tracking",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.UpsRefrenceStep.user_click_on_Tracking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Track and History",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.UpsRefrenceStep.user_click_on_Track_and_History()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Track by Reference",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.UpsRefrenceStep.user_click_on_Track_by_Reference()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Bangladesh is in the list of Destination Country",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC0005"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User select Destination Country or Territory",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.UpsRefrenceStep.user_select_Destination_Country_or_Territory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see Bangladesh on the dropdown list",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.UpsRefrenceStep.user_should_see_Bangladesh_on_the_dropdown_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closed browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.UpsRefrenceStep.user_closed_browser()"
});
formatter.result({
  "status": "passed"
});
});