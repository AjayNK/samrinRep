package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByCssSelector1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		driver.manage().window().maximize();
		//CSS Cascading Style Sheet
		driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tblinput tbody tr td input#loanamount")).sendKeys("100000");
		
		driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tblinput tbody tr#Tr1 td input#rate")).sendKeys("12");
		
		driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tblinput tbody tr#Tr2 td input#pmonths")).sendKeys("60");
			
		driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#Table1 tbody tr td input#Button1")).click();
		
		Thread.sleep(2000);

		String ActualRes = driver.findElement(By.cssSelector("html body form#form1 div center table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td table tbody tr td div#divfeatures.fontfamilyarial.font12.text table tbody tr td table#tbldata tbody tr td input#EMI")).getAttribute("value");
		
		//System.out.println(output);
		
		String ExpectedRes = "2224.44";
		
		//Validation
		if(ExpectedRes.equals(ActualRes))
		{
			System.out.println("Passed.Correct Value displayed - "+ActualRes);
		}
		else
		{
			System.out.println("Failed. Expected: "+ExpectedRes+" Actual Result "+ActualRes);
		}
		
		driver.close();

	}

}
