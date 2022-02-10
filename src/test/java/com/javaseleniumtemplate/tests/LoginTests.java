package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    //Tests
    @Test
    public void efetuarLoginComSucesso(){

        //Objects instances
        loginPage = new LoginPage();
        //mainPage = new MainPage();

        //Parameteres
        String usuario = "emailerrado@email.com";
        String senha = "123456";
        String mensagemErroEsperada = "E-mail ou senha inválidos.";

        //Test
        loginPage.clicarEmAceitarCookies();
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertEquals(mensagemErroEsperada, loginPage.retornaMensagemErroLogin());
    }
}
