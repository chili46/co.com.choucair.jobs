  #autor :Luis Fernando Silva Chilito and  Einer Alean Sepulveda
@Tag0
  Feature: Choucair module jobs
    as a user I want to enter choucair jobs
    To perform a search on available jobs.

  @Tag1
  Scenario: Search
    Given that Luis wants to access choucair jobs
    When he performs the search on the page
      | keyword | location |
      | Performance    | medellin  |
    Then he verifies that the text Search completed is displayed on the screen
      | result     |
      | Performance |

    @Tag2
    Scenario: Search word out of context
      Given that Luis wants search a word in the section jobs
      When he write a word medico
      Then he sees the texto No hay trabajos correspondientes a tu búsqueda

    @Tag3
    Scenario: Sign up for work
      Given that einer wants to join performance work
      When he  fill  the form
        | name | email |phone |studies |experience|knowAboutAutomation|wageAspiration|time|additionalMessage|
        | einer alean sepulveda    | einera@gmail.com  |3104766728|ingeniero sistemas|ninguna|no|1.800.000|Inmediata|ninguno|
      Then he verifies that the text please verify the captcha is displayed on the screen
        | resultText     |
        | Por favor verifica el captcha |


    @Manual
    Scenario: Text
      Given that einer wants to verify the correct use of spelling
      When he checks the correct use of spelling
      Then he sees that it is well written

    @Manual
      Scenario: Redirection (Link)
      Given that einer wants to verify the correct redirection of the links
      When he clicks on the link
      Then he sees that it takes him to the right page