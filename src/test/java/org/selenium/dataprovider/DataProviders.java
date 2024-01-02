package org.selenium.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name="InvalidUserCredentials")
    public Object[][] userCredentialsData(){
         Object[][] data =new Object[3][2];
         data[0][0]="chinnu.obsqura@gmail.com";
         data[0][1]="chinnu123";

        data[1][0]="chinnu12.obsqura@gmail.com";
        data[1][1]="chinnu123";

        data[2][0]="chinnu.obsqura@gmail.com";
        data[2][1]="chinnu123lalu";
        return data;
    }
}
