package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    By User = By.xpath("//div[@class='oxd-topbar-body']/nav[1]/ul[1]/li[1]/span[1]/i[1]");

    By Job = By.xpath("//div[@class='oxd-topbar-body']/nav[1]/ul[1]/li[2]/span[1]/i[1]");

    By Organization = By.xpath("//div[@class='oxd-topbar-body']/nav[1]/ul[1]/li[3]/span[1]/i[1]");


    public void UserManagement() throws InterruptedException {
        clickOnElement(User);
        Thread.sleep(1000);

    }
    public void ClickJob() throws InterruptedException {
        clickOnElement(Job);
        Thread.sleep(1000);

    }
    public void ClickOrganization()
    {
        clickOnElement(Organization);

    }
}
