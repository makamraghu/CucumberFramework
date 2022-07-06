Feature: Testing OCC Application

@Smoke @reg
Scenario Outline: Verify login Functionality
Given User Navigate to Application
When Enter <UserName> and <Password> and click on Login
Then User should able to login into application
And User able to see success message
|raghu|vardhan|makam|36|10Years|
|manvith|vardhan|makam|8|student|

Examples:
|UserName|Password|
|raghu	 |vardhan |
|manvith |vardhan |

@Smoke
Scenario Outline: Verify login Functionality
Given User Navigate to Application
When Enter <UserName> and <Password> and click on Login
Then User should able to login into application
And User able to see success message
|raghu|vardhan|makam|36|10Years|
|manvith|vardhan|makam|8|student|

Examples:
|UserName|Password|
|raghu	 |vardhan |
|manvith |vardhan |