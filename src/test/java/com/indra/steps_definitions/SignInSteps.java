package com.indra.steps_definitions;


import com.indra.actions.SignInActions;
import com.indra.models.SignInFormulary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SignInSteps {
    @Managed
    WebDriver driver;
    SignInActions signInActions = new SignInActions(driver);

    @Given("^el usuario se encuentra en la opcion Sign In$")
    public void elUsuarioSeEncuentraEnLaOpcionSignIn() {
        System.out.println("Llego hasta abrir chrome");
        signInActions.open();
    }

    @When("^el usuario ingresa un correo valido$")
    public void elUsuarioIngresaUnCorreoValido() {
        System.out.println("Llego hasta validar correo");
        signInActions.clickOnCreateUser();
    }

    @When("^el usuario diligencia el formulario con los datos requeridos$")
    public void elUsuarioDiligenciaElFormularioConLosDatosRequeridos(List<SignInFormulary> signInFormularies) {
        System.out.println("Llego hasta llenar formulario");
        signInActions.clickOnCreateRecord(signInFormularies.get(0));

    }

    @Then("^el sisteme deberia realizar el registro, dirigiendo al usuario a la pagina My Account$")
    public void elSistemeDeberiaRealizarElRegistroDirigiendoAlUsuarioALaPaginaMyAccount() {
            MatcherAssert.assertThat("El usuario esta en la paguina MY ACCOUNT",
                signInActions.getPageName(), Matchers.equalTo("MY ACCOUNT"));
    }
}
