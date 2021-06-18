Feature: Ingreso a StarSharp
  Ingresar el usuario para registrar unidad de negocio y agendar reunion y confirmar.

  Scenario: Ingresar a modulo de auteticacion desde la pagina Home de StarSharp
    Given El usuario se ubica en la pagina de inicio de StarSharp
    When Realiza proceso de usuario y password despues click en SignIn
    Then Se direcciona a la pagina de crear nueva reunion