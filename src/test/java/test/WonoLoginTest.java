package test;
import org.junit.Test;
import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import pages.WonoPage;

import static com.codeborne.selenide.Selenide.*;

public class WonoLoginTest extends BaseTest{
    @Test
    public void userSignIn() {
        open("/");
        new WonoPage()
                .closeTestWindow()
                .loginString("amaga@yandex.ru")
                .passwordString("gqPr<!xqQ[6AA2T,")
                .isUserLogged();
        System.out.println(321321);
    }

}

