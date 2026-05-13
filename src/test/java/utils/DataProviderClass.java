package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "userData")

    public Object[][] getData() {

        return new Object[][] {

                {"Bhagya", "Tester"},
                {"Rahul", "Developer"},
                {"Aman", "Manager"}
        };
    }
}