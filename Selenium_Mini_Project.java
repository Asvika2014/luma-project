package com.selenium_topics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selenium_Mini_Project {
	
	
	@Test	
	private void lumo_Functional() throws InterruptedException, IOException, AWTException {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement account = driver.findElement(By.xpath("(//a[text()='Create an Account'])[1]"));
		account.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstname.sendKeys("Sandhiya");
	
	    WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
	    lastname.sendKeys("Srinivasan");
	    
	    WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
	    email.sendKeys("Sand30@gmail.com");
	    
	    WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	    pass.sendKeys("Sandhiya$30");
	    
	    WebElement conpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	    conpass.sendKeys("Sandhiya$30");
	    
	    WebElement create = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	    create.click();
	    
	    driver.navigate().to("https://magento.softwaretestingboard.com/");
	    
	    Actions ac=new Actions(driver);
	    WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
	    ac.moveToElement(men).perform();
	    
	    WebElement tops = driver.findElement(By.xpath("(//a[@aria-haspopup='true'])[5]"));
	    ac.moveToElement(tops).perform();
	    Thread.sleep(2000);
	    
	    WebElement hoodies = driver.findElement(By.xpath("(//span[text()='Hoodies & Sweatshirts'])[2]"));
	    ac.moveToElement(hoodies).perform();
	    ac.click(hoodies).perform();
	    Thread.sleep(2000);
	    
	    WebElement sort = driver.findElement(By.xpath("(//select[@id='sorter'])[1]"));
        Select s =new Select(sort);
        s.selectByIndex(2);
        
        WebElement material = driver.findElement(By.xpath("//div[text()='Material']"));
     	material.click();
     	
     	WebElement hemp = driver.findElement(By.xpath("(//span[@class='count'])[12]"));
	    ac.moveToElement(hemp).perform();
	    ac.click(hemp).perform();
	    
	    String parentwindow = driver.getWindowHandle();
	    System.out.println("parent window ID is " +parentwindow);
	    
	    
	     WebElement hoodie = driver.findElement(By.xpath("//img[@alt='Hero Hoodie']"));
	     ac.contextClick(hoodie);
	     
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_DOWN);
	    //r.keyPress(KeyEvent.VK_ENTER);
	    
	   	    
	    Set<String> windowHandles = driver.getWindowHandles();
	     System.out.println(windowHandles);
	     
	     driver.switchTo().newWindow(WindowType.WINDOW);
		    driver.get("https://magento.softwaretestingboard.com/hero-hoodie.html");
		    Thread.sleep(2000);
	     
	     WebElement size = driver.findElement(By.xpath("//div[@id='option-label-size-143-item-168']"));
	     size.click();
	     
	     WebElement colour = driver.findElement(By.xpath("//div[@option-label='Green']"));
	    colour.click();
	    
	   WebElement quantity = driver.findElement(By.xpath("//input[@type='number']"));
	    quantity.clear();
	    quantity.sendKeys("4");
	    
	    driver.navigate().back();
	    driver.switchTo().window(parentwindow);
	    Thread.sleep(2000);
	    
	    WebElement clearAll = driver.findElement(By.xpath("//span[text()='Clear All']"));
        clearAll.click();
        Thread.sleep(2000);
        
        WebElement firstimage = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[1]"));
        firstimage.click();
        
        WebElement  size1 = driver.findElement(By.xpath("(//div[@class='swatch-option text'])[4]"));
        size1.click();
        
         
	    
	    WebElement color = driver.findElement(By.xpath("(//div[@class='swatch-option color'])[3]"));
	    color.click();
	    
	 	    
	   WebElement addcart = driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]"));	
	   
	   	    addcart.click();
	   	    
	   	    JavascriptExecutor ab= (JavascriptExecutor) driver;
	   	    ab.executeScript("window.scrollBy(0, -2000);");
	   	    
	   	    Thread.sleep(3000);
	    WebElement clickcart= driver.findElement(By.xpath("(//span[@class='counter qty'])[1]"));
	    clickcart.click();
	    Thread.sleep(4000);
	    
	    WebElement editcart = driver.findElement(By.xpath("//span[text()='View and Edit Cart']"));
	    editcart.click();
	    Thread.sleep(2000);
	    
	    WebElement quantity2 = driver.findElement(By.xpath("//input[@class='input-text qty']"));
	    quantity2.clear();
	    quantity2.sendKeys("2");
	    Thread.sleep(2000);
	    JavascriptExecutor js= (JavascriptExecutor) driver;
   	    js.executeScript("window.scrollBy(0, 1000);");
   	    
   	    WebElement updates = driver.findElement(By.xpath("//span[text()='Update Shopping Cart']"));
	    updates.click();
	    Thread.sleep(3000);
	    
	    TakesScreenshot ta =(TakesScreenshot) driver;
	    File source = ta.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Users\\asvik\\eclipse-workspace\\Selenium_Project\\seleniumpro\\image11.png");
	    FileUtils.copyFile(source, destination);
	    Thread.sleep(2000);
	           
	        
	    
     WebElement proceedtocheck = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	    proceedtocheck.click();
	    Thread.sleep(3000);  
	    
	    WebElement email1 = driver.findElement(By.xpath("(//input[@class='input-text'])[3]"));
	    email1.sendKeys("sand123@gmail.com");
	    Thread.sleep(2000);
	    
//	    WebElement pass1 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//	    pass1.sendKeys("sandhiya123");
//	    Thread.sleep(2000);
    
	    WebElement firstname1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    firstname1.sendKeys("Sandhiya");
	    
	    WebElement lastname1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    lastname1.sendKeys("Srinivasan");
	    
        WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	    company.sendKeys("luma clothings");
	    
	    JavascriptExecutor ja=(JavascriptExecutor) driver;
	    ja.executeScript("window.scrollBy(0,2000);");
	    
	    WebElement street1 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	    street1.sendKeys("No.2, bhajankoilstreet");
	    
	    WebElement street2 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	    street2.sendKeys("Ramnagar extn");
	    
	    WebElement street3 = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
	    street3.sendKeys("Lakshminagar");
	    Thread.sleep(2000);
	    
	    WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
	    city.sendKeys("Chennai");
	    
	    WebElement country = driver.findElement(By.xpath("(//select[@class='select'])[2]"));
	    Select st = new Select(country);
	    st.selectByVisibleText("India");
	    
	    WebElement state = driver.findElement(By.xpath("(//select[@class='select'])[1]"));
	    Select te=new Select(state);
	    te.selectByValue("563");
	    
	    WebElement pincode = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
	    pincode.sendKeys("600045");
	    
	    WebElement phoneno = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
	    phoneno.sendKeys("9876453457");
	    Thread.sleep(4000);
	    
//	   WebElement radiobutton = driver.findElement(By.xpath("//input[@type='radio']"));
//	   radiobutton.click();
//	    Thread.sleep(3000);
//	    
	    WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
	    next.click();
	    Thread.sleep(5000);
	    
	    WebElement placeord = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
	    placeord.click();
	    Thread.sleep(4000);
	    
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File source1=ts.getScreenshotAs(OutputType.FILE);
	  File destination1=new File("C:\\Users\\asvik\\eclipse-workspace\\Selenium_Project\\seleniumpro\\purchase.png");
	  FileUtils.copyFile(source1, destination1);
	  System.out.println("**********PROJECT COMPLETED**************8");
		
	}
	
	
		
		
	
	}


