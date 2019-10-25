package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.exist;

public class WonoAssetpage {
    public WonoAssetpage listYourAsset() {
        $(By.xpath(".//div[@class='buttons-wrapper__list-button ng-star-inserted']/button[@class='mat-flat-button mat-button-base mat-accent' and 1]/span[@class='mat-button-wrapper' and 1]")).shouldBe(visible).click();
        return this;
    }

    public WonoAssetpage earnWithWono() {
        $(By.xpath(".//div[@class='mat-checkbox-inner-container']")).shouldBe(exist).click();
        $(By.xpath(".//mat-select[@id='mat-select-2']/div[@class='mat-select-trigger' and 1]")).shouldBe(exist).click();
        $(By.xpath(".//mat-option[@id='mat-option-9']/span[@class='mat-option-text' and 1]")).shouldBe(exist).click();
        $(By.xpath(".//*[@class='mat-flat-button mat-button-base mat-accent ng-star-inserted']/span[1 and @class='mat-button-wrapper']")).shouldBe(exist).click();
        return this;
    }

    public WonoAssetpage listVechicle(String text) {
        open("/ru/list/vehicle");
        //Vehicle type list
        $(By.xpath(".//mat-select[@id='mat-select-2']/div[@class='mat-select-trigger' and 1]")).shouldBe(visible).click();
        //choose car
        $(By.xpath(".//*[1]/span[1 and @class='mat-option-text']")).shouldBe(visible).click();
        $(By.xpath(".//span[@class='mat-expansion-indicator ng-tns-c26-6 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).click();
        $(By.xpath(".//span[@class='mat-expansion-indicator ng-tns-c26-6 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).shouldBe(exist).click();
        //Choose the brand list
        $(By.xpath(".//span[@class='mat-select-placeholder ng-tns-c17-34 ng-star-inserted']")).shouldBe(visible).click();
        //Audi
        $(By.xpath(".//*[14]/span[1 and @class='mat-option-text']/span[1]")).waitUntil(exist, 10000).click();
        //Model list
        $(By.xpath(".//span[@class='mat-expansion-indicator ng-tns-c26-6 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).click();
        $(By.xpath(".//span[@class='mat-expansion-indicator ng-tns-c26-6 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).shouldBe(exist).click();
        $(By.xpath(".//span[@class='mat-select-placeholder ng-tns-c17-21 ng-star-inserted']")).waitUntil(exist, 10000).click();
        //A5
        $(By.xpath(".//mat-option[13]")).shouldBe(exist).click();
        //$(By.xpath(".//*[1]/*[1]/*[1]/*[13]")).waitUntil(exist, 10000).click();
        //Year list
        $(By.xpath(".//span[@class='mat-expansion-indicator ng-tns-c26-6 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).click();
        $(By.xpath(".//span[@class='mat-expansion-indicator ng-tns-c26-6 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).shouldBe(exist).click();
        $(By.xpath(".//span[@class='mat-select-placeholder ng-tns-c17-23 ng-star-inserted']")).shouldBe(exist).click();
        //2016
        $(By.xpath(".//mat-option[9]")).click();
        //Trim list
        $(By.xpath(".//span[@class='mat-expansion-indicator ng-tns-c26-6 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).click();
        $(By.xpath(".//span[@class='mat-expansion-indicator ng-tns-c26-6 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).shouldBe(exist).click();
        $(By.xpath(".//span[@class='mat-select-placeholder ng-tns-c17-25 ng-star-inserted']")).click();
        //Trim element
        $(By.xpath(".//*[3]/span[1 and @class='mat-option-text']/span[1]")).shouldBe(exist).click();
        //Engine input - set text "2.0L 4cyl"
        $(By.xpath(".//input[@class='wono-input wono-input-with-label ng-untouched ng-pristine ng-invalid']")).shouldBe(exist).setValue(text);
        return this;
    }

    public WonoAssetpage listVechicle1() {
        //Body type
        $(By.xpath(".//span[@class='mat-select-placeholder ng-tns-c17-27 ng-star-inserted']")).shouldBe(exist).click();
        //Van
        $(By.xpath(".//mat-option[@id='mat-option-12']")).shouldBe(exist).click();
        //Number of seats
        $(By.xpath(".//span[@class='mat-select-placeholder ng-tns-c17-29 ng-star-inserted']")).shouldBe(exist).click();
        //5
        $(By.xpath(".//*[@id='mat-option-22']")).shouldBe(exist).click();
        //Fuel type
        $(By.xpath(".//span[@class='mat-select-placeholder ng-tns-c17-31 ng-star-inserted']")).shouldBe(exist).click();
        //Gasoline
        $(By.xpath(".//*[3]/span[1 and @class='mat-option-text']")).shouldBe(exist).click();
        //"Automatic" radiobutton
        $(By.xpath(".//*[2]/label[1 and @class='mat-radio-label']/div[2 and @class='mat-radio-label-content']")).shouldBe(exist).click();
        return this;
    }

    public WonoAssetpage listVechicle2(String text) {

        //YOU'RE HERE!
        $(By.xpath(".//span[@class='mat-expansion-indicator ng-tns-c26-18 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).click();
        $(By.xpath(".//span[@class='mat-expansion-indicator ng-tns-c26-18 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']")).shouldBe(exist).click();
        //Search location set text "12"
        //$(By.xpath(".//input[@class='search wono-input ng-untouched ng-pristine ng-valid']")).shouldBe(exist).setValue(text);
        $(By.xpath(".//*[@placeholder='Search location']"))
                .shouldBe(exist)
                .setValue(text)
                .sendKeys(Keys.ENTER);
        //$(By.xpath(".//div[@id='cdk-accordion-child-5']/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.DOWN, Keys.RETURN);
        //BUT HERE'S CRAP


        //click third position in list
        //$(By.xpath("//*[1]")).shouldBe(exist).click();
        //$(By.xpath("//input[@class='search wono-input ng-valid invalid-input ng-dirty ng-touched']")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);


        return this;
    }

    public WonoAssetpage listVechicle3(String text) {
        //Minimum rent set text "1"
        $(By.xpath(".//*[1]/div[1]/app-input-with-label[1 and @class='ng-untouched ng-pristine ng-valid']/div[1 and @class='input-with-label']/input[1 and @class='wono-input wono-input-with-label ng-untouched ng-pristine ng-valid']")).shouldBe(exist).setValue(text);
        return this;
    }

    public WonoAssetpage listVechicle4(String text) {
        //Maximum rent set text "15"
        $(By.xpath(".//*[2]/app-input-with-label[1 and @class='ng-untouched ng-pristine ng-valid']/div[1 and @class='input-with-label']/input[1 and @class='wono-input wono-input-with-label ng-untouched ng-pristine ng-valid']")).shouldBe(exist).click();
        //Details checkboxes
        $(By.xpath(".//*[5]/label[1 and @class='mat-checkbox-layout']/span[1 and @class='mat-checkbox-label']")).shouldBe(exist).click();
        $(By.xpath(".//*[11]/label[1 and @class='mat-checkbox-layout']/span[1 and @class='mat-checkbox-label']")).shouldBe(exist).click();
        return this;
    }

    public WonoAssetpage listVechicle5(String text) {
        //Set description of asset
        $(By.xpath(".//*[@class='wono-textarea ng-untouched ng-pristine ng-valid']")).shouldBe(exist).click();
        //Photo upload button
        $(By.xpath(".//*[@class='add-photo flex-centered flex-column flex-justify-centered']")).shouldBe(exist).click();
        return this;
    }
}
