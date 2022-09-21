package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    By DashboardPage = By.xpath("//div[@class='oxd-topbar-header']/div[1]/span[1]/h6[1]");


    public String VerifyDashboardPage()
    {
        return getTextFromElement(DashboardPage);

    }
}
