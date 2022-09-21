package com.orangehrm.testsuite;

import com.orangehrm.pages.*;
import com.orangehrm.tastbase.TestBase;
import org.testng.annotations.Test;

public class GrouppingLoginTest extends TestBase {

    HomePage homePage =new HomePage();

    LoginPage loginPage =new LoginPage();

    ViewSystemUsersPage viewSystemUsersPage =new ViewSystemUsersPage();

    DashboardPage dashboardPage =new DashboardPage();

    AdminPage adminPage =new AdminPage();

    @Test (groups = "sanity")
    public void verifyUserShouldLoginSuccessFully()
    {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();

    }

    @Test (groups = "sanity")
    public void verifyThatTheLogoDisplayOnHomePage()
    {
        loginPage.LoginToApplication("Admin","admin123");
        homePage.displayLogoHome();

    }

    @Test (groups = "regression")
    public void verifyUserShouldLogOutSuccessFully() throws InterruptedException {
        loginPage.LoginToApplication("Admin","admin123");
        homePage.userProfileLogoClick();
        homePage.MouseHoverLogo();
        loginPage.getVerifyLogin();

    }
    @Test (groups = "regression")
    public void ClickTab() throws InterruptedException {
        loginPage.LoginToApplication("Admin","admin123");
        homePage.PIMClick();
        homePage.LeaveClick();
        homePage.ClickDashboard();
        homePage.LaunchingSoon();
        dashboardPage.VerifyDashboardPage();
        viewSystemUsersPage.clickAdminLink();
        adminPage.UserManagement();
        adminPage.ClickJob();
        adminPage.ClickOrganization();


    }

}
