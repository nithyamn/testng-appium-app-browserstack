package com.browserstack.suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

import com.browserstack.BrowserStackTestNGTest;

public class SuiteTest01 extends BrowserStackTestNGTest {

    @Test
    public void test_01() throws Exception {
      WebElement searchElement = new WebDriverWait(driver, 30).until(
          ExpectedConditions.elementToBeClickable(By.id("Search Wikipedia")));
      searchElement.click();
      WebElement insertTextElement = new WebDriverWait(driver, 30).until(
          ExpectedConditions.elementToBeClickable(By.id("org.wikipedia.alpha:id/search_src_text")));
      insertTextElement.sendKeys("BrowserStack 01");
      Thread.sleep(5000);

      List<WebElement> allProductsName = driver.findElements(By.className("android.widget.TextView"));
      Assert.assertTrue(allProductsName.size() > 0);
    }
}
