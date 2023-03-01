package com.actiTime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actiTime.generic.BaseClass;
import com.actiTime.pom.HomePage;
import com.actiTime.pom.TaskListPage;

@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("Create Customer", true);
		String cusname = f.getExcelData("CreateCustomer", 2, 3);
		String EntrDes = f.getExcelData("CreateCustomer", 2, 4);
		HomePage h = new HomePage(driver);
		h.setTaskes();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerBtn().click();
		t.getEntrCusTxtBox().sendKeys(cusname);
		t.getEntrDescription().sendKeys(EntrDes);
		t.getDrpDnBtn().click();
		t.getSltCmpnyName().click();
		t.getCrtBtn().click();
		Thread.sleep(1000); 
		String atitle = t.getTitName().getText();
		Assert.assertEquals(cusname, atitle);
	}
}
