package test;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;
import pages.WonoLoginpage;
import pages.WonoAssetpage;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

public class WonoAddVehicleTest extends BaseTest {
    @Test
    public void userSignIn() {
        open("/");
        new WonoLoginpage()
                .closeTestWindow()
                .loginString("amaga@yandex.ru")
                .passwordString("gqPr<!xqQ[6AA2T,")
                .isUserLogged();
        System.out.println(321321);
        new WonoAssetpage()
                //.listYourAsset()
                //.earnWithWono()
                .listVechicle("2.0L 4cyl")
                .listVechicle1("4")
                .listVechicle2("12")
                .listVechicle3("1")
                .listVechicle4("15")
                .listVechicle5("some asset description");
        System.out.println(488888);

    }

}
