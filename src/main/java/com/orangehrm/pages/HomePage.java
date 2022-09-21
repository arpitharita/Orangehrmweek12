package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By displayLogo = By.xpath("//img[@src='/web/images/orangehrm-logo.png?1660914792648']");

    By UserProfileLogo = By.xpath("//span[@class='oxd-userdropdown-tab']/i[1]");

    By MouseHover = By.xpath("//a[@href='/web/index.php/auth/logout']");

    By PIM = By.xpath("//a[@class='oxd-main-menu-item active']");

    By Leave = By.xpath("//div[@class='oxd-sidepanel-body']/ul[1]/li[3]/a[1]/span[1]");

    By Dashboard = By.xpath("//div[@class='oxd-sidepanel-body']/ul[1]/li[8]/a[1]");

    By VerifyLaunching = By.xpath("//div[@class='orangehrm-card-container']/div[1]/h4[1]");




    public String displayLogoHome() {
        return getTextFromElement(displayLogo);

    }
    public void userProfileLogoClick() {
        clickOnElement(UserProfileLogo);

    }
    public void MouseHoverLogo() throws InterruptedException {
        mouseHoverToElementAndClick(MouseHover);
    }
    public void PIMClick() {
        clickOnElement(PIM);

    }
    public void LeaveClick() {
        clickOnElement(Leave);

    }
    public void ClickDashboard() {
        clickOnElement(Dashboard);
    }
    public String LaunchingSoon() {
        return getTextFromElement(VerifyLaunching);

    }
}
