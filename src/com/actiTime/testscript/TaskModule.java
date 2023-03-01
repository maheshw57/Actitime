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
public class TaskModule extends BaseClass {
	
	@Test
	public void testcreateTask() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("create Task",true);
		String TskName = f.getExcelData("CreateTask", 2, 5);
		HomePage h=new HomePage(driver);
		h.setTaskes();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewTaskBtn().click();
		t.getCustmerDrpDwn().click();
		t.getSltCompnyName().click();
		t.getPrjtDropDwn().click();
		t.getSltAccntng().click();
		t.getTsknameTxtBox().sendKeys(TskName);
		t.getCreateTask().click();
		Thread.sleep(1000);
		String eTitle = "Accounting";
		String atitle = t.getTitName().getText();
		Assert.assertEquals(eTitle, atitle);
	}

}
