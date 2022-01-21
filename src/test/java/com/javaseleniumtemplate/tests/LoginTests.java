package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;
    MainPage mainPage;
    LoginFlows loginFlows;

    //Tests
    @Test
    public void efetuarLoginComSucesso(){
        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();

        //Parameteres
        String usuario = "templateautomacao";
        String senha = "123456";

        //Test
        loginPage.preenhcerUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertEquals(usuario, mainPage.retornaUsernameDasInformacoesDeLogin());
    }

    @Test
    public void efetuarLoginComSucesso_UsandoFlows(){
        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();

        //Parameteres
        String usuario = "templateautomacao";
        String senha = "123456";

        //Test
        loginFlows.efetuarLogin(usuario,senha);

        Assert.assertEquals(usuario, mainPage.retornaUsernameDasInformacoesDeLogin());
    }
}
