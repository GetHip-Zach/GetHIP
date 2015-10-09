GetHIP - Fall 2015
Assignment 1 - "Simple ATM"
Instructors - Zach Merrill <zach_merrill@gallup.com>
	      James Getrost <james_getrost@gallup.com>

+----Description--------------------------------------------------------------------------------------------------------+
| Huge Bank Inc. has contracted with your firm to implement the software for their new line of ATMs.             	|
| You will be writing code that will allow their customers to access accounts, make deposits and make withdrawals.	|
| Huge Bank Inc. has high expectations for quality and will be grading your software based on three criteria:    	|
|															|
|	1. All requirements must be met											|
|	2. Quality of code and comments											|
|	3. Number of bugs												|
|															|
| Programs must compile to be accepted.											|
+-----------------------------------------------------------------------------------------------------------------------+


Requirements:

	1. Upon access, users will be prompted with a PIN entry field. For this assignment you may choose your own PIN
	   since we do not have any data storage yet. You will only need to check this PIN.
		a. A correct entry will allow access to the system
		b. Incorrect entry will display an error message and the PIN entry field

	2. All users will have an account balance of $0.00 after logging in.

	2. Display a menu with three options. Users will be prompted for their choice.
		- 1. Make a deposit
		- 2. Make a withdrawal
		- 3. Exit

	3. If the first option is selected then prompt the user for a value. Add this value to the balance.

	4. If the second option is selected then prompt the user for a value. Subtract this value from the balance.
	   If the balance would be less than $0.00 then do not store the value. Display an error message and return
	   to the menu.

	5. If the third option is selected then end the program.

Notes:
	
	- Solutions to this problem should take advantage of many types of Java control statements, such as if-else
	  statements, switch statements and while loops. 

	- You do not need to worry about validating types. Assume that if you are prompting for an integer (or
	  whatever type you might be working with) that you will always get that type.

	- Comment your code! Code with comments is much easier to understand and debug.

Example output:

	Please enter your PIN:
	1234

	Incorrect PIN.
	Please enter your PIN:
	4321

	Welcome to Huge Bank Inc.
	Your balance: $0.00
	
	1. Make a deposit
	2. Make a withdrawal
	3. Exit

	Your selection: 2

	Withdrawal amount: 10.00

	Error. Not enough funds.

	Your balance: $0.00

        1. Make a deposit
        2. Make a withdrawal
        3. Exit

	Your selection: 1

	Deposit amount: 10.00

	Deposit successful.

	Your balance: $10.00

        1. Make a deposit
        2. Make a withdrawal
        3. Exit

	Your selection: 2

	Withdrawal amount: 5.00

	Withdrawal successful.

	Your balance: $5.00

        1. Make a deposit
        2. Make a withdrawal
        3. Exit

	Your selection: 3
	
	Thank you for your business!
