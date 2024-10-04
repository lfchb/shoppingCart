Feature: Agregar productos a mi carrito de compras

  Scenario: T01 - Agregar producto a mi carrito de compras
    Given Lili visita la pagina Your Store
    When Agrega productos al carrito de compras
    Then Podra visualizar los items en la View cart
    And Realizar el pago
