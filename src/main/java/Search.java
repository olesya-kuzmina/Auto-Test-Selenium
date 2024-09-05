import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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
 * Осуществляет поиск товара.
 *
 * @author Olesya Kuzmina
 * @version 1.0.0
 */

public class Search {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт, выполняет поиск товара.
     *
     */


    public static void main(String[] args) throws InterruptedException {

        // Установка пути к драйверу Chromedriver
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

        // Инициализация веб-драйвера
        WebDriver driver = new ChromeDriver();

        //Используем максимизацию окна браузера
        driver.manage().window().maximize();

        // Открытие главной страницы сайта
        driver.get("https://www.happyhands.ru/");

        // 1. Клик на значок поиска
        WebElement search = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[1]/div/div/div[3]/div/div[1]"));
        search.click();

        //Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(3000);

        // 2. Заполнение поля поиска
        WebElement search1 = driver.findElement(By.xpath("//*[@id=\"title-search-input\"]"));
        search1.clear();
        search1.sendKeys("Копилка");

        // 3. Клик по кнопке "Найти"
        WebElement search2 = driver.findElement(By.xpath("//*[@id=\"title-search\"]/form/div[2]/button"));
        search2.click();
        //Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(3000);

        // 4. Ожидание загрузки результатов поиска
        List<WebElement> results = driver.findElements(By.className("title"));

        if (!results.isEmpty()) {
            System.out.println("Результаты поиска найдены!");
        } else {
            System.out.println("Результаты поиска не найдены.");
        }

        // 5. Закрытие браузера
        driver.close();
    }
}
