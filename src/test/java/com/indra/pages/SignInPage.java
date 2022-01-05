package com.indra.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation")

public class SignInPage extends PageObject {
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    /** correo para registrar */

    @FindBy(id = "email_create")
    private WebElementFacade email;

    @FindBy(id = "SubmitCreate")
    private WebElementFacade btnCreatedAccount;

    /** Formulario de registro*/

    @FindBy(id = "customer_lastname")
    private  WebElementFacade lastname;

    @FindBy(id = "customer_firstname")
    private WebElementFacade firtsname;

    @FindBy(id = "address1")
    private WebElementFacade address1;

    @FindBy(id = "passwd")
    private WebElementFacade password;

    @FindBy(id = "city")
    private WebElementFacade city;

    @FindBy(id = "id_state")
    private WebElementFacade state;

    @FindBy(id = "postcode")
    private WebElementFacade postcode;

    @FindBy(id = "id_country")
    private WebElementFacade country;

    @FindBy(id = "phone")
    private  WebElementFacade phonenumber;

    @FindBy(id = "submitAccount")
    private WebElementFacade btnCrearRegistro;

    @FindBy(css = "h1")
    private WebElementFacade tituloPagina;

    public WebElementFacade getEmail() {
        return email;
    }

    public WebElementFacade getBtnCreatedAccount() {
        return btnCreatedAccount;
    }

    public WebElementFacade getFirtsname() {
        return firtsname;
    }

    public WebElementFacade getLastname() {
        return lastname;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getAddress1() {
        return address1;
    }

    public WebElementFacade getCity() {
        return city;
    }

    public WebElementFacade getPostcode() {
        return postcode;
    }

    public WebElementFacade getPhonenumber() {
        return phonenumber;
    }

    public WebElementFacade getBtnCrearRegistro() {
        return btnCrearRegistro;
    }

    public WebElementFacade getTituloPagina() {
        return tituloPagina;
    }

    public WebElementFacade getState() {
        return state;
    }

    public void selectOptionFromDropDown(By by, String visibleText){
        Select select = new Select(getDriver().findElement(by));
        select.selectByVisibleText(visibleText);
    }
    public void selectOptionFromDropDown(By by,int index){
        Select select = new Select(getDriver().findElement(by));
        select.selectByIndex(index);
    }

}

