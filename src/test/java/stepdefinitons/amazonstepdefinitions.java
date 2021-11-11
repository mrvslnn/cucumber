package stepdefinitons;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import pages.AmazonPages;
import utilties.ConfigReader;
import utilties.Driver;

public class amazonstepdefinitions {
    AmazonPages amazonPage=new AmazonPages();

    @When("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("nutella icin arama yapar")
    public void nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
    @Then("sonucun nutella icerdigini test eder")
    public void sonucun_nutella_icerdigini_test_eder() {

        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("Nutella"));

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("java icin arama yapar")
    public void java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }
    @Then("sonucun java icerdigini test eder")
    public void sonucun_java_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("Java"));
    }
    @When("ipad icin arama yapar")
    public void ipad_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("ipad"+ Keys.ENTER);
    }
    @Then("sonucun ipad icerdigini test eder")
    public void sonucun_ipad_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("ipad"));
    }


    @Then("sonucun {string} icerdigini test eder")
    public void sonucunIcerdiginiTestEder(String arananKelime) {
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("arananKelime"));
    }

    @And("{string} icin arama yapar")
    public void icinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys("arananKelime"+ Keys.ENTER);
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("arananUrl"));
    }

    @And("sonuc sayisini yazdirir")
    public void sonucSayisiniYazdirir() {
Driver.getDriver().get(ConfigReader.getProperty("arananUrun"));
    }


}

