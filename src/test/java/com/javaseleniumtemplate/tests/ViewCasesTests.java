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
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String mensagemConfirmacaoLoginEsperada = "(Felipe Martins do Nascimeto - gerente)";
        String mensagemConfirmacaoVerCaso = "Visualizando Casos";
        String mensagemConfirmacaoUsuarioAtribuido = "felipe.martins";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        navigatepage.clicarEmVerCaso();
        viewsCasesPage.clicarAtribuidoA();
        viewsCasesPage.filtrarUsuario();
        viewsCasesPage.clicarEmFiltrar();


        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),mensagemConfirmacaoLoginEsperada);
        Assert.assertEquals(viewsCasesPage.confirmarUsuarioAtribuido(),mensagemConfirmacaoUsuarioAtribuido);
        Assert.assertTrue(navigatepage.confirmaPaginaVerCaso().contains(mensagemConfirmacaoVerCaso));

    }

    @Test
    public void filterTestCaseByCategory() {
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        viewsCasesPage = new ViewsCasesPage();
        navigatepage = new NavigatePage();


        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String mensagemConfirmacaoLoginEsperada = "(Felipe Martins do Nascimeto - gerente)";
        String mensagemConfirmacaoVerCaso = "Visualizando Casos";
        String mensagemConfirmacaoDaCategoria = "Teste Felipe";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        navigatepage.clicarEmVerCaso();
        viewsCasesPage.clicarEmFitrarCategoria();
        viewsCasesPage.clicarEmTesteFalipe();
        viewsCasesPage.clicarEmFiltrar();

        System.out.println(viewsCasesPage.confirmarCategoriaSelecionada());

        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),mensagemConfirmacaoLoginEsperada);
        Assert.assertEquals(viewsCasesPage.confirmarCategoriaSelecionada(),mensagemConfirmacaoDaCategoria);
        Assert.assertTrue(navigatepage.confirmaPaginaVerCaso().contains(mensagemConfirmacaoVerCaso));

    }

    @Test
    public void filterTestCaseByGravidade() {
        //Objects instances
        loginPage = new LoginPage();
        loginFlows = new LoginFlows();
        viewsCasesPage = new ViewsCasesPage();
        navigatepage = new NavigatePage();


        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String mensagemConfirmacaoLoginEsperada = "(Felipe Martins do Nascimeto - gerente)";
        String mensagemConfirmacaoVerCaso = "Visualizando Casos";
        String mensagemConfirmacaoGravidade = "grande";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        navigatepage.clicarEmVerCaso();
        viewsCasesPage.clicarEmFitrarGravidade();
        viewsCasesPage.clicarEmGrande();
        viewsCasesPage.clicarEmFiltrar();

        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),mensagemConfirmacaoLoginEsperada);
        Assert.assertEquals(viewsCasesPage.confirmarGravidadeSelecionada(),mensagemConfirmacaoGravidade);
        Assert.assertTrue(navigatepage.confirmaPaginaVerCaso().contains(mensagemConfirmacaoVerCaso));

    }

}
