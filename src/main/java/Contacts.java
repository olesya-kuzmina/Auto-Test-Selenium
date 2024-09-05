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
 * Осуществляет получение информации о выбранном магазине в разделе "Контакты".
 *
 * @author Olesya Kuzmina
 * @version 1.0.0
 */

public class Contacts {

    /**
     * Главный метод является точкой входа в программу на Java.
     * Запускает браузер, переходит на веб-сайт, переходит в раздел "Контакты",
     * настраивает на запрашиваемый город, для получения информации о филиале магазина.
     * Кликает по ссылке для перехода в группу магазина "Вконтакте".
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

        // 1. Переход в раздел "Контакты"
        WebElement contacts = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[2]/div/div/div/div/nav/div/table/tbody/tr/td[5]/div/a"));
        contacts.click();

        // 2. Клик на поле "Выбрать город"
        WebElement selectCity = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/div/div[1]/div/div/div/div"));
        selectCity.click();
        //Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(3000);

        // 3. Клик на нужный нам город
        WebElement city = driver.findElement(By.xpath("//*[@id=\"main\"]/div[10]/div/div/ul/li[5]"));
        city.click();
        //Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(3000);

        // 4. Клик на ссылку выбранного филиала магазина
        WebElement info = driver.findElement(By.xpath("//*[@id=\"bx_3218110189_291788\"]/div/div[1]/div/div[1]"));
        info.click();

        // 5. Клик на ссылку для перехода в группу магазина "Вконтакте"
        WebElement socialNetwork = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div/ul/li[1]/a"));
        socialNetwork.click();
        //Приостанавливаем выполнение программы для ожидания обновления страницы
        Thread.sleep(3000);

        // 6. Закрытие браузера
        driver.quit();
    }
}
