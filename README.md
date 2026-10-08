# se217-oop-lab
# Java Practice

A collection of small, beginner-friendly Java programs covering core language fundamentals: variables and input, conditionals, loops, arrays, methods, and string handling. Each file is a short, self-contained example that can be compiled and run on its own.

## Table of Contents

- [Topics Covered](#topics-covered)
- [Project Structure](#project-structure)
- [Programs](#programs)
- [Requirements](#requirements)
- [How to Run](#how-to-run)
- [Sample Output](#sample-output)
- [Contributing](#contributing)

## Topics Covered

- Taking user input with `Scanner`
- Conditional statements: `if / else if / else` and `switch`
- Loops: `for`, `while`, `do while`, and nested loops
- Arrays: 1D arrays, 2D arrays, and enhanced `for` loops
- Methods: parameters, return values, and `static` methods
- String operations: `length`, `toUpperCase`, `toLowerCase`, `charAt`, `substring`, `split`

## Project Structure

```
java-practice/
└── java/
    ├── 2d array.java
    ├── array .java
    ├── count vowels.java
    ├── do while.java
    ├── even or odd.java
    ├── factrorial.java
    ├── if else.java
    ├── maximum.java
    ├── method.java
    ├── nested loop.java
    ├── scanner.java
    ├── split fuction.java
    ├── sum of array.java
    ├── switch.java
    └── while loop.java
```

## Programs

### Basics

| File | Description |
| --- | --- |
| `scanner.java` | Reads an integer (age) from the user using `Scanner` and prints it |
| `if else.java` | Converts marks into a grade (A+, A, B, C, Fail) using an if-else ladder |
| `switch.java` | Maps a day number to a weekday name using `switch` |

### Loops

| File | Description |
| --- | --- |
| `while loop.java` | Prints numbers 1 to 10 using a `while` loop |
| `do while.java` | Prints numbers 1 to 10 using a `do while` loop |
| `nested loop.java` | Prints a right-angled star pattern using nested `for` loops |

### Arrays

| File | Description |
| --- | --- |
| `array .java` | Declares an array and calculates the sum of its elements |
| `2d array.java` | Creates a 3x3 matrix and accesses elements by row and column |
| `sum of array.java` | Calculates the sum of an array using a method and an enhanced `for` loop |

### Methods

| File | Description |
| --- | --- |
| `even or odd.java` | Checks whether a number is even or odd using a `boolean` method |
| `maximum.java` | Returns the larger of two numbers |
| `factrorial.java` | Calculates the factorial of a number using a loop |

### Strings

| File | Description |
| --- | --- |
| `method.java` | Demonstrates common `String` methods |
| `split fuction.java` | Splits a comma-separated string into an array |
| `count vowels.java` | Counts the vowels in a given string |

## Requirements

- Java Development Kit (JDK) 8 or higher
- A terminal or any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

Check your installation:

```bash
java -version
javac -version
```

## How to Run

Every program uses `public class Main`, so the file must be saved as `Main.java` before compiling. The simplest approach is to copy the example you want into a new `Main.java` file.

```bash
# 1. Clone the repository
git clone https://github.com/<your-username>/java-practice.git
cd java-practice/java

# 2. Copy an example into Main.java
cp "factrorial.java" Main.java

# 3. Compile
javac Main.java

# 4. Run
java Main
```

On Windows (Command Prompt):

```bat
copy "factrorial.java" Main.java
javac Main.java
java Main
```

Alternatively, with JDK 11 or higher you can run a single source file directly:

```bash
java Main.java
```

## Sample Output

**factrorial.java**

```
120
```

**nested loop.java**

```
* 
* * 
* * * 
* * * * 
* * * * * 
```

**count vowels.java**

```
3
```

**if else.java** (marks = 75)

```
A
```

**split fuction.java**

```
Apple
Banana
Orange
```

## Contributing

This is a personal learning repository, but suggestions are welcome. To propose a change:

1. Fork the repository
2. Create a branch: `git checkout -b feature/new-example`
3. Commit your changes: `git commit -m "Add new example"`
4. Push the branch: `git push origin feature/new-example`
5. Open a pull request

## Author

Replace this section with your name and links, for example:

- GitHub: [@raselhasansabuj](https://github.com/raselhasansabuj)
- Email: raselhasansabuj@gmail.com
