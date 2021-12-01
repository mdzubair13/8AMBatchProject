package FbloginPojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.HelperClass;

public class FbLoginPojo extends HelperClass{

public FbLoginPojo() {
PageFactory.initElements(driver, this);
}
        @FindBy(id="email")
        private WebElement txtuser;
       @FindBy(id="pass")
       private WebElement txtpass;
       @FindBy(xpath= "//*[@id=\"loginbutton\"]")
       private WebElement loginbtn;

	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
       
       
        


