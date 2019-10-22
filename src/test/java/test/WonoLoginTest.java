package test;
import org.junit.Test;
import pages.WonoLoginpage;

import static com.codeborne.selenide.Selenide.*;

public class WonoLoginTest extends BaseTest{
    @Test
    public void userSignIn() {
        open("/");
        new WonoLoginpage()
                .closeTestWindow()
                .loginString("amaga@yandex.ru")
                .passwordString("gqPr<!xqQ[6AA2T,")
                .isUserLogged();
        System.out.println(321321);
    }

}

