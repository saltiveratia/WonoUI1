package test;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;

public class BaseTest {
    @BeforeClass
    public static void setup() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://release.wono.ai";

    }


}
