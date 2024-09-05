import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
       ______     __
      / ____/__  / /__  ____  (_)_  ______ ___
      \__ \/ _ \/ / _ \/ __ \/ / / / / __ `__ \
    ___/ /  __/ /  __/ / / / / /_/ / / / / / /
    /____/\___/_/\___/_/ /_/_/\__,_/_/ /_/ /_/
    ------------------------------------------

 */

/**
 * Класс представляет собой авто-тест функциональности веб-страницы.
 * Осуществляет выбор города на главной странице.
 *
 * @author Olesya Kuzmina
 * @version 1.0.0
 */

public class SelectСity {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на главную страницу веб-сайта,
     * изменяет в поле местоположения на другой город.
     *
     */

    public static void main(String[] args) throws InterruptedException {

        // Установка пути к драйверу Chromedriver
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

        // Инициализация веб-драйвера
        WebDriver driver = new ChromeDriver();

        //Используем максимизацию окна браузера
        driver.manage().window().maximize();

        // Открытие сайта
        driver.get("https://www.happyhands.ru/");

        // 1. Клик по кнопке местоположения
        WebElement local = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[1]/div/div/div[1]/div/div[1]/div/div/div/div[2]"));
        local.click();
        //Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(3000);

        // 2. Клик на выбранный город из предложенного списка
        WebElement city = driver.findElement(By.xpath("//*[@id=\"popup_iframe_wrapper\"]/div[2]/div/div[2]/div[2]/div/div/div[4]/a"));
        city.click();
        //Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(3000);

        // 3. Закрытие браузера
        driver.quit();
    }
}
