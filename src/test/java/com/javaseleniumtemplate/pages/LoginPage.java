package com.javaseleniumtemplate.pages;
import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;


public class LoginPage extends PageBase {
    //Mapping
    By usernameField = By.cssSelector("input[name='username']");
    By passwordField = By.cssSelector("input[name='password']");
    By loginButton = By.cssSelector("input[value='Login']");
    By exitLoginPageLink = By.partialLinkText("Sair");
    By confirmLoginMessageLabel = By.cssSelector("span[class='small']");
    By errorMessageLabel = By.cssSelector("font[color='red']");


    //Actions
    public void preenhcerUsuario(String usuario){sendKeys(usernameField, usuario);}

    public void preencherSenha(String senha){sendKeys(passwordField, senha);}

    public void clicarEmLogin(){click(loginButton);}

    public void sairDaPaginaDeLogin(){click(exitLoginPageLink);}

    public String retornaMensagemErroLogin(){return getText(errorMessageLabel);}

    public String retornaMensagemConfirmLogin(){return getText(confirmLoginMessageLabel);}
}
