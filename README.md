# SHOP Automation Tests - Serenity BDD with Screenplay Pattern

Test automation project for the SHOP e-commerce website using Serenity BDD, Screenplay pattern, and Cucumber.

## Project Overview

This project automates the shopping flow for the SHOP application (https://shop.polymer-project.org/), including:
- Adding products to cart with size selection
- Validating cart contents and prices
- Completing checkout process
- Negative testing with invalid products
- Data-driven testing using CSV

## Technology Stack

- **Language**: Java 11
- **Framework**: Serenity BDD 3.9.8
- **Screenplay Pattern**: For better test structure and maintainability
- **BDD Framework**: Cucumber 7.14.0
- **Browser Driver**: WebDriver (Chrome)
- **Build Tool**: Maven
- **Data Source**: CSV files

## Project Structure

```
src/
├── main/java/com/interbank/shop/
│   ├── actors/          # Screenplay actors
│   ├── tasks/           # Screenplay tasks (actions)
│   ├── questions/       # Screenplay questions (assertions)
│   ├── locators/        # UI element locators
│   └── utils/           # Utility classes (CSV reader, etc.)
└── test/
    ├── java/com/interbank/shop/
    │   ├── stepdefinitions/  # Cucumber step implementations
    │   └── runners/          # Test runners
    └── resources/
        ├── features/        # Gherkin feature files
        ├── data/            # CSV test data
        └── serenity.conf    # Serenity configuration
```

## Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher
- Chrome browser
- Git

## Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd RetoIBK
```

2. Install dependencies:
```bash
mvn clean install
```

## Running Tests

### Run all tests:
```bash
mvn test
```

### Run specific test runner:
```bash
mvn test -Dtest=CucumberTestRunner
```

### Run tests with specific tags:
```bash
mvn test -Dcucumber.filter.tags="@shop_add_products_to_cart"
```

### Run tests in headless mode:
```bash
mvn test -Dserenity.driver.capabilities="browserName:chrome;chromeOptions.args:--headless,--no-sandbox"
```

## Test Scenarios

### Scenario 1: Add Jackets and Validate Price
- Adds a men's jacket (XL) and women's jacket (S)
- Validates total price is correct
- **Tag**: `@shop_add_products_to_cart`

### Scenario 2: Complete Checkout Process
- Adds a men's jacket (L) and women's jacket (XS)
- Views cart
- Completes checkout form
- Validates order confirmation
- **Tag**: `@shop_checkout_process`

### Scenario 3: Data-Driven Negative Tests (CSV)
- Uses CSV data for multiple product/size combinations
- Tests both valid and invalid scenarios
- Validates error handling
- **Tag**: `@shop_parametrized_csv_negative_tests`

## Test Reports

After running tests, reports are generated in:
- **HTML Report**: `target/cucumber-reports/cucumber-html-report.html`
- **JSON Report**: `target/cucumber-reports/cucumber.json`
- **XML Report**: `target/cucumber-reports/cucumber.xml`
- **Serenity Report**: `target/site/serenity/index.html`

## Configuration

Key configuration files:

### serenity.properties
- Browser settings
- Screenshot configuration
- Report options

### serenity.conf
- WebDriver capabilities
- Chrome options (headless mode, sandbox, etc.)
- Serenity reporting options

### src/test/resources/data/testdata.csv
- Test data for parameterized scenarios
- Columns: productName, category, size, isValid, expectedResult

## Key Features

- **Screenplay Pattern**: Clean, readable, and maintainable test code
- **Cucumber BDD**: Business-readable feature files in Spanish
- **CSV Data-Driven**: Support for multiple test data sets
- **Comprehensive Locators**: Centralized element locators
- **Synchronization**: Proper wait strategies for element synchronization
- **Serenity Reports**: Detailed test execution reports with screenshots
- **Error Handling**: Negative test cases for invalid inputs

## Troubleshooting

### Tests not running:
- Ensure Java 11 is installed: `java -version`
- Clear Maven cache: `mvn clean`
- Ensure Chrome browser is installed

### WebDriver issues:
- WebDriver Manager automatically manages ChromeDriver
- If manual driver needed, download from: https://chromedriver.chromium.org/

### Report not generating:
- Check `target/` directory exists
- Run: `mvn clean install` to rebuild
- Verify Serenity plugin in pom.xml

## Best Practices Implemented

1. **Screenplay Pattern**: Separates concerns into Actors, Tasks, and Questions
2. **Page Locators**: Centralized element locators for maintainability
3. **CSV Integration**: External data source for scalable testing
4. **Synchronization**: Proper waiting strategies to avoid flaky tests
5. **Clear Naming**: Descriptive names for tests and steps
6. **Assertions**: Using Hamcrest matchers for readable assertions
7. **Error Handling**: Negative test scenarios included

## Contributing

1. Create a new branch for your feature
2. Write tests following the Screenplay pattern
3. Ensure all tests pass: `mvn clean test`
4. Create a pull request with detailed description

## Contact

For questions or support, contact: jhuamanllantoy@intercorp.com.pe

## License

This project is part of the Interbank Technical Evaluation.
