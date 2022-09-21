package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {

    By AdminClick = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");

    By VerifySystemUserText = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");

    By AddButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    By VerifyAddUser = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");

    By SelectAdminDrop = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");

    By SelectAdmin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");

    By EnterEmpName = By.xpath("//input[@placeholder='Type for hints...']");

    By EnterEmpnam = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Goutam  Ganesh')]");

    By EnterUsername = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input[1]");

    By SelectStatus = By.xpath("//div[@class='oxd-form-row']/div[1]/div[3]/div/div[2]/div/div");

    By SelectDisable = By.xpath("");

    By EnterPassword= By.xpath("//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");

    By EnterConfirmPassword = By.xpath("//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");

    By ClickOnSave = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");




    public void clickAdminLink() {
        clickOnElement(AdminClick);

    }
    public String getSystemUserText() {
        return getTextFromElement(VerifySystemUserText);

    }
    public void clickAddButton() {
        clickOnElement(AddButton);

    }

    public String AddUser() {
        return getTextFromElement(VerifyAddUser);

    }
    public void selectAdminRole() throws InterruptedException {
        clickOnElement(SelectAdminDrop);
        Thread.sleep(1000);
        clickOnElement(SelectAdmin);
        Thread.sleep(1000);

    }
    public void enterEmp() throws InterruptedException {
        sendTextToElement(EnterEmpName,"G");
        Thread.sleep(1000);
        clickOnElement(EnterEmpnam);
    }
    public void enterUser()
    {
        sendTextToElement(EnterUsername,"Harry");
    }
    public void selectDisableOption() throws InterruptedException {
        clickOnElement(SelectStatus);
        Thread.sleep(1000);
        clickOnElement(SelectDisable);
        Thread.sleep(1000);

    }
    public void enterPass() {
        sendTextToElement(EnterPassword,"123@45");
    }

    public void enterConfirmPass() {
        sendTextToElement(EnterConfirmPassword,"123@45");
    }
    public void clickOnSaveButton() {
        clickOnElement(ClickOnSave);
    }
}
