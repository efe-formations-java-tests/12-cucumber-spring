Feature: Operations de calcul

  Scenario: le client desire additionner deux nombres
    When le client appelle /calc/add avec les valeurs 1 et 2
    Then le client recoit comme reponse 3

  Scenario: le client desire soustraire deux nombres
    When le client appelle /calc/sub avec les valeurs 5 et 3
    Then le client recoit comme reponse 2

  Scenario: le client desire diviser deux nombres
    When le client appelle /calc/div avec les valeurs 6 et 2
    Then le client recoit comme reponse 3

  Scenario Outline: le client desire multiplier deux nombres
    When le client appelle /calc/mul avec les valeurs <nombre1> et <nombre2>
    Then le client recoit comme reponse <resultat>

    Examples: 
      | nombre1 | nombre2 | resultat |
      |       2 |       3 |        6 |
      |       4 |       6 |       24 |
      |       7 |       8 |       56 |
