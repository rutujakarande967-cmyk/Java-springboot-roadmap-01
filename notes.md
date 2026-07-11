## ROADMAP ##

## DAY 01 ##

here is your day 1

Day 1 Plan
Goal

Understand:

Java setup
Variables
Data Types
Basic Input/Output
Git basics

Expected time: 2–3 hours

Task 1: Setup Environment

Install:

JDK 21 (or 17)
IntelliJ IDEA Community Edition
Git
GitHub Account

Verify:

java --version
git --version

Take screenshots if needed.

Task 2: Create GitHub Repository

Repository Name:

java-springboot-roadmap

Structure:

java-springboot-roadmap
|
├── day-01
│   └── BasicJava.java
|
└── README.md

README:

# Java Spring Boot Roadmap

Learning Java and Spring Boot from scratch.

## Progress

- Day 01: Variables & Data Types
  Task 3: Learn Variables & Data Types

Understand:

int
double
float
char
boolean
String
long

Example:

public class BasicJava {
public static void main(String[] args) {

        int age = 25;
        double salary = 50000.50;
        char grade = 'A';
        boolean isJavaFun = true;
        String name = "John";

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(grade);
        System.out.println(isJavaFun);
    }
}

Run it successfully.

Task 4: Small Problems

Create separate classes for each problem.

Problem 1

Print:

Hello Java
Problem 2

Store your:

Name
Age
City

and print them.

Problem 3

Create two numbers and print:

Addition
Subtraction
Multiplication
Division

Example:

int a = 10;
int b = 5;

Output:

Addition: 15
Subtraction: 5
Multiplication: 50
Division: 2
Problem 4

Convert Celsius to Fahrenheit

Formula:

(F × 9/5) + 32

Example:

double celsius = 25;

Expected:

77.0
Problem 5

Calculate Simple Interest

Formula:

(P * R * T) / 100

Example:

P = 1000
R = 5
T = 2

Expected:

100
Task 5: Git Practice

Initialize repository:

git init

Add files:

git add .

Commit:

git commit -m "Day 1 - Variables and Data Types"

Connect GitHub:

git remote add origin <github-repo-url>

Push:

git branch -M main
git push -u origin main
Task 6: End-of-Day Reflection

Create a file:

day-01/notes.md

Write:

## Day 1 Learnings

- Installed Java
- Installed Git
- Created GitHub repository
- Learned variables
- Learned primitive data types
- Solved 5 basic problems

Challenges:
- ___________

Next:
- Input from user
- Operators
- If-Else
  Day 1 Deliverables

By the end of today, your GitHub should contain:

java-springboot-roadmap
|
├── day-01
│   ├── HelloJava.java
│   ├── PersonalInfo.java
│   ├── Calculator.java
│   ├── CelsiusToFahrenheit.java
│   ├── SimpleInterest.java
│   └── notes.md
|
└── README.md

And at least 1 Git commit pushed to GitHub.


## DAY 02 ##

Java Spring Boot Roadmap – Day 2

Goal of Day 2

By the end of Day 2, you should be able to:

Take input from the user using Scanner

Store values in variables

Perform mathematical calculations

Display formatted output

Understand the flow: Input → Processing → Output



---

Topic: Scanner Class (User Input)

Learn how to take input from the user using:

Scanner sc = new Scanner(System.in);

Useful methods:

nextInt()
nextDouble()
nextLine()


---

Programs to Practice

1. Area of Circle

Goal

Take the radius from the user and calculate the area.

Formula

Area = π × r × r

Clues

Use Scanner to get the radius.

Store the radius in a double.

Create:

double pi = 3.14159;

Calculate area using the formula.

Print the result.


Example Output

Enter radius: 5

Area = 78.53975


---

2. Area of Rectangle

Goal

Calculate the area using length and width.

Formula

Area = length × width

Clues

Take length and width as input.

Store them in variables.

Multiply them.

Print the area.


Example Output

Enter length: 10
Enter width: 5

Area = 50


---

3. Swap Two Numbers

Goal

Exchange the values of two variables.

Example

Before:

a = 10
b = 20

After:

a = 20
b = 10

Clues

Use a temporary variable:

temp ← a
a ← b
b ← temp


---

4. Age After 10 Years

Goal

Find the future age of a person.

Formula

Future Age = Current Age + 10

Clues

Take age as input.

Add 10.

Display the result.


Example Output

Enter age: 22

Age after 10 years = 32


---

5. Kilometer to Meter Converter

Goal

Convert kilometers into meters.

Formula

1 km = 1000 meters

Clues

Take kilometers as input.

Multiply by 1000.

Print meters.


Example Output

Enter KM: 5

Meters = 5000


---

6. Rupees to Dollars Converter

Goal

Convert Indian Rupees into US Dollars.

Clues

Take amount in rupees.

Create an exchange rate variable.


Example:

double rate = 85.0;

Formula

Dollars = Rupees / Rate

Example Output

Enter Rupees: 850

Dollars = 10


---

7. Average of Three Numbers

Goal

Find the average of three numbers.

Formula

Average = (a + b + c) / 3

Clues

Take three numbers as input.

Add them.

Divide by 3.

Use double for accurate results.


Example Output

10
20
30

Average = 20


---

Bonus Challenge – Student Information System

Goal

Create a program that takes:

Name

Age

Marks


And displays a formatted report.

Example Output

----- Student Report -----

Name  : Rutuja Karande
Age   : 25
Marks : 85

--------------------------

Hint

Use:

nextLine()
nextInt()
nextDouble()


---

Day 2 Rules

✅ Write every program yourself.

✅ Add comments explaining the logic.

✅ Run and verify the output.

✅ Create a package named:

Day_02

✅ Save each program in a separate class.

✅ Push all Day 2 programs to GitHub.


---

Expected Learning Outcome

After Day 2, you should be comfortable with:

Variables

Data Types

Scanner Class

User Input

Mathematical Calculations

Basic Java Program Structure

## DAY 03 ##

# Java Spring Boot Roadmap – Day 3

## Goal of Day 3

By the end of Day 3, you should be able to:

* Understand how programs make decisions.
* Use comparison operators.
* Work with `if`, `if-else`, and `if-else-if`.
* Use logical operators (`&&`, `||`, `!`).
* Solve real-world decision-making problems.

---

## Topic: Decision Making in Java

A program often needs to choose between multiple actions.

Example:

```java
if(marks >= 40){
    System.out.println("Pass");
}
else{
    System.out.println("Fail");
}
```

The program checks a condition and decides what to do.

---

## Comparison Operators

| Operator | Meaning                  |
| -------- | ------------------------ |
| ==       | Equal to                 |
| !=       | Not Equal to             |
| >        | Greater than             |
| <        | Less than                |
| >=       | Greater than or Equal to |
| <=       | Less than or Equal to    |

Example:

```java
age >= 18
marks < 40
salary == 50000
```

These expressions always return either:

```java
true
false
```

---

## Logical Operators

### AND (&&)

Both conditions must be true.

Example:

```java
age >= 18 && age <= 60
```

---

### OR (||)

At least one condition must be true.

Example:

```java
day == 6 || day == 7
```

---

### NOT (!)

Reverses the result.

Example:

```java
!isLoggedIn
```

---

# Programs to Practice

## 1. Positive, Negative, or Zero

### Goal

Determine whether a number is positive, negative, or zero.

### Clues

* Take a number as input.
* Check:

    * number > 0
    * number < 0
    * otherwise zero
* Use:

    * if
    * else if
    * else

### Example Output

```text
Enter Number: -5

Negative Number
```

---

## 2. Even or Odd Number

### Goal

Determine whether a number is even or odd.

### Clues

Use the modulus operator:

```java
number % 2
```

Think:

```text
Remainder = 0 → Even
Remainder ≠ 0 → Odd
```

### Example Output

```text
Enter Number: 8

Even Number
```

---

## 3. Voting Eligibility Checker

### Goal

Check whether a person is eligible to vote.

### Rule

```text
Age >= 18 → Eligible
Age < 18 → Not Eligible
```

### Example Output

```text
Enter Age: 17

Not Eligible to Vote
```

---

## 4. Largest of Two Numbers

### Goal

Find the larger number between two numbers.

### Clues

Compare:

```java
a > b
```

### Example Output

```text
Enter First Number: 10
Enter Second Number: 20

20 is Larger
```

---

## 5. Pass or Fail

### Goal

Check whether a student has passed.

### Rule

```text
Marks >= 40 → Pass
Marks < 40 → Fail
```

### Example Output

```text
Enter Marks: 35

Fail
```

---

## 6. Grade Calculator

### Goal

Assign grades based on marks.

### Rules

```text
90 and above → A+
75 - 89      → A
60 - 74      → B
40 - 59      → C
Below 40     → Fail
```

### Clues

Use:

```java
if
else if
else
```

### Example Output

```text
Enter Marks: 82

Grade A
```

---

## 7. Largest of Three Numbers

### Goal

Find the largest among three numbers.

### Clues

Use logical operators:

```java
a > b && a > c
```

Check all possibilities.

### Example Output

```text
Enter Numbers:
10
25
15

25 is Largest
```

---

## Bonus Challenge 1 – Login Simulation

### Goal

Verify username and password.

### Given

```java
String username = "admin";
String password = "1234";
```

### Task

Take username and password from the user.

If both match:

```text
Login Successful
```

Otherwise:

```text
Invalid Credentials
```

### Hint

For String comparison use:

```java
username.equals(inputUsername)
```

---

## Bonus Challenge 2 – ATM Withdrawal Checker

### Goal

Check whether a withdrawal can be performed.

### Rules

* Balance = ₹10,000
* User enters withdrawal amount.
* If amount is less than or equal to balance:

    * Withdrawal Successful
    * Show remaining balance
* Otherwise:

    * Insufficient Balance

### Example Output

```text
Balance: 10000

Enter Withdrawal Amount: 3000

Withdrawal Successful
Remaining Balance: 7000
```

---

## Day 3 Rules

✅ Write every program yourself.

✅ Add comments explaining the logic.

✅ Use Scanner for user input.

✅ Run and verify the output.

✅ Create a package named:

```java
Day_03
```

✅ Save each program in a separate class.

✅ Push all programs to GitHub.

---

## Expected Learning Outcome

After Day 3, you should be comfortable with:

* Boolean values (`true` / `false`)
* Comparison operators
* Logical operators
* if statements
* if-else statements
* if-else-if ladder
* Decision-making logic
* Real-world condition-based programs

### Next Milestone

Day 4 – Switch Statements, Nested Conditions, and Real-World Menu Driven Programs.

## DAY 04 ##

# Java Spring Boot Roadmap – Day 4

## Goal of Day 4

By the end of Day 4, you should be able to:

* Understand the purpose of the `switch` statement.
* Differentiate between `if-else` and `switch`.
* Build menu-driven console applications.
* Combine concepts learned from Day 1 to Day 3.
* Improve problem-solving using real-world scenarios.

---

# Topic: Switch Statement

The `switch` statement is used when you have multiple fixed choices.

Instead of writing:

```java
if(choice == 1){
    ...
}
else if(choice == 2){
    ...
}
else if(choice == 3){
    ...
}
```

You can write:

```java
switch(choice){

    case 1:
        // code
        break;

    case 2:
        // code
        break;

    default:
        // code
}
```

---

## When Should We Use Switch?

Use `switch` when:

* The user chooses from a menu.
* Fixed options are available.
* Multiple `if-else` conditions compare the same variable.

### Real-World Examples

* ATM Menu
* Restaurant Menu
* Calculator Operations
* Language Selection
* Mobile Recharge Plans
* Ticket Booking Categories

---

## Understanding `break`

The `break` statement stops the execution of the current case.

Without `break`, Java continues executing the next cases.

Example:

```java
case 1:
    System.out.println("One");

case 2:
    System.out.println("Two");
```

Output for choice = 1

```text
One
Two
```

Now add `break`.

```java
case 1:
    System.out.println("One");
    break;
```

Output:

```text
One
```

---

# Programs to Practice

## 1. Simple Calculator

### Goal

Perform Addition, Subtraction, Multiplication and Division using a menu.

### Clues

* Take two numbers.
* Ask the user to choose an operation.
* Use `switch(choice)`.
* Perform the selected operation.

### Example

```text
1. Addition
2. Subtraction
3. Multiplication
4. Division
```

---

## 2. Day Finder

### Goal

Print the day name using numbers.

### Clues

Use:

```text
1 → Monday
2 → Tuesday
3 → Wednesday
4 → Thursday
5 → Friday
6 → Saturday
7 → Sunday
```

If the number is not between 1–7, print:

```text
Invalid Day
```

---

## 3. Month Finder

### Goal

Display the month name.

### Clues

Map:

```text
1 → January

2 → February

...

12 → December
```

Otherwise:

```text
Invalid Month
```

---

## 4. Restaurant Menu

### Goal

Display the price of the selected food.

### Menu

```text
1. Pizza
2. Burger
3. Sandwich
4. Coffee
5. Tea
```

### Clues

Use switch.

Print the selected item and its price.

---

## 5. Grade Description

### Goal

Take a character grade.

### Example

```text
A
B
C
D
F
```

### Output

```text
A → Excellent
B → Very Good
C → Good
D → Average
F → Fail
```

Hint:

Take input as a `char`.

---

## 6. Even or Odd using Switch

### Goal

Determine whether a number is even or odd.

### Clues

Find the remainder:

```java
number % 2
```

Possible values are only:

```text
0
1
```

Use these values inside `switch`.

---

## 7. ATM Menu (Mini Project)

### Goal

Create a simple ATM.

Initial Balance:

```text
₹10,000
```

Menu

```text
1. Check Balance

2. Deposit

3. Withdraw

4. Exit
```

### Clues

Use `switch` for menu selection.

Use `if` before withdrawal.

If withdrawal amount is greater than balance:

```text
Insufficient Balance
```

Otherwise:

Update balance.

---

# Assignment 1 – Student Utility System

## Goal

Combine everything learned till Day 3.

Menu:

```text
1. Check Pass or Fail

2. Calculate Grade

3. Voting Eligibility

4. Exit
```

### Clues

Use:

* Scanner
* switch
* if-else

The menu decides which task to perform.

---

# Assignment 2 – Utility Calculator

Create one program that contains:

```text
1. Area of Circle

2. Area of Rectangle

3. Kilometer to Meter

4. Celsius to Fahrenheit

5. Average of Three Numbers

6. Exit
```

### Goal

Reuse the mathematical formulas from Day 1 and Day 2.

Use `switch` to decide which calculation to perform.

---

# Mini Project 1 – Smart Banking System

## Goal

Combine everything from Day 1 to Day 4.

Features:

```text
===== Welcome to ABC Bank =====

1. Check Balance

2. Deposit Money

3. Withdraw Money

4. Simple Interest Calculator

5. Account Details

6. Exit
```

### Concepts Used

✅ Variables

✅ Scanner

✅ Mathematical Calculations

✅ if-else

✅ switch

### Hint

Store:

```text
Account Holder Name

Account Number

Current Balance
```

For withdrawal:

```text
If balance is sufficient

↓

Withdraw

Else

↓

Print Insufficient Balance
```

---

# Mini Project 2 – Student Management System

## Goal

Create a console application.

Input:

* Student Name
* Roll Number
* Marks

Menu

```text
1. Show Student Details

2. Calculate Grade

3. Pass/Fail

4. Age After 10 Years

5. Exit
```

### Concepts Used

* Variables
* Scanner
* if-else
* switch
* Mathematical Operators

---

# Thinking Challenge

Before writing any code, answer these questions:

1. Should I use `if` or `switch`?
2. What inputs does my program need?
3. What processing should happen?
4. What output should be displayed?
5. Can I break the problem into smaller steps?

If you can answer these five questions, writing the code becomes much easier.

---

# Day 4 Rules

✅ Write every program yourself.

✅ Use meaningful variable names.

✅ Add comments explaining the logic.

✅ Test every menu option.

✅ Handle invalid user choices using `default`.

✅ Create a package:

```java
Day_04
```

✅ Save each program in a separate class.

✅ Push all programs to GitHub.

---

# Expected Learning Outcome

After Day 4, you should be comfortable with:

* switch statement
* case and default
* break statement
* Menu-driven applications
* Combining switch with if-else
* Building small console-based projects
* Applying all concepts from Day 1 to Day 4 in a single application

## Next Milestone

**Day 5 – Loops (`for`, `while`, `do-while`)**

You'll learn how to repeat tasks efficiently, build pattern programs, generate tables, calculate sums, and solve many coding interview problems without writing repetitive code.

## DAY 05 ##

# Java Spring Boot Roadmap – Day 5

## Goal of Day 5

By the end of Day 5, you should be able to:

* Understand why loops are needed.
* Use `for`, `while`, and `do-while` loops.
* Know when to use each type of loop.
* Avoid writing repetitive code.
* Solve beginner-level pattern and number problems.
* Build a console application using everything learned from Day 1 to Day 5.

---

# Topic: Loops in Java

Imagine printing:

```text
Welcome to Java
```

10 times.

Without loops, you would write:

```java
System.out.println("Welcome to Java");
System.out.println("Welcome to Java");
System.out.println("Welcome to Java");
// ...
```

This is repetitive and inefficient.

Loops solve this problem by repeating code automatically.

---

# Types of Loops

## 1. for Loop

### Best Used When

You already know how many times the loop should run.

### Syntax

```java
for(initialization; condition; update){
    // code
}
```

### Real-World Examples

* Print numbers from 1 to 100.
* Generate multiplication tables.
* Calculate the sum of numbers.
* Display menu options repeatedly.

---

## 2. while Loop

### Best Used When

You don't know exactly how many times the loop should run.

The loop continues until a condition becomes false.

### Syntax

```java
while(condition){
    // code
}
```

### Real-World Examples

* Login attempts.
* ATM menu until the user exits.
* Reading user input until "Exit" is entered.

---

## 3. do-while Loop

### Best Used When

The code should execute at least once, even if the condition is false.

### Syntax

```java
do{
    // code
}while(condition);
```

### Real-World Examples

* Game menu.
* ATM system.
* Continue shopping?
* Continue ordering food?

---

# Programs to Practice

## 1. Print Numbers from 1 to 10

### Goal

Print numbers from 1 to 10 using a `for` loop.

### Clues

* Start from 1.
* Stop at 10.
* Increase by 1.

---

## 2. Print Numbers from 10 to 1

### Goal

Print numbers in reverse order.

### Clues

* Start at 10.
* Decrease until 1.

---

## 3. Multiplication Table

### Goal

Print the multiplication table of a user-entered number.

### Example

```text
Enter Number: 5

5 × 1 = 5
5 × 2 = 10
...
5 × 10 = 50
```

### Clues

* Take a number as input.
* Run the loop 10 times.

---

## 4. Sum of First N Numbers

### Goal

Find the sum from 1 to N.

### Example

```text
Enter N: 5

Sum = 15
```

### Clues

* Create a variable `sum = 0`.
* Add each number to `sum`.

---

## 5. Factorial of a Number

### Goal

Calculate the factorial.

### Example

```text
Enter Number: 5

Factorial = 120
```

### Clues

```text
5! = 5 × 4 × 3 × 2 × 1
```

Create a variable:

```java
factorial = 1;
```

Multiply during each iteration.

---

## 6. Even Numbers Between 1 and 100

### Goal

Print only even numbers.

### Clues

Use:

```java
number % 2 == 0
```

inside the loop.

---

## 7. Odd Numbers Between 1 and 100

### Goal

Print only odd numbers.

### Hint

Use:

```java
number % 2 != 0
```

---

## 8. Count Digits in a Number

### Example

```text
Input

12345

Output

5
```

### Clues

Use:

```java
number = number / 10;
```

Count how many times the loop runs.

---

## 9. Reverse a Number

### Example

```text
Input

1234

Output

4321
```

### Clues

Use:

```java
digit = number % 10;
number = number / 10;
```

Build the reverse number step by step.

---

## 10. Guess the Number (Simple Version)

### Goal

Keep asking the user to guess until the correct number is entered.

### Hint

Use a `while` loop.

---

# Assignment 1 – Menu Driven Calculator

Create a calculator with:

```text
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
```

### Goal

* Use a `do-while` loop.
* Show the menu repeatedly until the user chooses Exit.

### Concepts Used

* Scanner
* switch
* Loops
* Mathematical Operators

---

# Assignment 2 – Student Report Generator

Take:

* Student Name
* Roll Number
* Marks for 5 Subjects

### Calculate

* Total Marks
* Average
* Grade
* Pass/Fail

### Concepts Used

* Variables
* Scanner
* Loops
* if-else
* Mathematical Operators

---

# Mini Project – Smart Banking System 2.0

## Goal

Build a menu-driven banking application using **everything you've learned from Day 1 to Day 5**.

### Menu

```text
========== Welcome to ABC Bank ==========

1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Calculate Simple Interest
5. Account Details
6. Transaction Summary
7. Exit
```

### Features

#### Account Details

Store:

* Account Holder Name
* Account Number
* Balance

#### Deposit

* Ask for deposit amount.
* Increase the balance.

#### Withdraw

* Check if balance is sufficient.
* If yes, deduct the amount.
* Otherwise, display:

    * "Insufficient Balance"

#### Simple Interest

Take:

* Principal
* Rate
* Time

Display the calculated interest.

#### Transaction Summary

Display:

* Total Deposits
* Total Withdrawals
* Current Balance

#### Exit

Display:

```text
Thank you for using ABC Bank!
```

---

## Concepts Covered

✅ Variables

✅ Data Types

✅ Scanner

✅ User Input

✅ Mathematical Calculations

✅ if-else

✅ switch

✅ for Loop

✅ while Loop

✅ do-while Loop

---

# Thinking Before Coding

Before writing any program, answer these questions:

1. What is the input?
2. What is the output?
3. What calculations are needed?
4. Which decision (`if`/`switch`) is required?
5. Do I need a loop?
6. Which loop is the best choice (`for`, `while`, or `do-while`)?

---

# Day 5 Rules

✅ Write every program yourself.

✅ Use meaningful variable names.

✅ Add comments explaining your logic.

✅ Test different inputs.

✅ Handle invalid menu options.

✅ Create a package:

```java
Day_05
```

✅ Save each program in a separate class.

✅ Push all programs to GitHub.

---

# Expected Learning Outcome

After Day 5, you should be comfortable with:

* `for` loop
* `while` loop
* `do-while` loop
* Loop control and repetition
* Solving repetitive problems efficiently
* Building interactive menu-driven applications
* Combining all concepts from Day 1 to Day 5 into a complete console application

## Next Milestone

**Day 6 – Methods (Functions) in Java**

You'll learn how to break large programs into reusable pieces of code, pass parameters, return values, and write cleaner, modular applications. This is a major step toward writing professional Java and Spring Boot applications.
