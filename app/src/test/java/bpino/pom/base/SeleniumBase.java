package bpino.pom.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumBase {
    private WebDriver driver;

    public SeleniumBase(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    //encapsular selenium

    public WebElement buscarElementoWeb(By localizador) {
        return driver.findElement(localizador);
    }

    public List<WebElement> buscarElementosWeb(By localizador) {
        return driver.findElements(localizador);
    }

    public void navegarAPagina(String url) {
        driver.navigate().to(url);
    }

    public void clickear(By localizador) {
        driver.findElement(localizador);
    }

    public void escribir(String texto, By localizador) {
        driver.findElement(localizador).sendKeys(texto);
    }

    public void cerrarVentana() {
        driver.close();
    }

    public String obtenerTexto(By localizador) {
        return driver.findElement(localizador).getText();
    }

    public boolean estaDesplegado(By localizador) {
        try {
            return driver.findElement(localizador).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean estaSeleccionado(By localizador) {
        try {
            return driver.findElement(localizador).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
