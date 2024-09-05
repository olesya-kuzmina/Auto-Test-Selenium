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
 * Осуществляет добавление продукта из каталога в раздел "Избранное".
 *
 * @author Olesya Kuzmina
 * @version 1.0.0
 */

public class AddProductFavorit {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт, выполняет вход в каталог, добавляет товар в раздел "Избранное".
     *
     */

    public static void main(String[] args) throws InterruptedException {

        // Установка пути к драйверу Chromedriver
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

        // Инициализация веб-драйвера
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Открытие сайта
        driver.get("https://www.happyhands.ru/");

        // 1. Открытие меню каталога
        WebElement catalog = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div/div/div/nav/div/table/tbody/tr/td[1]/div/a"));
        catalog.click();

        // 2. Переход в раздел "Игры и головоломки"
        WebElement games = driver.findElement(By.xpath("//*[@id=\"bx_1847241719_1910\"]/table/tbody/tr/td[2]/ul/li/a/span"));
        games.click();

        // 3. Клик на выбранный товар
        WebElement product = driver.findElement(By.xpath("//*[@id=\"bx_3966226736_296181\"]/div/div[1]/a/span/span"));
        product.click();

        // 4. Клик на кнопку "Избранное" для добавления товара в этот раздел
        WebElement favorite = driver.findElement(By.xpath("//*[@id=\"bx_117848907_296181\"]/div/div[2]/div[1]/div/div[1]/div/div/div[1]/span"));
        favorite.click();
        //Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(3000);

        // 5. Открытие раздела "Избранное"
        WebElement favorite1 = driver.findElement(By.xpath("//*[@id=\"basket_line\"]/div/div/div[1]/div[2]/a"));
        favorite1.click();
        //Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(4000);

        // 5. Закрытие браузера
        driver.quit();
    }
}
