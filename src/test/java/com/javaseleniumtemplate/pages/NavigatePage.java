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
    By bugID = By.name("bug_id");
    By irPara = By.cssSelector("input[value='Ir para']");

    By visualizandoCasosLabel = By.xpath("//span[contains(text(),'Visualizando ')]");
    By category = By.cssSelector("td[class='category']");
    By resumo = By.xpath("//td[normalize-space()='Resumo']");
    By autenticacao = By.xpath("//td[contains(text(),'Authenticação')]");
    By alterarConta = By.xpath("//td[contains(text(),'Alterar Conta')]");
    By searchError = By.cssSelector("p[style='color:red']");
    By numeroEncontado = By.cssSelector("tbody tr:nth-child(11) td:nth-child(2)");


    //Actions
    public void minhaVisaoLink (){click(verCasoLink);}
    public void clicarEmVerCaso (){click(verCasoLink);}
    public void clicarEmRelatarCaso(){click(relatarCasoLink);}
    public void clicarEmRegistroDeMudanca (){click(registroDeMudancaLink);}
    public void clicarEmPlanejamento (){click(planejamentoLink);}
    public void clicarEmResumo (){click(resumoLink);}
    public void clicarEmGerenciar (){click(gerenciarLink);}
    public void clicarEmminhaConta (){click(minhaContaLink);}
    public void clicarEmSair (){click(sairLink);}
    public void preencherBusca(String caso){sendKeys(bugID, caso);}
    public void clicarIrPara (){click(irPara);}

    public String confirmaPaginaVerCaso(){return getText(visualizandoCasosLabel);}
    public String confirmaPaginaRelatarCaso(){return getText(category);}
    public String confirmaPaginaResumo(){return getText(resumo);}
    public String confirmaPaginaAutenticacao(){return getText(autenticacao);}
    public String confirmaPaginaAlteraerConta(){return getText(alterarConta);}
    public String confirmaSaidaDaPagina(){return getText(category);}
    public String confirmaNumeroDoCasoProcurado(){return getText(numeroEncontado);}
    public String erroDeBusca(){return getText(searchError);}


}
