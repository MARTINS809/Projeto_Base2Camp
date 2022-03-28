package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CompleteCaseReportPage;

import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.NavigatePage;
import com.javaseleniumtemplate.pages.ReportCase;
import org.junit.Assert;
import org.junit.Test;

public class ReportCaseTests extends TestBase {


    //Objects
    LoginFlows loginFlows;
    ReportCase reportCase;
    CompleteCaseReportPage completeCaseReportPage;
    LoginPage loginPage;
    NavigatePage navigatepage;


    //Tests
    @Test
    public void relatarCaso(){

        //Objects instances
        loginFlows = new LoginFlows();
        reportCase = new ReportCase();
        completeCaseReportPage = new CompleteCaseReportPage();
        loginPage = new LoginPage();
        navigatepage = new NavigatePage();

        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String resumo = "Teste Projeto Base2Camp2";
        String descricaoTeste = "Passo a passo de como executar o Teste";
        String mensagemConfirmacaoCasoRelatado = "Operação realizada com sucesso.";
        String mensagemConfirmacaoLoginEsperada = "(Felipe Martins do Nascimeto - gerente)";


        //Test
        loginFlows.efetuarLogin(usuario,senha);
        navigatepage.clicarEmRelatarCaso();
        reportCase.clicarEmSelectProject();
        completeCaseReportPage.preencherCamposObrigatorios(resumo,descricaoTeste);
        completeCaseReportPage.atribuirAUsuario();
        completeCaseReportPage.selecionarVisibilidadePrivada();
        completeCaseReportPage.selecionarParaContinuarReportando();
        completeCaseReportPage.clicarEnviarRelatorio();


        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),mensagemConfirmacaoLoginEsperada);
        Assert.assertTrue(completeCaseReportPage.menssagenConfirmandoCasoRelatado().contains(mensagemConfirmacaoCasoRelatado));

    }


    @Test
    public void relatarCasoSemPeecherCategoria(){

        //Objects instances
        loginFlows = new LoginFlows();
        reportCase = new ReportCase();
        completeCaseReportPage = new CompleteCaseReportPage();
        loginPage = new LoginPage();
        navigatepage = new NavigatePage();


        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String resumo = "Teste Projeto Base2Camp2";
        String descricaoTeste = "Passo a passo de como executar o Teste";
        String mensagemErroPreencherCategoria = "'Categoria'";
        String mensagemConfirmacaoLoginEsperada = "(Felipe Martins do Nascimeto - gerente)";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        navigatepage.clicarEmRelatarCaso();
        reportCase.clicarEmSelectProject();
        completeCaseReportPage.resumoDoTeste(resumo);
        completeCaseReportPage.descricaoDoTeste(descricaoTeste);
        completeCaseReportPage.atribuirAUsuario();
        completeCaseReportPage.selecionarVisibilidadePrivada();
        completeCaseReportPage.selecionarParaContinuarReportando();
        completeCaseReportPage.clicarEnviarRelatorio();


        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),mensagemConfirmacaoLoginEsperada);
        Assert.assertTrue(completeCaseReportPage.retornaMensagemErroCategoriaNaoPreechida().contains(mensagemErroPreencherCategoria));
    }


    @Test
    public void relatarCasoSemPeecherResumo(){

        //Objects instances
        loginFlows = new LoginFlows();
        reportCase = new ReportCase();
        completeCaseReportPage = new CompleteCaseReportPage();
        loginPage = new LoginPage();
        navigatepage = new NavigatePage();

        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String descricaoTeste = "Passo a passo de como executar o Teste";
        String mensagemErroPreencherResumo = "'Resumo'";
        String mensagemConfirmacaoLoginEsperada = "(Felipe Martins do Nascimeto - gerente)";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        navigatepage.clicarEmRelatarCaso();
        reportCase.clicarEmSelectProject();
        completeCaseReportPage.selecionarCategoria();
        completeCaseReportPage.descricaoDoTeste(descricaoTeste);
        completeCaseReportPage.atribuirAUsuario();
        completeCaseReportPage.selecionarVisibilidadePrivada();
        completeCaseReportPage.selecionarParaContinuarReportando();
        completeCaseReportPage.clicarEnviarRelatorio();


        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),mensagemConfirmacaoLoginEsperada);
        Assert.assertTrue(completeCaseReportPage.retornaMensagemErroResumoNaoPreesnchido().contains(mensagemErroPreencherResumo));
    }


    @Test
    public void relatarCasoSemPeecherDescricao(){

        //Objects instances
        loginFlows = new LoginFlows();
        reportCase = new ReportCase();
        completeCaseReportPage = new CompleteCaseReportPage();
        loginPage = new LoginPage();
        navigatepage = new NavigatePage();

        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String resumo= "Teste Projeto Base2Camp2";
        String mensagemErroPreencherResumo = "'Descrição'";
        String mensagemConfirmacaoLoginEsperada = "(Felipe Martins do Nascimeto - gerente)";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        navigatepage.clicarEmRelatarCaso();
        reportCase.clicarEmSelectProject();
        completeCaseReportPage.selecionarCategoria();
        completeCaseReportPage.resumoDoTeste(resumo);
        completeCaseReportPage.atribuirAUsuario();
        completeCaseReportPage.selecionarVisibilidadePrivada();
        completeCaseReportPage.selecionarParaContinuarReportando();
        completeCaseReportPage.clicarEnviarRelatorio();

        //Colocar mais um assert para confirmação da pagina de relater caso.
        Assert.assertEquals(loginPage.retornaMensagemConfirmLogin(),mensagemConfirmacaoLoginEsperada);
        Assert.assertTrue(completeCaseReportPage.retornaMensagemDescricaoNaoPreenchida().contains(mensagemErroPreencherResumo));
    }

}
