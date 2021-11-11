@Paralel2
Feature: US1006 concorthotels sayfasında farklı kullanıcı adları ile
  Scenario Outline: Farkli kullanici isimleri ile negative test
    Given kullanici "CHQARrl" sayfasina gider
    Then CH login linkine click yapar
    And CH username kutusuna "<wrongUserName>" yazar
    And CH kutusuna "<wrongPassword>" yazar
    And CH login butonuna basar
    Then giris yapilamadigini test eder
    And sayfayi kapatir



    Examples:
    |wrongUserName|wrongPassword|
