package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TaskListPage  {
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addNewBtn;//Add New Button
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement newCustomerBtn;
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement entrCusTxtBox;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement entrDescription;
    @FindBy(xpath = "//div[.='- Select Customer -']")
	private WebElement drpDnBtn;
	@FindBy(xpath = "//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement sltCmpnyName;
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement crtBtn;
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div")
	private WebElement titName;
	
	//Project
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newProjectBtn;
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterPjtNmeTxtBx;
	@FindBy(xpath="//div[@class='emptySelection']")
	private WebElement customerDrpdwn;
	@FindBy(xpath="(//div[.='Our company'])[6]")
	private WebElement selectCompanyName;
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement enterDescTxtBox;
	@FindBy(xpath="//div[.='Create Project']")
	private WebElement createPjtBtn;
	
	//Task
	@FindBy(xpath="//div[.='+ New Tasks']")
	private WebElement newTaskBtn;
	@FindBy(xpath="(//div[@class='comboboxButton'])[1]")
	private WebElement custmerDrpDwn;
	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow selected']")
	private WebElement sltCompnyName;
	@FindBy(xpath="(//div[@class='comboboxButton'])[2]")
	private WebElement prjtDropDwn;
	@FindBy(xpath="//div[.='Accounting' and @class='itemRow cpItemRow selected']")
	private WebElement sltAccntng;
	@FindBy(xpath="//input[@placeholder='Enter task name']")
	private WebElement tsknameTxtBox;
	@FindBy(xpath="//div[.='Create Tasks']")
	private WebElement createTask;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 
	}


	public WebElement getAddNewBtn() {
		return addNewBtn;
	}


	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}


	public WebElement getEntrCusTxtBox() {
		return entrCusTxtBox;
	}


	public WebElement getEntrDescription() {
		return entrDescription;
	}


	public WebElement getDrpDnBtn() {
		return drpDnBtn;
	}


	public WebElement getSltCmpnyName() {
		return sltCmpnyName;
	}


	public WebElement getCrtBtn() {
		return crtBtn;
	}


	public WebElement getTitName() {
		return titName;
	}
//Project

	public WebElement getNewProjectBtn() {
		return newProjectBtn;
	}


	public WebElement getEnterPjtNmeTxtBx() {
		return enterPjtNmeTxtBx;
	}


	public WebElement getCustomerDrpdwn() {
		return customerDrpdwn;
	}


	public WebElement getSelectCompanyName() {
		return selectCompanyName;
	}


	public WebElement getEnterDescTxtBox() {
		return enterDescTxtBox;
	}


	public WebElement getCreatePjtBtn() {
		return createPjtBtn;
	}	
	//task


	public WebElement getNewTaskBtn() {
		return newTaskBtn;
	}


	public WebElement getCustmerDrpDwn() {
		return custmerDrpDwn;
	}


	public WebElement getSltCompnyName() {
		return sltCompnyName;
	}


	public WebElement getPrjtDropDwn() {
		return prjtDropDwn;
	}


	public WebElement getSltAccntng() {
		return sltAccntng;
	}


	public WebElement getTsknameTxtBox() {
		return tsknameTxtBox;
	}


	public WebElement getCreateTask() {
		return createTask;
	}
	
     }
   
   
	

