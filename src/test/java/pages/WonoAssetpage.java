package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
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
        //Choose the brand list
        //$(byText("Choose the brand")).shouldBe(visible).click();
        //$(By.xpath(".//*[text()='Choose the brand']")).isDisplayed(true).click();
        $(By.xpath(".//mat-select[@id='mat-select-9']/div[@class='mat-select-trigger' and 1]/div[@class='mat-select-arrow-wrapper' and 2]/div[@class='mat-select-arrow' and 1]")).waitUntil(exist, 10000).click();
        $(By.xpath(".//mat-select[@id='mat-select-9']/div[@class='mat-select-trigger' and 1]")).waitUntil(exist, 1000).click();
        //Audi
        $(By.xpath(".//*[14]/span[1 and @class='mat-option-text']/span[1]")).waitUntil(exist, 1000).click();


        //Model list
        //$(By.xpath("..//mat-select[@id='mat-select-3']/div[@class='mat-select-trigger' and 1]")).waitUntil(exist, 2000).click();
        $(By.xpath(".//*[text()='Choose the model']")).waitUntil(exist, 20000).click();
        //A5
        $(By.xpath(".//*[13]/span[1 and @class='mat-option-text']/span[1]")).shouldBe(exist).click();
        //Year list
        $(By.xpath(".//*[@class='mat-select ng-tns-c17-27 ng-untouched ng-pristine ng-invalid mat-select-empty ng-star-inserted']/div[1 and @class='mat-select-trigger']")).shouldBe(exist).click();
        //2016
        $(By.xpath(".//*[9]/span[1 and @class='mat-option-text']")).click();
        //Trim list
        $(By.xpath(".//*[@class='mat-select ng-tns-c17-29 ng-pristine ng-valid mat-select-empty ng-star-inserted ng-touched']/div[1 and @class='mat-select-trigger']")).click();
        //Trim element
        $(By.xpath(".//*[3]/span[1 and @class='mat-option-text']/span[1]")).shouldBe(exist).click();
        //Engine input - set text "2.0L 4cyl"
        //$(By.xpath(".//*[@class='wono-input wono-input-with-label ng-pristine ng-invalid ng-touched']")).shouldBe(exist).setValue(text);
        return this;
    }

    public WonoAssetpage listVechicle1(String text) {
        //Body type
        $(By.xpath(".//*[@class='mat-select ng-tns-c17-31 ng-untouched ng-pristine ng-invalid mat-select-empty ng-star-inserted']/div[1 and @class='mat-select-trigger']")).shouldBe(exist).click();
        //Van
        $(By.xpath(".//*[@id='mat-option-25']")).shouldBe(exist).click();
        //Number of seats
        $(By.xpath(".//*[@class='mat-select ng-tns-c17-33 ng-pristine ng-invalid mat-select-empty ng-star-inserted ng-touched mat-select-invalid']/div[1 and @class='mat-select-trigger']")).shouldBe(exist).click();
        //5
        $(By.xpath(".//*[@id='mat-option-29']")).shouldBe(exist).click();
        //Fuel type
        $(By.xpath(".//*[@class='mat-select ng-tns-c17-35 ng-pristine ng-invalid mat-select-empty ng-star-inserted ng-touched mat-select-invalid']/div[1 and @class='mat-select-trigger']")).shouldBe(exist).click();
        //Gasoline
        $(By.xpath(".//*[3]/span[1 and @class='mat-option-text']")).shouldBe(exist).click();
        //"Automatic" radiobutton
        $(By.xpath(".//*[2]/label[1 and @class='mat-radio-label']/div[2 and @class='mat-radio-label-content']")).shouldBe(exist).click();
        //Odometer list - set text "4"
        $(By.xpath("//*[@class='wono-input ng-dirty ng-touched ng-valid']")).shouldBe(exist).setValue(text);
        return this;
    }

    public WonoAssetpage listVechicle2(String text) {
        //Search location set text "12"
        $(By.xpath(".//*[@class='search wono-input ng-untouched ng-pristine ng-valid invalid-input']")).shouldBe(exist).setValue(text);
        //click third position in list
        $(By.xpath(".//*[3]")).shouldBe(exist).click();
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
