package com.sample.DemoQAPageFactory;

import com.sample.util.custUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

import static com.sample.util.testBed.driver;

public class QADemoElementPage {

WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
custUtil custUtil=new custUtil();

    @FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-0']")
    WebElement textBox;

    @FindBy(id = "userName")
    WebElement textBoxFullName;
    @FindBy(id = "userEmail")
    WebElement textBoxEmail;
    @FindBy(id = "currentAddress")
    WebElement texBoxCurrentAddress;
    @FindBy(id = "permanentAddress")
    WebElement texBoxPermanentAddress;
    @FindBy(xpath= "//*[@id=\"submit\"]")
    WebElement textBoxSubmit;
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement getUsername;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement getEmail;
    @FindBy(xpath = "//*[@id=\"item-1\"]/span")
    WebElement checkBoxButton;
    @FindBy(xpath = "//button[@title='Toggle']//*[name()='svg']")
    WebElement dropDownHome;
    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button")
    WebElement dropDownDownload;
    @FindBy(css = "label[for='tree-node-excelFile'] span[class='rct-title']")
    WebElement excelFile;
    @FindBy(xpath = "//*[@id=\"result\"]/span[2]")
    WebElement excelFileValue;
    @FindBy(xpath = "//*[@id=\"item-2\"]/span")
    WebElement radioButton;
    @FindBy(xpath = "//label[@for='impressiveRadio']")
    WebElement impressivRadioButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span")
    WebElement getImpressivButtonText;
    @FindBy(xpath = "//span[normalize-space()='Web Tables']")
    WebElement webTableButton;
    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    WebElement addRecordButton;

    @FindBy(id="firstName")
    WebElement userFirstname;
    @FindBy(id="lastName")
    WebElement userLastname;
    @FindBy(id = "userEmail")
    WebElement userEmail;
    @FindBy(id = "age")
    WebElement userAge;
    @FindBy(id = "salary")
    WebElement userSalary;
    @FindBy(id = "department")
    WebElement userDepartment;
    @FindBy(id = "submit")
    WebElement userSubmit;








    public void clickTextBox() throws InterruptedException, AWTException {
        wait.until(ExpectedConditions.visibilityOf(textBox));
        wait.until(ExpectedConditions.elementToBeClickable(textBox));
        com.sample.util.custUtil.captureScreenShot(driver,"TextBox Clicked");
        textBox.click();
    }
    public void fillTextBox(String userName, String email, String currAdd, String perAdd){
        wait.until(ExpectedConditions.visibilityOf(textBoxFullName));
        wait.until(ExpectedConditions.elementToBeClickable(textBoxFullName));
        textBoxFullName.sendKeys(userName);
        textBoxEmail.sendKeys(email);
        texBoxCurrentAddress.sendKeys(currAdd);
        texBoxPermanentAddress.sendKeys(perAdd);



    }
    public void clickSubmit(){
        wait.until(ExpectedConditions.visibilityOf(textBoxSubmit));
       wait.until(ExpectedConditions.elementToBeClickable(textBoxSubmit));

       try{
           custUtil.scrollToElement(driver,textBoxSubmit);
           com.sample.util.custUtil.captureScreenShot(driver,"textBoxSubmit");
        textBoxSubmit.click();
       }catch (Exception e){
           System.out.println(e);
       }
    }
    public String getUsername(){
        wait.until(ExpectedConditions.visibilityOf(getUsername));
        String actual=getUsername.getText();
        return actual;
    }
    public String getEmail(){
        wait.until(ExpectedConditions.visibilityOf(getEmail));
        String actual=getEmail.getText();
        return actual;
    }
    public void clickCheckboxButton(){
        wait.until(ExpectedConditions.visibilityOf(checkBoxButton));
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxButton));
        checkBoxButton.click();
    }
    public void clickDropdownHome(){
        wait.until(ExpectedConditions.visibilityOf(dropDownHome));
        wait.until(ExpectedConditions.elementToBeClickable(dropDownHome));
        try{
        dropDownHome.click();
        }catch (Exception e){
            custUtil.pageScrollDown(driver);
            clickDropdownHome();
        }
    }
    public void clickDropdownDownload(){
        wait.until(ExpectedConditions.visibilityOf(dropDownDownload));
        wait.until(ExpectedConditions.elementToBeClickable(dropDownDownload));
        try{
        dropDownDownload.click();
        }catch (Exception e){
            custUtil.pageScrollDown(driver);
            clickDropdownDownload();
        }
    }
    public void clickExcelFile(){
        wait.until(ExpectedConditions.visibilityOf(excelFile));
        wait.until(ExpectedConditions.elementToBeClickable(excelFile));
        try{
        excelFile.click();
        }catch (Exception e){
            custUtil.pageScrollDown(driver);
            clickExcelFile();
        }
    }
    public String getExcelClickValue(){
        wait.until(ExpectedConditions.visibilityOf(excelFileValue));
        String actual=excelFileValue.getText();

        return actual;
    }
    public void clickRadioButton(){
        wait.until(ExpectedConditions.visibilityOf(radioButton));
        wait.until(ExpectedConditions.elementToBeClickable(radioButton));
        try{
        radioButton.click();
        }catch (Exception e){
            custUtil.pageScrollDown(driver);
            clickRadioButton();
        }
    }
    public void clickImpressiveRadioButton(){
        wait.until(ExpectedConditions.visibilityOf(impressivRadioButton));
        wait.until(ExpectedConditions.elementToBeClickable(impressivRadioButton));
        try{
        impressivRadioButton.click();
        }catch (Exception e){
            custUtil.pageScrollDown(driver);
            clickImpressiveRadioButton();
        }
    }
    public String fetchImpressiveButtonText(){
        wait.until(ExpectedConditions.visibilityOf(getImpressivButtonText));
        wait.until(ExpectedConditions.elementToBeClickable(getImpressivButtonText));
        String actual = getImpressivButtonText.getText();
        return actual;
    }

    public void clickWebTableButton(){
        wait.until(ExpectedConditions.visibilityOf(webTableButton));
        wait.until(ExpectedConditions.elementToBeClickable(webTableButton));
        try{
            custUtil.scrollToElement(driver,webTableButton);
            webTableButton.click();
        }catch (Exception e){
//            custUtil.pageScrollDown(driver);
//            clickWebTableButton();
            System.out.println(e);
        }
    }
    public void clickAddButton(){
        wait.until(ExpectedConditions.visibilityOf(addRecordButton));
        wait.until(ExpectedConditions.elementToBeClickable(addRecordButton));
        try{
            addRecordButton.click();
        }catch (Exception e){
            custUtil.pageScrollDown(driver);
            clickAddButton();
        }
    }
    public void fillRegistrationForm(String firstName, String lastName,String uEmail, String age,String salary,String department){
        wait.until(ExpectedConditions.visibilityOf(userFirstname));
        userFirstname.sendKeys(firstName);
        userLastname.sendKeys(lastName);
        userEmail.sendKeys(uEmail);
        userAge.sendKeys(age);
        userSalary.sendKeys(salary);
        userDepartment.sendKeys(department);
    }
    public void submitRegistrationForm(){
        wait.until(ExpectedConditions.visibilityOf(userSubmit));
        wait.until(ExpectedConditions.elementToBeClickable(userSubmit));
        try{
            custUtil.scrollToElement(driver,userSubmit);
            userSubmit.click();

        }catch (Exception e){
//            custUtil.pageScrollDown(driver);
//            submitRegistrationForm();
            System.out.println(e);
        }
    }



}
