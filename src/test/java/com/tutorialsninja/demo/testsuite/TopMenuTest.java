package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.pages.TopMenuBar;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenuBar topMenuBar = new TopMenuBar();
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        topMenuBar.clickOnDesktopLink();
        topMenuBar.selectMenu("Show All Desktops");
        Assert.assertEquals(topMenuBar.getVerifyText(), "Desktops", "Error Message not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        topMenuBar.clickOnLaptopNotebooksLink();
        topMenuBar.selectMenu("Show AllLaptops & Notebooks");
        Assert.assertEquals(topMenuBar.getVerifyText1(), "Laptops & Notebooks", "Error Message not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        topMenuBar.clickOnComponantsLink();
        topMenuBar.selectMenu("Show AllComponents");
        Assert.assertEquals(topMenuBar.getVerifyText2(), "Components", "Error Message not displayed");
    }
}
