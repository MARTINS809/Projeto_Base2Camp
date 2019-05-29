package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.basees.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.BugReportPage;
import com.javaseleniumtemplate.pages.MainPage;
import org.testng.annotations.Test;

public class ReportIssueTests extends TestBase {
    //Objects
    LoginFlows loginFlows;
    MainPage mainPage;
    BugReportPage bugReportPage;

    //Tests
    @Test
    public void cadastrarNovaIssueComSucessoInformandoSomenteCamposObrigatorios(){
        //Objects instances
        loginFlows = new LoginFlows();
        mainPage = new MainPage();
        bugReportPage = new BugReportPage();

        //Parameteres
        String usuario = "templateautomacao";
        String senha = "123456";
        String categoria = "[All Projects] Desafio jMeter";
        String resumo = "Resumo teste automático ";
        String descricao = "Descrição teste automático";
        String caminhoArquivo = "Resources/Files/anexo_ocorrencia.jpg";

        //Test
        loginFlows.efetuarLogin(usuario, senha);
        mainPage.clicarEmReportIssue();
        bugReportPage.selecionarCategoria(categoria);
        bugReportPage.preencherResumo(resumo);
        bugReportPage.preencherDescricao(descricao);
        bugReportPage.InserirAnexo(caminhoArquivo);
        bugReportPage.ClicarEmSubmitReport();
    }
}
