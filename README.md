# Rams Brew Order System

This lab project uses:

- `Builder Pattern` to build beverage orders step-by-step
- `Factory Pattern` to create the right beverage type
- `Strategy Pattern` to handle different service/order types

## Project Structure

```text
RamsBrewOrderSystem
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── edu
    │           └── fsc
    │               └── ramsbrew
    │                   ├── RamsBrewApplication.java
    │                   ├── builder
    │                   │   └── BeverageOrderBuilder.java
    │                   ├── factory
    │                   │   └── BeverageFactory.java
    │                   ├── model
    │                   │   ├── Beverage.java
    │                   │   ├── BeverageOrder.java
    │                   │   ├── Coffee.java
    │                   │   ├── Latte.java
    │                   │   ├── Cappuccino.java
    │                   │   ├── Tea.java
    │                   │   └── enums
    │                   └── strategy
    │                       ├── OrderTypeStrategy.java
    │                       ├── DineInStrategy.java
    │                       ├── TakeoutStrategy.java
    │                       └── MobilePickupStrategy.java
    └── test
        └── java
            └── edu
                └── fsc
                    └── ramsbrew
                        └── BeverageOrderBuilderTest.java
```

## How To Run

1. Open the project in IntelliJ.
2. Load the Maven project.
3. Run `RamsBrewApplication`.

## Git / Submission Notes

Suggested repository name:

- `farmingdale-coffeeshop-lab`

Suggested first steps:

```bash
git init
git add .
git commit -m "Initial commit for Rams Brew Order System"
git branch -M main
git remote add origin <your-github-repo-url>
git push -u origin main
```

Each student can fork the repository to their own GitHub account before submitting.

