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
public class ProjectModule extends BaseClass {
@Test
public void testCreatreProject() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("Create Project",true);
	String PjtName = f.getExcelData("CreateProject", 2, 5);
	String EtrDes = f.getExcelData("CreateProject", 2, 6);
	HomePage h=new HomePage(driver);
	h.setTaskes();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewProjectBtn().click();
	t.getEnterPjtNmeTxtBx().sendKeys(PjtName);
	t.getCustomerDrpdwn().click();
	t.getSelectCompanyName().click();
	t.getEnterDescTxtBox().sendKeys(EtrDes);
	t.getCreatePjtBtn().click();
	Thread.sleep(1000);
	 String atitle = t.getTitName().getText();
	 String etitle = PjtName;
	 Assert.assertEquals(atitle, etitle);
}
}
