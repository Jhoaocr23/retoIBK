# Guía de Inicio Rápido - SHOP Automation

## Instalación Rápida

```bash
# 1. Clonar el repositorio
git clone <repository-url>
cd RetoIBK

# 2. Instalar dependencias
mvn clean install

# 3. Ejecutar pruebas
mvn test
```

## Estructura del Proyecto

```
RetoIBK/
├── pom.xml                                    # Configuración Maven
├── serenity.properties                        # Propiedades Serenity
├── README.md                                  # Documentación completa
├── .gitignore                                 # Git ignore rules
│
├── src/
│   ├── main/java/com/interbank/shop/
│   │   ├── actors/                           # Screenplay Actors
│   │   │   └── ShopActor.java
│   │   ├── tasks/                            # Screenplay Tasks
│   │   │   ├── OpenShopPage.java
│   │   │   ├── SelectProduct.java
│   │   │   ├── ViewCart.java
│   │   │   ├── ProceedToCheckout.java
│   │   │   └── CompleteCheckout.java
│   │   ├── questions/                        # Screenplay Questions
│   │   │   ├── CartTotal.java
│   │   │   ├── NumberOfItemsInCart.java
│   │   │   ├── OrderConfirmationMessage.java
│   │   │   └── CartItemDetails.java
│   │   ├── locators/                         # Element Locators
│   │   │   └── ShopPageLocators.java
│   │   └── utils/                            # Utilities
│   │       └── CSVDataReader.java
│   │
│   └── test/
│       ├── java/com/interbank/shop/
│       │   ├── stepdefinitions/              # Cucumber Steps
│       │   │   └── ShoppingStepDefinitions.java
│       │   └── runners/                      # Test Runners
│       │       └── CucumberTestRunner.java
│       │
│       └── resources/
│           ├── features/                     # Gherkin Features
│           │   └── shopping.feature
│           └── data/                         # Test Data
│               └── testdata.csv
│
└── target/                                   # Build output
    ├── site/serenity/                        # Serenity Reports
    └── cucumber-reports/                     # Cucumber Reports
```

## Comandos Útiles

### Compilar
```bash
mvn clean compile
```

### Ejecutar Tests
```bash
# Todos los tests
mvn clean test

# Solo con tag específico
mvn test -Dcucumber.filter.tags="@shop_add_products_to_cart"

# En modo headless
mvn test -Dserenity.driver.capabilities="browserName:chrome;chromeOptions.args:--headless"
```

### Generar Reportes
```bash
mvn clean test serenity:aggregate
```

### Reportes Generados
- **HTML Cucumber**: `target/cucumber-reports/cucumber-html-report.html`
- **Serenity**: `target/site/serenity/index.html`
- **XML Report**: `target/cucumber-reports/cucumber.xml`

## Escenarios de Prueba

### ✅ Escenario 1: Agregar Productos
- Tag: `@shop_add_products_to_cart`
- Agrega 2 chaquetas con diferentes tallas
- Valida el precio total

### ✅ Escenario 2: Checkout Completo
- Tag: `@shop_checkout_process`
- Completa el formulario de compra
- Valida confirmación del pedido

### ✅ Escenario 3: Pruebas Negativas (CSV)
- Tag: `@shop_parametrized_csv_negative_tests`
- Prueba datos inválidos
- Valida manejo de errores

## Características Implementadas

✅ Patrón Screenplay (Actors, Tasks, Questions)
✅ BDD con Cucumber en español
✅ Integración con CSV para datos de prueba
✅ Elemento locators centralizados
✅ Reportes Serenity detallados
✅ Sincronización de elementos
✅ Pruebas positivas y negativas

## Requisitos

- Java 11 o superior
- Maven 3.6.0 o superior
- Chrome navegador

## Soporte

Para problemas o preguntas contactar:
jhuamanllantoy@intercorp.com.pe
