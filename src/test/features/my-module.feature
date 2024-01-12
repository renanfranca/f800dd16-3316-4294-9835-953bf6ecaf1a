Feature: My module

  Scenario: Should apply my module
    When I apply "my-module" module to default project
      | packageName | tech.jhipster.chips |
    Then I should have files in "src/main/java/tech/jhipster/chips/my_package"
      | Dummy.java |
