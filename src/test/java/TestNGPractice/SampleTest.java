package TestNGPractice;

import org.testng.annotations.Test;

@Test
public class SampleTest {

	//@Test(invocationCount = 3)                  //(priority = 1)
	public void CreateContact() {
		//.
		System.out.println("Contact created");
	}
	
	//@Test(enabled =false)      //(dependsOnMethods = "CreateContact")                                  //(priority = -1)
	public void ModifyContact() {
		System.out.println("Contact modified");
	}
	
	//@Test(dependsOnMethods = "CreateContact")                                                                      //(priority = 0)
	public void deleteContact() {
		System.out.println("contact deletedb");
	}

}
