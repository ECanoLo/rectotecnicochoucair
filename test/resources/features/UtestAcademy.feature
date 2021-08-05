#Autor Elizabeth Cano
@stories
Feature: Utest_login
the user want login at the webpage the Utest and immediately get the projects offers

@scenario
        Scenario Outline: Utest_Login
        Given the user Elizabeth open the webpage the Utest Longin in
        When the user Elizabeth insert <usser_email> and <password>
        Then the page open profiles the user Elizabeth <clickacademy>
     Examples:
        |usser_email|password|clickacademy|
        |ecanolopera@gmail.com|emcEcl2102|Academy|
