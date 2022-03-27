package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class Navigatepage extends PageBase {

    //Mapping
    By reportCaseLink= By.linkText("Relatar Caso");
    By verCasoLink = By.linkText("Ver Casos");
    By visualizandoCadosLabel = By.xpath("//span[contains(text(),'Visualizando ')]");








    //Actions
    public void clicarEmVerCaso (){click(verCasoLink);}
    public void clicarEmRelatarCaso(){click(reportCaseLink);}
    public String confirmaPaginaVerCaso(){return getText(visualizandoCadosLabel);}


}
