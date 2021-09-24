
Feature:  realizar compras de articulos
como un nuevo cliente
ingresar a la pagina www.tienda.com

  @EscenarioSinEjemplos
  Scenario:Agregar articulos al carrito de compras
    Given que un nuevo cliente ascede hasta la pagina web de compras
    When  el agrega 3 productos Blouse talla M al carro de compras
    Then el ve el producto en el carro de compras

  @EscenarioConEjemplos
  Scenario Outline:  Agregar articulos al carrito de compras
    Given que un nuevo cliente ascede hasta la pagina web de compras
    When  el agrega productos al carro
      | <NombreProducto> | <CantidadAgregar> |
    Then  el ve el listado de productos en el carro de compras

    Examples:
    | NombreProducto | CantidadAgregar |
    | Pantalon       | 10              |