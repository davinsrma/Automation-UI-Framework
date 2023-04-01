package com.misc.misctest;

import com.sample.util.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

public class DataProviderTest {
    @DataProvider(name = "first")
    public Object[][] getData() throws IOException {
        Object [][]data= ExcelUtil.ReadDataFromExcelFile("./src/test/resources/userDataInformation.xlsx","abc");
        return data;
    }
    @Test(dataProvider = "first")
    public void fetchData(String username, String password, String email, String phone, String gender, String age, Method method){
        System.out.println(username+" "+password+" "+email+" "+phone+" "+gender+" "+age);
    }
}
