package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ReportCase extends PageBase {
    //Mapping
   // By clickReportCaseLink= By.linkText("Relatar Caso");
    By clickSelectProjectButton = By.cssSelector("input[value='Selecionar Projeto']");
    By messageReportedCaseLabel = By.cssSelector("div[align='center']");
    By emptyCategoryErrorMessagelabel = By.xpath("//p[contains(text(),'Categoria')]");
    By emptyResumeErrorMessageLabel = By.xpath("//p[contains(text(),'Resumo')]");
    By emptyDescriptionErrorMessageLabel = By.xpath("//p[contains(text(),'Descrição')]");

    //Actions
   // public void clicarEmRelatarCaso(){click(clickReportCaseLink);}

    public void clicarEmSelectProject(){click(clickSelectProjectButton);}

    public String menssagenConfirmandoCasoRelatado(){return getText(messageReportedCaseLabel);}

    public String retornaMensagemErroCategoriaNaoPreechida (){return getText(emptyCategoryErrorMessagelabel);}

    public String retornaMensagemErroResumoNaoPreesnchido(){return getText(emptyResumeErrorMessageLabel);}

    public String retornaMensagemDescricaoNaoPreenchida(){return getText(emptyDescriptionErrorMessageLabel);}

}
