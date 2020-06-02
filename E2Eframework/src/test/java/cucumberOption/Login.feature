Feature: Login into application

Scenario Outline: Possitive test validating login
Given Initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com/" site
And Click on Login link in homepage to land on secure login page
When Users enter <username> and <password> and logs in
Then Verified that user is succesfully loged in
And browser is closed

Examples:
|username                        |password     |
|prajapatishraddha375@gmail.com  |Shraddha2611 |
|sp@gmail.com                    |123          |

