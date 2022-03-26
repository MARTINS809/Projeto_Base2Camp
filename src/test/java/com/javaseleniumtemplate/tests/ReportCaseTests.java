package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CompleteCaseReport;

import com.javaseleniumtemplate.pages.ReportCase;
import org.junit.Assert;
import org.junit.Test;

public class ReportCaseTests extends TestBase {


    //Objects

    LoginFlows loginFlows;
    ReportCase reportCase;
    CompleteCaseReport completeCaseReport;


    //Tests

    @Test
    public void relatarCaso(){

        //Objects instances
        loginFlows = new LoginFlows();
        reportCase = new ReportCase();
        completeCaseReport = new CompleteCaseReport();


        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String resumo = "Teste Projeto Base2Camp2";
        String descricaoTeste =   ("Passo a passo de como executar o Teste");
        String mensagemConfirmacaoCasoRelatado = "Operação realizada com sucesso.";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        reportCase.clicarEmRelatarCaso();
        reportCase.clicarEmSelectProject();
        completeCaseReport.preencherCamposObrigatorios(resumo,descricaoTeste);
        completeCaseReport.atribuirAUsuario();
        completeCaseReport.selecionarVisibilidadePrivada();
        completeCaseReport.selecionarParaContinuarReportando();
        completeCaseReport.clicarEnviarRelatorio();

        Assert.assertTrue(completeCaseReport.menssagenConfirmandoCasoRelatado().contains(mensagemConfirmacaoCasoRelatado));
    }

    @Test
    public void relatarCasoSemPeecherCategoria(){

        //Objects instances
        loginFlows = new LoginFlows();
        reportCase = new ReportCase();
        completeCaseReport = new CompleteCaseReport();

        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String resumo = "Teste Projeto Base2Camp2";
        String descricaoTeste = "Passo a passo de como executar o Teste";
        String mensagemErroPreencherCategoria = "'Categoria'";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        reportCase.clicarEmRelatarCaso();
        reportCase.clicarEmSelectProject();
        completeCaseReport.resumoDoTeste(resumo);
        completeCaseReport.descricaoDoTeste(descricaoTeste);
        completeCaseReport.atribuirAUsuario();
        completeCaseReport.selecionarVisibilidadePrivada();
        completeCaseReport.selecionarParaContinuarReportando();
        completeCaseReport.clicarEnviarRelatorio();

        Assert.assertTrue(completeCaseReport.retornaMensagemErroCategoriaNaoPreechida().contains(mensagemErroPreencherCategoria));
    }

    @Test
    public void relatarCasoSemPeecherResumo(){

        //Objects instances
        loginFlows = new LoginFlows();
        reportCase = new ReportCase();
        completeCaseReport = new CompleteCaseReport();

        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String descricaoTeste = "Passo a passo de como executar o Teste";
        String mensagemErroPreencherResumo = "'Resumo'";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        reportCase.clicarEmRelatarCaso();
        reportCase.clicarEmSelectProject();
        completeCaseReport.selecionarCategoria();
        completeCaseReport.descricaoDoTeste(descricaoTeste);
        completeCaseReport.atribuirAUsuario();
        completeCaseReport.selecionarVisibilidadePrivada();
        completeCaseReport.selecionarParaContinuarReportando();
        completeCaseReport.clicarEnviarRelatorio();

        Assert.assertTrue(completeCaseReport.retornaMensagemErroResumoNaoPreesnchido().contains(mensagemErroPreencherResumo));
    }

    @Test
    public void relatarCasoSemPeecherDescricao(){

        //Objects instances
        loginFlows = new LoginFlows();
        reportCase = new ReportCase();
        completeCaseReport = new CompleteCaseReport();

        //Parameteres
        String usuario = "felipe.martins";
        String senha = "Base2Camp";
        String resumo= "Teste Projeto Base2Camp2";
        String mensagemErroPreencherResumo = "'Descrição'";

        //Test
        loginFlows.efetuarLogin(usuario,senha);
        reportCase.clicarEmRelatarCaso();
        reportCase.clicarEmSelectProject();
        completeCaseReport.selecionarCategoria();
        completeCaseReport.resumoDoTeste(resumo);
        completeCaseReport.atribuirAUsuario();
        completeCaseReport.selecionarVisibilidadePrivada();
        completeCaseReport.selecionarParaContinuarReportando();
        completeCaseReport.clicarEnviarRelatorio();

        Assert.assertTrue(completeCaseReport.retornaMensagemDescricaoNaoPreenchida().contains(mensagemErroPreencherResumo));
    }



}
