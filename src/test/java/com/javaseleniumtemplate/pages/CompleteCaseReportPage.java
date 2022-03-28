package com.javaseleniumtemplate.pages;

import org.openqa.selenium.By;

public class CompleteCaseReportPage extends ReportCase {


    By categoryIdComBox = By.name("category_id");
    By selectCategoryComboBox = By.xpath("//option[text()='[Todos os Projetos] Teste Felipe']");
    By selectFrequencyComboBox = By.xpath("//option[text()='sempre']");
    By selectGravityComboBox = By.xpath("//option[text()='grande']");
    By selectPriorityComboBox = By.xpath("//option[text()='urgente']");
    By selectProfileComboBox = By.xpath("//option[text()='Desktop  Windows 10']");
    By platformField = By.id("plaform");
    By osField = By.id("os");
    By osBildField = By.id("os_build");
    By selectUserNameComboBox = By.xpath("//option[text()='felipe.martins']");
    By summaryField = By.name("summary");
    By descriptionField = By.name("description");

    By stepToReproduceField = By.name("steps_to_reproduce");
    By additionalInfoField = By.name("additional_info");
    By ufileButton = By.id("ufile[]");
    By selectVisibilityPublicButton = By.cssSelector("input[value='10']");
    By selectVisibilityPrivateButton  = By.cssSelector("input[value='50']");
    By reportStayCheckBox = By.id("report_stay");
    By clickSendReportButton = By.cssSelector("input[value='Enviar Relatório']");





    public void preencherCamposObrigatorios( String resumo, String descricao){
        click(selectCategoryComboBox);
        sendKeys(summaryField, resumo);
        sendKeys(descriptionField, descricao );
    }

    public void clicanaSelecionarCatecoria (){click(categoryIdComBox);}

    public void selecionarCategoria(){click(selectCategoryComboBox);}

    public void alterarFrequenciaDeTentativa(){click(selectFrequencyComboBox);}

    public void selecionarTipoDeGravidade(){click(selectGravityComboBox);}

    public void selecionarTipoDePrioridade(){click(selectPriorityComboBox);}

    public void selecionarTipoDePerfil(){click(selectProfileComboBox);}

    public void preencherTipoDePlataforma(String plataforma){sendKeys(platformField, plataforma);}

    public void preencherTipoDeSO(String so){sendKeys(osField, so);}

    public void preencherVersãoDoSO(String versaoSO){sendKeys(osBildField,versaoSO);}

    public void atribuirAUsuario(){click(selectUserNameComboBox);}

    public void resumoDoTeste(String resumo){sendKeys(summaryField, resumo);}

    public void descricaoDoTeste(String passoAPasso){sendKeys(descriptionField,passoAPasso);}

    public void adicionarPassosparaTeste(String informacoes){sendKeys(stepToReproduceField,informacoes);}

    public void informacaoAdicionalDoTeste(String informacoes){sendKeys(additionalInfoField,informacoes);}

    public void clicarEmEnviarArquivo(){click(ufileButton);}

    public void selecionarVisibilidadePublica(){click(selectVisibilityPublicButton);}

    public void selecionarVisibilidadePrivada(){click(selectVisibilityPrivateButton);}

    public void selecionarParaContinuarReportando(){click(reportStayCheckBox);}

    public void clicarEnviarRelatorio(){click(clickSendReportButton);}


}
