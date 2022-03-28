package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class NavigatePage extends PageBase {

    //Mapping
    By minhaVisaoLink = By.linkText("Minha Visão");
    By verCasoLink = By.linkText("Ver Casos");
    By relatarCasoLink = By.linkText("Relatar Caso");
    By registroDeMudancaLink = By.linkText("Registro de Mudanças");
    By planejamentoLink = By.linkText("Planejamento");
    By resumoLink = By.linkText("Resumo");
    By gerenciarLink = By.linkText("Gerenciar");
    By minhaContaLink = By.linkText("Minha Conta");
    By sairLink = By.linkText("Sair");
    By bugIDLabel = By.name("bug_id");
    By irParaButton = By.cssSelector("input[value='Ir para']");
    By visualizandoCasosLabel = By.xpath("//span[contains(text(),'Visualizando ')]");
    By categoryLabel = By.cssSelector("td[class='category']");
    By resumoLabel = By.xpath("//td[normalize-space()='Resumo']");
    By autenticacaoLabel = By.xpath("//td[contains(text(),'Authenticação')]");
    By alterarContaLabel = By.xpath("//td[contains(text(),'Alterar Conta')]");
    By searchErrorLabel = By.cssSelector("p[style='color:red']");
    By numeroEncontadoLabel = By.cssSelector("tbody tr:nth-child(11) td:nth-child(2)");


    //Actions
    public void minhaVisaoLink (){click(minhaVisaoLink);}
    public void clicarEmVerCaso (){click(verCasoLink);}
    public void clicarEmRelatarCaso(){click(relatarCasoLink);}
    public void clicarEmRegistroDeMudanca (){click(registroDeMudancaLink);}
    public void clicarEmPlanejamento (){click(planejamentoLink);}
    public void clicarEmResumo (){click(resumoLink);}
    public void clicarEmGerenciar (){click(gerenciarLink);}
    public void clicarEmminhaConta (){click(minhaContaLink);}
    public void clicarEmSair (){click(sairLink);}
    public void preencherBusca(String caso){sendKeys(bugIDLabel, caso);}
    public void clicarIrPara (){click(irParaButton);}

    public String confirmaPaginaVerCaso(){return getText(visualizandoCasosLabel);}
    public String confirmaPaginaRelatarCaso(){return getText(categoryLabel);}
    public String confirmaPaginaResumo(){return getText(resumoLabel);}
    public String confirmaPaginaAutenticacao(){return getText(autenticacaoLabel);}
    public String confirmaPaginaAlteraerConta(){return getText(alterarContaLabel);}
    public String confirmaSaidaDaPagina(){return getText(categoryLabel);}
    public String confirmaNumeroDoCasoProcurado(){return getText(numeroEncontadoLabel);}
    public String erroDeBusca(){return getText(searchErrorLabel);}


}
