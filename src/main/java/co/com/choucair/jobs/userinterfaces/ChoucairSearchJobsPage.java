package co.com.choucair.jobs.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairSearchJobsPage extends PageObject {

    public static final Target JOBS = Target.the("click on the jobs section")
            .located(By.xpath("//li[@id='menu-item-550']//a[contains(text(),'Empleos')]"));


    public static final Target JOBS_AVAILABLE = Target.the("Scroll to job search section")
            .located(By.xpath("//h2[@class='elementor-heading-title elementor-size-default']"));

    public static final Target ENTER_KEYWORD = Target.the("Scroll to job search section")
            .located(By.id("search_keywords"));

    public static final Target CLICK_BUTTON_SEARCH_JOB = Target.the("Clic button search job")
            .located(By.className("search_submit"));

    public static final Target VALIDATION = Target.the("valid if it contains the word")
            .located(By.xpath("//ul[@class='job_listings']//li"));

    public static final Target CLICK_BUTTON_JOB = Target.the("Clic in the option firts job")
            .located(By.xpath("//li[@class='post-387 job_listing type-job_listing status-publish has-post-thumbnail hentry job_position_featured']//a"));

    public static final Target CLICK_BUTTON_SIGN_UP_FOR_WORK = Target.the("Clic in the button inscribirse al trabajo")
            .located(By.xpath("//input[contains(@class,'application_button button')]"));

    public static final Target ENTER_NAME = Target.the("Enter the name full")
            .located(By.name("your-name"));

    public static final Target ENTER_EMAIL = Target.the("Enter EMAIL ")
            .located(By.name("your-email"));

    public static final Target ENTER_PHONE = Target.the("Enter Cell or Contact Phone ")
            .located(By.name("tel"));

    public static final Target ENTER_STUDIES = Target.the("Enter What formal studies do you have or what semester are you currently in")
            .located(By.name("estudios"));

    public static final Target ENTER_EXPERIENCE = Target.the("EnterWhat time of certified experience do you have in Testing or Software Development?")
            .located(By.name("exp"));

    public static final Target ENTER_KNOW_ABOUT_AUTOMATION = Target.the("Enter You know about test automation")
            .located(By.name("auto"));

    public static final Target ENTER_WAGE_ASPIRATION = Target.the("Enter your salary aspiration")
            .located(By.name("salario"));

    public static final Target SELECT_AVAILABILITY = Target.the("Enter your availability")
            .located(By.name("curso"));

    public static final Target ENTER_ADDITIONAL_MESSAGE = Target.the("place where additional text is added")
            .located(By.name("your-message"));


    public static final Target SEND = Target.the("Clic button send")
            .located(By.xpath("//input[contains(@class,'wpcf7-form-control wpcf7-submit')]"));

    public static final Target RESULT = Target.the("Text of the result")
            .located(By.xpath("//span[contains(text(),'Por favor verifica el captcha')]"));

    public static final Target JOB_FOUND_AREA = Target.the("Valid if it contains the word")
            .located(By.xpath("//ul[@class='job_listings']/li"));

}
