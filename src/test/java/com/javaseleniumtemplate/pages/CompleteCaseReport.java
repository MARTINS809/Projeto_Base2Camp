package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class CompleteCaseReport extends ReportCase {


    By clickSelectedCategoryComboBox = By.name("category_id");
    By selectCategoryComboBox = By.xpath("//option[text()='[Todos os Projetos] Teste Felipe']");
    By selectFrequencyComboBox = By.cssSelector("");
    By selectGravityComboBox = By.cssSelector("");
    By selectPriorityComboBox = By.cssSelector("");
    By selectProfileComboBox = By.cssSelector("");
    By fillInPlatformField = By.id("plaform");
    By fillInOperationalSystemField = By.id("os");
    By fillInVersionOperationalSystemField = By.id("os_build");
    By selectAssignUserComboBox = By.xpath("//option[text()='felipe.martins']");
    By fillInResumeField = By.name("summary");
    By fillInDescriptionField = By.name("description");
    By fillInStepToPlayField = By.name("steps_to_reproduce");
    By fillInAdditionalInformationField = By.name("additional_info");
    By clickSendFileButton = By.id("ufile[]");
    By selectVisibilityPublicButton = By.cssSelector("input[value='10']");
    By selectVisibilityPrivateButton  = By.cssSelector("input[value='50']");
    By selectContinueReportingCheckBox = By.id("report_stay");
    By clickSendReportButton = By.cssSelector("input[value='Enviar Relatório']");




    public void preencherCamposObrigatorios( String resumo, String descricao){
        click(selectCategoryComboBox);
        sendKeys(fillInResumeField, resumo);
        sendKeys(fillInDescriptionField, descricao );
    }

    public void clicanaSelecionarCatecoria (){click(clickSelectedCategoryComboBox);}

    public void selecionarCategoria(){click(selectCategoryComboBox);}

    public void alterarFrequenciaDeTentativa(){click(selectFrequencyComboBox);}

    public void selecionarTipoDeGravidade(){click(selectGravityComboBox);}

    public void selecionarTipoDePrioridade(){click(selectPriorityComboBox);}

    public void selecionarTipoDePerfil(){click(selectProfileComboBox);}

    public void preencherTipoDePlataforma(String plataforma){sendKeys(fillInPlatformField, plataforma);}

    public void preencherTipoDeSO(String so){sendKeys(fillInOperationalSystemField, so);}

    public void preencherVersãoDoSO(String versaoSO){sendKeys(fillInVersionOperationalSystemField,versaoSO);}

    public void atribuirAUsuario(){click(selectAssignUserComboBox);}

    public void resumoDoTeste(String resumo){sendKeys(fillInResumeField, resumo);}

    public void descricaoDoTeste(String passoAPasso){sendKeys(fillInDescriptionField,passoAPasso);}

    public void informacaoAdicionalDoTeste(String informacoes){sendKeys(fillInAdditionalInformationField,informacoes);}

    public void  clicarEmEnviarArquivo(){click(clickSendFileButton);}

    public void selecionarVisibilidadePublica(){click(selectVisibilityPublicButton);}

    public void selecionarVisibilidadePrivada(){click(selectVisibilityPrivateButton);}

    public void selecionarParaContinuarReportando(){click(selectContinueReportingCheckBox);}

    public void clicarEnviarRelatorio(){click(clickSendReportButton);}







}
