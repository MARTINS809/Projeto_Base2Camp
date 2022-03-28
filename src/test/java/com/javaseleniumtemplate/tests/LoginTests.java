package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;


public class LoginTests extends TestBase {

    //Objects
    LoginPage loginPage;
    LoginFlows loginFlows;


    //Teste
    @Test
    public void efetuarLoginUsuarioInvalido(){

        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String invalidUsername = "felipe";
        String password = "Base2Camp";
        String expectedErrorMenssage = "Your account may be disabled or blocked or the username/password you entered is incorrect.";

        //Test
        loginFlows.efetuarLogin(invalidUsername,password);

        Assert.assertEquals(loginPage.retornaMensagemErroLogin(),expectedErrorMenssage);
    }

    @Test
    public void efetuarLoginUsuarioValido(){

        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String username = "felipe.martins";
        String password = "Base2Camp";
        String loginConfirmationMenssage = "(Felipe Martins do Nascimeto - gerente)";


        //Test
        loginFlows.efetuarLogin(username,password);


        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),loginConfirmationMenssage);
    }


}
