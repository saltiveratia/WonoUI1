package pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class WonoAssetpage {
    public WonoAssetpage listYourAsset(){
        $(By.xpath(".//div[@class='buttons-wrapper__list-button ng-star-inserted']/button[@class='mat-flat-button mat-button-base mat-accent' and 1]/span[@class='mat-button-wrapper' and 1]")).shouldBe(visible).click();
        return this;
    }
    public WonoAssetpage earnWithWono() {
        $(By.xpath(".//div[@class='mat-checkbox-inner-container']")).shouldBe(exist).shouldHave(type("checkbox")).click();
        $(By.xpath(".//mat-select[@id='mat-select-2']/div[@class='mat-select-trigger' and 1]")).shouldBe(exist).click();
        $(By.xpath(".//mat-option[@id='mat-option-9']/span[@class='mat-option-text' and 1]")).shouldBe(exist).click();
        $(By.xpath(".//*[@class='mat-flat-button mat-button-base mat-accent ng-star-inserted']/span[1 and @class='mat-button-wrapper']")).shouldBe(exist).click();
        return this;
    }
    //public WonoAssetpage passwordString(String text){
        //$(By.xpath(".//input[@type='password']")).setValue(text);
        //$(By.xpath(".//*[@class='sign-button mat-flat-button mat-button-base']/span[1 and @class='mat-button-wrapper']")).click();
        //return this;
    //}
    public void isUserLogged(){
        $(By.xpath(".//app-person-menu/div[1]/button[1]/span[1]/mat-icon[1]")).shouldBe(exist);
    }
}
