Feature: Succecfully Login to Simplifeye

Scenario Outline: Login to Siplifeye
When user open Browser
Then user goes to "https://dashboard.simplifeye.co/login"
And user enters email as "<email>" and password as "<password>"
And user enters Login

Examples:
|email							|password			|
|khaled.mahmud199@gmail.com		|Password1234		|
