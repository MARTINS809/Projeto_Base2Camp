package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ViewsCasesPage extends PageBase {

    //Mapping
    By handlerIdFilterLink = By.id("handler_id_filter");
    By showCategoryFilterLink = By.id("show_category_filter");
    By showSeverityFilterLink = By.id("show_severity_filter");


    By felipeMartinsComboBox= By.xpath("//option[text()='felipe.martins']");
    By testeFelipeComboBox= By.xpath("//option[text()='Teste Felipe']");
    By grandeComboBox= By.xpath("//option[text()='grande']");


    By handlerIdFilterTargetLabel = By.id("handler_id_filter_target");
    By showCategoryFilterTargetLabel = By.id("show_category_filter_target");
    By showSeverityFilterTargetLabel = By.id("show_severity_filter_target");
    By filterBotton = By.name("filter");




    //Actions
    public void clicarAtribuidoA (){click(handlerIdFilterLink);}
    public void clicarEmFitrarCategoria(){click(showCategoryFilterLink);}
    public void clicarEmFitrarGravidade(){click(showSeverityFilterLink);}

    public void filtrarUsuario(){click(felipeMartinsComboBox);}
    public void clicarEmTesteFalipe(){click(testeFelipeComboBox);}
    public void clicarEmGrande(){click(grandeComboBox);}
    public void clicarEmFiltrar(){click(filterBotton );}

    public String confirmarUsuarioAtribuido(){return getText(handlerIdFilterTargetLabel);}
    public String confirmarCategoriaSelecionada(){return getText(showCategoryFilterTargetLabel);}
    public String confirmarGravidadeSelecionada(){return getText(showSeverityFilterTargetLabel);}







}
