package pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class WonoPage {
    public WonoPage closeTestWindow(){
        $(By.xpath(".//mat-icon[@class='material-icons popup-close-icon mat-icon notranslate mat-icon-no-color']")).shouldBe(visible).click();
        return this;
    }
    public WonoPage loginString(String text) {
        $(By.xpath(".//button[@class='mat-stroked-button mat-button-base mat-accent']/span[@class='mat-button-wrapper' and 1]")).click();
        $(By.xpath(".//div[@class='cdk-overlay-backdrop cdk-overlay-dark-backdrop cdk-overlay-backdrop-showing']")).shouldBe(exist);
        $(By.xpath(".//*[@formcontrolname='email']")).setValue(text);
        return this;
        }
    public WonoPage passwordString(String text){
        $(By.xpath(".//input[@type='password']")).setValue(text);
        $(By.xpath(".//*[@class='sign-button mat-flat-button mat-button-base']/span[1 and @class='mat-button-wrapper']")).click();
        return this;
    }
    public void isUserLogged(){
        $(By.xpath(".//app-person-menu/div[1]/button[1]/span[1]/mat-icon[1]")).shouldBe(exist);
    }
}
