package com.indra.actions;

import com.indra.models.SignInFormulary;
import com.indra.pages.SignInPage;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@DefaultUrl("/index.php?controller=authentication&back=my-account")

public class SignInActions extends SignInPage {
    public SignInActions(WebDriver driver) {
        super(driver);
    }

    public void fillMail(){
        System.out.println(generateRandomMail());
        enter(generateRandomMail()).into(getEmail());
    }

    public void clickOnCreateUser(){
        fillMail();
        getBtnCreatedAccount().click();
    }

    public void fillRegistrationForm(SignInFormulary signIn)  {
        enter(signIn.getNombre()).into(getFirtsname());
        enter(signIn.getApellido()).into(getLastname());
        enter(signIn.getContrasena()).into(getPassword());
        enter(signIn.getDireccion1()).into(getAddress1());
        enter(signIn.getCiudad()).into(getCity());
        selectOptionFromDropDown(By.id("id_state"),signIn.getEstado());
        enter(signIn.getCodigoPostal()).into(getPostcode());
        enter(signIn.getTelefono()).into(getPhonenumber());
    }

    public void clickOnCreateRecord(SignInFormulary sign_in){
        fillRegistrationForm(sign_in);
        getBtnCrearRegistro().click();
    }

    public String getPageName(){
        return getTituloPagina().getText();
    }
    public String generateRandomMail(){
        int numerous = (int)(Math.random()*10000+1);
         String randomMail=String.valueOf("natalia"+numerous+"@indra.com");
         return randomMail;
    }
}
