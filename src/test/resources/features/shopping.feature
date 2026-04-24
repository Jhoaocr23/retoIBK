# language: es
Característica: Agregar productos al carrito de compras

  Antecedentes:
    Dado que el usuario abre la página principal de SHOP

  @shop_add_products_to_cart
  Escenario: Agregar chaqueta para hombre (talla XL) y mujer (S) y validar el precio total
    Cuando el usuario agrega una chaqueta para hombre con talla XL
    Y el usuario agrega una chaqueta para mujer con talla S
    Entonces el usuario debe ver 2 artículos en el carrito
    Y el precio total debe ser correcto

  @shop_checkout_process
  Escenario: Agregar chaqueta para hombre (talla L) y mujer (XS) y realizar Checkout
    Cuando el usuario agrega una chaqueta para hombre con talla L
    Y el usuario agrega una chaqueta para mujer con talla XS
    Y el usuario visualiza el carrito
    Y el usuario procede al checkout
    Y el usuario completa el formulario de compra
    Entonces el pedido debe completarse exitosamente

  @shop_parametrized_csv_negative_tests
  Escenario: Validar compra con diferentes chaquetas y tallas desde CSV (pruebas negativas)
    Cuando el usuario intenta agregar productos inválidos del archivo CSV
    Entonces el sistema debe mostrar mensajes de error apropiados
    Y el producto no debe agregarse al carrito
