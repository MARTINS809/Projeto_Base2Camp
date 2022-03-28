package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.NavigatePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public class BuscarCasoTests extends TestBase {

    //Objects
    LoginFlows loginFlows;
    NavigatePage navigatepage;



    //Tests
    @Test
    public void buscarCaso() {


        //Objects instances
        loginFlows = new LoginFlows();
        navigatepage = new NavigatePage();


        //Parameteres
        String username = "felipe.martins";
        String senha = "Base2Camp";
        String numberSeach = "9068";



        //Test
        loginFlows.efetuarLogin(username, senha);
        navigatepage.preencherBusca(numberSeach);
        navigatepage.clicarIrPara();

        Assert.assertTrue(navigatepage.confirmaNumeroDoCasoProcurado().contains(numberSeach));
    }

    //Tests
    @Test
    public void buscarErro() {

        //Objects instances
        loginFlows = new LoginFlows();
        navigatepage = new NavigatePage();

        //Parameteres
        String username = "felipe.martins";
        String password = "Base2Camp";
        String numberSeach = "9062228";



        //Test
        loginFlows.efetuarLogin(username, password);
        navigatepage.preencherBusca(numberSeach);
        navigatepage.clicarIrPara();

       Assert.assertTrue(navigatepage.erroDeBusca().contains(numberSeach));
    }

}
