package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.NavigatePage;
import com.javaseleniumtemplate.pages.ViewsCasesPage;
import org.junit.Assert;
import org.junit.Test;

public class ViewCasesTests extends TestBase {


    //Objects
    LoginPage loginPage;
    LoginFlows loginFlows;
    ViewsCasesPage viewsCasesPage;
    NavigatePage navigatepage;

    @Test
    public void filterTestCaseByAssignment() {
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        viewsCasesPage = new ViewsCasesPage();
        navigatepage = new NavigatePage();


        //Parameteres
        String username = "felipe.martins";
        String password = "Base2Camp";
        String loginConfirmation = "(Felipe Martins do Nascimeto - gerente)";
        String viewCaseConfirmation = "Visualizando Casos";
        String assignedUserConfirmation = "felipe.martins";

        //Test
        loginFlows.efetuarLogin(username,password);
        navigatepage.clicarEmVerCaso();
        viewsCasesPage.clicarAtribuidoA();
        viewsCasesPage.filtrarUsuario();
        viewsCasesPage.clicarEmFiltrar();


        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),loginConfirmation);
        Assert.assertEquals(viewsCasesPage.confirmarUsuarioAtribuido(),assignedUserConfirmation);
        Assert.assertTrue(navigatepage.confirmaPaginaVerCaso().contains(viewCaseConfirmation));

    }

    @Test
    public void filterTestCaseByCategory() {
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        viewsCasesPage = new ViewsCasesPage();
        navigatepage = new NavigatePage();


        //Parameteres
        String username = "felipe.martins";
        String password = "Base2Camp";
        String mensagemConfirmacaoLoginEsperada = "(Felipe Martins do Nascimeto - gerente)";
        String viewCaseConfirmation = "Visualizando Casos";
        String assignedUserConfirmation = "Teste Felipe";

        //Test
        loginFlows.efetuarLogin(username,password);
        navigatepage.clicarEmVerCaso();
        viewsCasesPage.clicarEmFitrarCategoria();
        viewsCasesPage.clicarEmTesteFalipe();
        viewsCasesPage.clicarEmFiltrar();

        System.out.println(viewsCasesPage.confirmarCategoriaSelecionada());

        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),mensagemConfirmacaoLoginEsperada);
        Assert.assertEquals(viewsCasesPage.confirmarCategoriaSelecionada(),assignedUserConfirmation);
        Assert.assertTrue(navigatepage.confirmaPaginaVerCaso().contains(viewCaseConfirmation));

    }

    @Test
    public void filterTestCaseByGravidade() {
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        viewsCasesPage = new ViewsCasesPage();
        navigatepage = new NavigatePage();


        //Parameteres
        String username = "felipe.martins";
        String password = "Base2Camp";
        String loginConfirmation = "(Felipe Martins do Nascimeto - gerente)";
        String viewCaseConfirmation = "Visualizando Casos";
        String assignedUserConfirmation = "grande";

        //Test
        loginFlows.efetuarLogin(username,password);
        navigatepage.clicarEmVerCaso();
        viewsCasesPage.clicarEmFitrarGravidade();
        viewsCasesPage.clicarEmGrande();
        viewsCasesPage.clicarEmFiltrar();

        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),loginConfirmation);
        Assert.assertEquals(viewsCasesPage.confirmarGravidadeSelecionada(),assignedUserConfirmation);
        Assert.assertTrue(navigatepage.confirmaPaginaVerCaso().contains(viewCaseConfirmation));

    }

}
