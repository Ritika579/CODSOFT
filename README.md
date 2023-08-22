# CODSOFT
#JAVA_DEVELOPMENT_INTERNSHIP

This repository contains 3 projects which are mentioned below...

Certainly! Here's a README file generated based on the provided code:

---
## TASK 1
# Number Guessing Game

This Java program implements a simple number guessing game. The player has a limited number of chances to guess a randomly generated secret number. After each guess, the program provides feedback to help the player narrow down their choices.

## Table of Contents

- [Description](#description)
- [Usage](#usage)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [Acknowledgments](#acknowledgments)

## Description

This Java program simulates a number guessing game where the player has to guess a secret number. Here's how the program works:

1. A random secret number between 1 and 100 is generated using a `Random` object.
2. The player is given a maximum number of chances (default: 10) to guess the number correctly.
3. After each guess, the program provides feedback whether the guessed number is higher or lower than the secret number.
4. If the player guesses the correct number within the allowed chances, they win and their score is calculated.
5. The player can choose to play the game again.

## Usage

1. Compile the Java code using a Java compiler.

2. Run the compiled program:

   java NumberGuess

3. Follow the prompts to play the nunumber-guessingame.

## Installation

1. Clone or download this repository to your local machine.

2. Compile the Java code using a Java compiler:

   ```
   javac NumberGuess.java
   ```
## TASK 2
# Word Count and Frequency Analyzer

This Java program reads a text input from the user, analyzes the word count, and provides information about non-stop words, unique words, and word frequency statistics. It also identifies and excludes common stop words from the analysis.

## Table of Contents

- [Description](#description)
- [Usage](#usage)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [Acknowledgments](#acknowledgments)

## Description

This Java program utilizes a Scanner to input text from the user. It then performs the following tasks:

1. Splits the input text into an array of words using regular expressions.
2. Counts the total number of words in the input.
3. Identifies and excludes common stop words from the analysis.
4. Calculates the count of non-stop words.
5. Generates a word frequency map for non-stop words.
6. Displays the total word count, non-stop word count, unique word count, and word frequency statistics.

## Usage

1. Compile the Java code using a Java compiler.

2. Run the compiled program:

   ```
   java CountingWords
   ```

3. Follow the prompts to input your text.

## Installation

1. Clone or download this repository to your local machine.

2. Compile the Java code using a Java compiler:

   ```
   javac CountingWords.java
   ```
   ## TASK 3
# ATM Machine Simulation

This Java program simulates an ATM (Automated Teller Machine) that allows users to perform various banking operations, such as withdrawing money, depositing money, checking account balance, and exiting the ATM. The program includes classes for handling user accounts, an ATM interface, and a main class to run the simulation.

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Usage](#usage)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [Acknowledgments](#acknowledgments)

## Description

This Java program consists of several classes:

1. **Account:** A class representing a user's bank account. It contains methods to get the account balance, withdraw money, and deposit money.

2. **ATM:** A class representing the ATM interface. It provides options for users to interact with their accounts, including withdrawing, depositing, checking balances, and exiting the ATM.

3. **ATMmachine:** The main class that initializes a user account with an initial balance of $1000 and creates an instance of the `ATM` class to start the ATM simulation.

## Features

- User authentication using a PIN number.
- Withdraw money from the account.
- Deposit money into the account.
- Check the account balance.
- Exit the ATM simulation.

## Usage

1. Compile the Java code using a Java compiler.

2. Run the compiled program:

   ```
   java ATMmachine
   ```

3. Follow the prompts to interact with the ATM simulation. You will be asked to enter a PIN number for authentication and then given options to perform various banking operations.

## Installation

1. Clone or download this repository to your local machine.

2. Compile the Java code using a Java compiler:

   ```
   javac ATMmachine.java
   ```
