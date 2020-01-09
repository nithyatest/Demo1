package pom;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class flipkartassignmentpom 
		{
	//@FindBy(xpath ="//button[@class=\"_2AkmmA _29YdH8\"]")
      // private WebElement button;
	 @FindBy(xpath="//span[contains(.,'Electronics')]")
	 private WebElement electronic;
	 @FindBy(xpath="//ul[@class=\"QPOmNK\"]/li/a[@title='Mi']")
	 private WebElement mi;
	 @FindBy(xpath="//div[@data-id=\"MOBFKPYDZJQHGJXA\"]/descendant::img[@class='_1Nyybr  _30XEf0']")
	 private WebElement phone;
	 @FindBy(xpath="//button[@class=\"_2AkmmA _2Npkh4 _2MWPVK\"]")
	 private WebElement add;
	 
	 public flipkartassignmentpom(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 public void clickB()
	 {
		 mi.click();
	 }
	 public void phoneclick()
	 {
		 phone.click();
	 }
	 public void clickadd()
	 {
		 add.click();
	 }
	public void mouseover(Actions a)
	{
	  
	a.moveToElement(electronic).perform();
		
				
	}
		}

