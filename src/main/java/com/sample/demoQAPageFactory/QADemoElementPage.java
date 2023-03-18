package com.sample.demoQAPageFactory;

import com.sample.util.custUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

import static com.sample.util.testBed.driver;

public class QADemoElementPage {

    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    custUtil custUtil=new custUtil();
    Actions actions=new Actions(driver);

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
//        custUtil.captureScreenShot(driver,"TextBox Clicked");
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
//           custUtil.captureScreenShot(driver,"textBoxSubmit");
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
            custUtil.scrollToElement(driver,dropDownHome);
        dropDownHome.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void clickDropdownDownload(){
        wait.until(ExpectedConditions.visibilityOf(dropDownDownload));
        wait.until(ExpectedConditions.elementToBeClickable(dropDownDownload));
        try{
            custUtil.scrollToElement(driver,dropDownDownload);
        dropDownDownload.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void clickExcelFile(){
        wait.until(ExpectedConditions.visibilityOf(excelFile));
        wait.until(ExpectedConditions.elementToBeClickable(excelFile));
        try{
            custUtil.scrollToElement(driver,excelFile);
        excelFile.click();
        }catch (Exception e){
            System.out.println(e);
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
            custUtil.scrollToElement(driver,radioButton);
        radioButton.click();
        }catch (Exception e){

            System.out.println(e);
        }
    }
    public void clickImpressiveRadioButton(){
        wait.until(ExpectedConditions.visibilityOf(impressivRadioButton));
        wait.until(ExpectedConditions.elementToBeClickable(impressivRadioButton));
        try{
            custUtil.scrollToElement(driver,impressivRadioButton);
        impressivRadioButton.click();
        }catch (Exception e){
            System.out.println(e);
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
            System.out.println(e);
        }
    }
    public void clickAddButton(){
        wait.until(ExpectedConditions.visibilityOf(addRecordButton));
        wait.until(ExpectedConditions.elementToBeClickable(addRecordButton));
        try{
            custUtil.scrollToElement(driver,addRecordButton);
            addRecordButton.click();
        }catch (Exception e){
            System.out.println(e);
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
            System.out.println(e);
        }
    }

    @FindBy(xpath = "//*[@id=\"item-4\"]/span")
    WebElement buttons;

    @FindBy(xpath = "//button[text()='Double Click Me']")
    WebElement doubleClickMe;
    @FindBy(xpath = "//*[@id=\"doubleClickMessage\"]")
    WebElement doubleClickValidation;

    @FindBy(xpath = "//*[@id=\"rightClickBtn\"]")
    WebElement rightClickMe;
    @FindBy(xpath = "//*[@id=\"rightClickMessage\"]")
    WebElement rightClickValidation;

    @FindBy(xpath = "//button[text()='Click Me']")
    WebElement clickMe;
    @FindBy(xpath = "//*[@id=\"dynamicClickMessage\"]")
    WebElement clickMeValidation;

    public void clickOnButtons(){
        try {
            custUtil.scrollToElement(driver, buttons);
            wait.until(ExpectedConditions.visibilityOf(buttons));
            wait.until(ExpectedConditions.elementToBeClickable(buttons));
            buttons.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void doubleClickOnDoubleClickMeButton(){
        wait.until(ExpectedConditions.visibilityOf(doubleClickMe));
        wait.until(ExpectedConditions.elementToBeClickable(doubleClickMe));
        custUtil.scrollToElement(driver,doubleClickMe);
        actions.doubleClick(doubleClickMe).perform();
    }
    public String doubleClickValidation(){
        wait.until(ExpectedConditions.visibilityOf(doubleClickValidation));
        custUtil.scrollToElement(driver,doubleClickValidation);

        String doubleClickValidate=doubleClickValidation.getText();
        return doubleClickValidate;
    }
    public void rightClickMe(){
        wait.until(ExpectedConditions.visibilityOf(rightClickMe));
        wait.until(ExpectedConditions.elementToBeClickable(rightClickMe));
        custUtil.scrollToElement(driver,rightClickMe);
        actions.contextClick(rightClickMe).perform();
    }
    public String setRightClickValidation(){
        wait.until(ExpectedConditions.visibilityOf(rightClickValidation));
        custUtil.scrollToElement(driver,rightClickValidation);
        String rightClickValidate=rightClickValidation.getText();
        return rightClickValidate;
    }
    public void singleClick(){
        wait.until(ExpectedConditions.visibilityOf(clickMe));
        wait.until(ExpectedConditions.elementToBeClickable(clickMe));
        custUtil.scrollToElement(driver,clickMe);
        actions.click(clickMe).perform();
    }
    public String sigleClickValidation() throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOf(clickMeValidation));
        custUtil.scrollToElement(driver,clickMeValidation);
        String clickMeValidate=clickMeValidation.getText();
        return clickMeValidate;
    }
    @FindBy(xpath = "//span[normalize-space()='Upload and Download']")
    WebElement uploadAndDownloadButton;
    @FindBy(xpath = "//a[@id='downloadButton']")
    WebElement clickToDownload;
    @FindBy(xpath = "//input[@id='uploadFile']")
    WebElement clickToUpload;

    public void clickUploadAndDownloadButton(){
        wait.until(ExpectedConditions.visibilityOf(uploadAndDownloadButton));
        wait.until(ExpectedConditions.elementToBeClickable(uploadAndDownloadButton));
        custUtil.scrollToElement(driver,uploadAndDownloadButton);
        uploadAndDownloadButton.click();
    }
    public void setClickToDownload(){
        wait.until(ExpectedConditions.visibilityOf(clickToDownload));
        wait.until(ExpectedConditions.elementToBeClickable(clickToDownload));
        clickToDownload.click();
    }
    public void setClickToUpload() throws InterruptedException, AWTException {
        wait.until(ExpectedConditions.visibilityOf(clickToUpload));
        wait.until(ExpectedConditions.elementToBeClickable(clickToUpload));
        custUtil.uploadFileUsingRobot("/Users/davinder/Desktop/11111111.png");
    }


    @FindBy(xpath = "//span[normalize-space()='Dynamic Properties']")
    WebElement dynamicPropertiesButton;
    @FindBy(xpath = "//button[@id='visibleAfter']")
    WebElement visibleAfter5SceButton;
    @FindBy(xpath = "//button[@id='colorChange']")
    WebElement buttonColor;

    public void clickDyanamicPropertiesButton(){
        wait.until(ExpectedConditions.visibilityOf(dynamicPropertiesButton));
        wait.until(ExpectedConditions.elementToBeClickable(dynamicPropertiesButton));
        custUtil.scrollToElement(driver,dynamicPropertiesButton);
        dynamicPropertiesButton.click();
    }
    public String visibleAfter5Sec(){
        wait.until(ExpectedConditions.visibilityOf(visibleAfter5SceButton));
        wait.until(ExpectedConditions.elementToBeClickable(visibleAfter5SceButton));
        String actual=visibleAfter5SceButton.getText();
        return actual;
    }

    public String getButtonColor(){
        wait.until(ExpectedConditions.visibilityOf(buttonColor));
        String color=buttonColor.getText();
        return color;
    }

}
