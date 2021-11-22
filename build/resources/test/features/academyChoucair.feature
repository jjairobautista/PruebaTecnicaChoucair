@stories
Feature: Academy Choucair
  as user , I want to learn how to automate in screenplay at the choucair academy with the automation course

  @scenario1
  Scenario Outline: Search for automation course
    Given than Jhon wants to learn automation ah the academy Choucair
      | user   | pass   |
      | <User> | <Pass> |
    When he search for course on the choucair academy plataform
    Then he finds the course called resources
      | refQuestion   |
      | <RefQuestion> |
    Examples:
      | User       | Pass          | RefQuestion |
      | 1012456109 | Choucair2021* | Capítulos  |