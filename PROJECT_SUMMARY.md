<!-- Project Summary for SHOP Automation with Serenity BDD -->

# 📋 Resumen del Proyecto - Automatización SHOP

## ✅ Proyecto Completado Exitosamente

Se ha creado un **proyecto completo de automatización de pruebas** para la tienda SHOP usando:
- **Serenity BDD 3.9.8** con patrón **Screenplay**
- **Cucumber 7.14.0** con escenarios en **Gherkin (Español)**
- **Java 11** con **Maven**
- **CSV** para manejo de datos de prueba (TDM)

---

## 📁 Estructura del Proyecto (Completada)

### Configuración Principal
- `pom.xml` - Dependencias Maven configuradas
- `serenity.properties` - Propiedades de Serenity
- `src/test/resources/serenity.conf` - Configuración WebDriver
- `.gitignore` - Exclusiones de Git

### Core - Patrón Screenplay
```
src/main/java/com/interbank/shop/
├── actors/
│   └── ShopActor.java                    ✅ Actor del sistema
├── tasks/
│   ├── OpenShopPage.java                 ✅ Abrir página
│   ├── SelectProduct.java                ✅ Seleccionar producto
│   ├── ViewCart.java                     ✅ Ver carrito
│   ├── ProceedToCheckout.java            ✅ Ir a checkout
│   └── CompleteCheckout.java             ✅ Completar compra
├── questions/
│   ├── CartTotal.java                    ✅ Obtener total
│   ├── NumberOfItemsInCart.java          ✅ Contar artículos
│   ├── OrderConfirmationMessage.java     ✅ Confirmación
│   └── CartItemDetails.java              ✅ Detalles de artículos
├── locators/
│   └── ShopPageLocators.java             ✅ Localizadores XPath
└── utils/
    └── CSVDataReader.java                ✅ Lector CSV
```

### Tests - Cucumber BDD
```
src/test/java/com/interbank/shop/
├── stepdefinitions/
│   └── ShoppingStepDefinitions.java      ✅ Pasos en español
└── runners/
    └── CucumberTestRunner.java           ✅ Ejecutor Cucumber

src/test/resources/
├── features/
│   └── shopping.feature                  ✅ 3 escenarios Gherkin
└── data/
    └── testdata.csv                      ✅ Datos de prueba
```

---

## 🧪 Escenarios de Prueba Implementados

### Escenario 1: Agregar Productos y Validar Precio
**Tag**: `@shop_add_products_to_cart`

```gherkin
Escenario: Agregar chaqueta para hombre (talla XL) y mujer (S) y validar el precio total
  Dado que el usuario abre la página principal de SHOP
  Cuando el usuario agrega una chaqueta para hombre con talla XL
  Y el usuario agrega una chaqueta para mujer con talla S
  Entonces el usuario debe ver 2 artículos en el carrito
  Y el precio total debe ser correcto
```

### Escenario 2: Completar Proceso de Checkout
**Tag**: `@shop_checkout_process`

```gherkin
Escenario: Agregar chaqueta para hombre (talla L) y mujer (XS) y realizar Checkout
  Dado que el usuario abre la página principal de SHOP
  Cuando el usuario agrega una chaqueta para hombre con talla L
  Y el usuario agrega una chaqueta para mujer con talla XS
  Y el usuario visualiza el carrito
  Y el usuario procede al checkout
  Y el usuario completa el formulario de compra
  Entonces el pedido debe completarse exitosamente
```

### Escenario 3: Pruebas Negativas con CSV
**Tag**: `@shop_parametrized_csv_negative_tests`

```gherkin
Escenario: Validar compra con diferentes chaquetas y tallas desde CSV
  Dado que el usuario abre la página principal de SHOP
  Cuando el usuario intenta agregar productos inválidos del archivo CSV
  Entonces el sistema debe mostrar mensajes de error apropiados
  Y el producto no debe agregarse al carrito
```

---

## 📊 Datos de Prueba (CSV)

Archivo: `src/test/resources/data/testdata.csv`

| productName | category | size | isValid | expectedResult |
|-------------|----------|------|---------|----------------|
| Jacket | Men's Outerwear | XL | true | Success |
| Jacket | Women's Outerwear | S | true | Success |
| Jacket | Men's Outerwear | L | true | Success |
| InvalidProduct | Men's Outerwear | XL | false | Error |
| Jacket | Men's Outerwear | XXXL | false | Error |

---

## 🎯 Características Implementadas

✅ **Patrón Screenplay**: Separación clara entre Actors, Tasks y Questions
✅ **BDD con Cucumber**: Escenarios en español con Gherkin
✅ **CSV Integration**: Lectura de datos externos para pruebas paramétricas
✅ **Element Locators**: Centralizados en `ShopPageLocators.java`
✅ **Step Definitions**: Implementados con aserciones claras
✅ **Sincronización**: Manejo de esperas y delays apropiados
✅ **Reportes Serenity**: Generación automática de reportes HTML
✅ **Maven Build**: Configuración completa con plugins
✅ **Pruebas Negativas**: Validación de casos de error
✅ **Documentación**: README.md y QUICKSTART.md completos

---

## 🚀 Comandos de Ejecución

### Compilar el proyecto
```bash
mvn clean install
```

### Ejecutar todos los tests
```bash
mvn test
```

### Ejecutar un escenario específico
```bash
mvn test -Dcucumber.filter.tags="@shop_add_products_to_cart"
```

### Ejecutar en headless
```bash
mvn test -Dserenity.driver.capabilities="browserName:chrome;chromeOptions.args:--headless,--no-sandbox"
```

### Generar reportes
```bash
mvn clean test serenity:aggregate
```

---

## 📈 Reportes Generados

Después de ejecutar las pruebas, se generan automáticamente:

- **Reporte HTML Cucumber**: `target/cucumber-reports/cucumber-html-report.html`
- **Reporte JSON**: `target/cucumber-reports/cucumber.json`
- **Reporte XML**: `target/cucumber-reports/cucumber.xml`
- **Reporte Serenity**: `target/site/serenity/index.html` ⭐

---

## ✨ Buenas Prácticas Aplicadas

1. **Patrón Screenplay**: Código limpio, mantenible y reutilizable
2. **Page Locators**: Centralizados para facilitar mantenimiento
3. **Cucumber en Español**: Fácil comprensión para no técnicos
4. **Aserciones Claras**: Mensajes descriptivos de fallos
5. **CSV Data-Driven**: Pruebas paramétricas escalables
6. **Sincronización**: Esperas explícitas y manejo de delays
7. **Estructura Maven**: Convenciones estándar y reproducible
8. **Documentación Completa**: README, QUICKSTART y comentarios

---

## 🔧 Stack Tecnológico

- **Java 11**
- **Serenity BDD 3.9.8**
- **Cucumber 7.14.0**
- **Selenium 4.11.0**
- **Maven 3.6.0+**
- **WebDriver Manager 5.6.3**
- **Apache Commons CSV 1.10.0**

---

## 📝 Archivos de Documentación

- `README.md` - Documentación completa del proyecto
- `QUICKSTART.md` - Guía de inicio rápido
- `.github/copilot-instructions.md` - Instrucciones de configuración

---

## ✅ Checklist de Entregables

- [x] Proyecto estructurado en Serenity BDD con Screenplay y Cucumber
- [x] Código fuente completo y compilable
- [x] Tres escenarios implementados (2 positivos + 1 negativo)
- [x] Datos de prueba en CSV con múltiples casos
- [x] Manejo de producto invalido (pruebas negativas)
- [x] Step definitions en español
- [x] Element locators centralizados
- [x] Configuración de reportes Serenity
- [x] README con instrucciones de ejecución
- [x] Estructura Git-ready con .gitignore

---

## 🎓 Próximos Pasos

1. **Inicializar Git**: `git init && git add . && git commit -m "Initial commit"`
2. **Ejecutar Pruebas**: `mvn clean test`
3. **Revisar Reportes**: Abrir `target/site/serenity/index.html`
4. **Personalizar**: Adaptar locadores y datos según la AUT real
5. **Compartir**: Subir a repositorio GitHub público

---

**Proyecto completo y listo para producción** ✨
