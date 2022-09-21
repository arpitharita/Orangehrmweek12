package com.orangehrm.testsuite;

 import com.orangehrm.pages.AddUserPage;
 import com.orangehrm.pages.LoginPage;
 import com.orangehrm.pages.ViewSystemUsersPage;
 import com.orangehrm.tastbase.TestBase;
 import org.testng.annotations.Test;

public class UsersTest extends TestBase {

    LoginPage loginpage = new LoginPage();

    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();

    AddUserPage addUserPage =new AddUserPage();

    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {

        loginpage.LoginToApplication("Admin","admin123");
        viewSystemUsersPage.clickAdminLink();
        viewSystemUsersPage.getSystemUserText();
        viewSystemUsersPage.clickAddButton();
        viewSystemUsersPage.AddUser();
        viewSystemUsersPage.selectAdminRole();
        viewSystemUsersPage.enterEmp();
        viewSystemUsersPage.enterUser();
        viewSystemUsersPage.selectDisableOption();
        viewSystemUsersPage.enterPass();
        viewSystemUsersPage.enterConfirmPass();
        viewSystemUsersPage.clickOnSaveButton();
}
    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginpage.LoginToApplication("Admin","admin123");
        viewSystemUsersPage.clickAdminLink();
        viewSystemUsersPage.getSystemUserText();
        addUserPage.enterUser();
        addUserPage.SelectUserRole();
        addUserPage.SelectStatus();
        addUserPage.ClickSearchButton();
        addUserPage.VerifyResultList();

    }
    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        this.searchTheUserCreatedAndVerifyIt();

        addUserPage.clickOnCheckbox();
        addUserPage.ClickDeleteButton();
        addUserPage.PopUpClick();
        addUserPage.VerifyMsgCheck();


    }
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {

        loginpage.LoginToApplication("Admin","admin123");
        viewSystemUsersPage.clickAdminLink();
        viewSystemUsersPage.getSystemUserText();
        addUserPage.enterUser();
        addUserPage.SelectUserRole();
        addUserPage.SelectStatus();
        addUserPage.SearchButtonDelete();
        addUserPage.VerifyNoRecordFound();

    }
}