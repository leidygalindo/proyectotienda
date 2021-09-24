Feature:  registrarme en la pagina
  como un nuevo cliente
  Quiero registarme en la pagina www.tienda.com con un correo que no se encuentra registrado

  @EscenarioSinEjemplos
  Scenario:Registro de usuario nuevo con datos correctos
    Given que un nuevo cliente se loge en la pagina web
    When  Diligenciar leid@hotmail.com valido para el registro con Leidy galindo Manolo123* Cra55 itagui Alaska 000001 United States 123456 alias
    Then el se loguea en la pagina web
