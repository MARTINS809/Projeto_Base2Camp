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


    //Tests
    @Test
    public void efetuarLoginUsuarioInvalido(){

        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String usuarioInvalido = "felipe";
        String senha = "Base2Camp";
        String mensagemErroEsperada = "Your account may be disabled or blocked or the username/password you entered is incorrect.";

        //Test
        loginFlows.efetuarLogin(usuarioInvalido,senha);

        Assert.assertEquals(loginPage.retornaMensagemErroLogin(),mensagemErroEsperada);
    }

    @Test
    public void efetuarLoginUsuarioValido(){

        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();

        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String mensagemConfirmacaoLoginEsperada = "(Felipe Martins do Nascimeto - gerente)";


        //Test
        loginFlows.efetuarLogin(usuario,senha);


        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),mensagemConfirmacaoLoginEsperada);
    }


}
