package co.com.choucair.jobs.tasks;


import co.com.choucair.jobs.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static co.com.choucair.jobs.userinterfaces.ChoucairSearchJobsPage.*;
import static co.com.choucair.jobs.utils.Constants.CERO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isSelected;

public class ChoucairSignUpForWork implements Task {

    private List<DataModel> dataSet;
    public ChoucairSignUpForWork(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static ChoucairSignUpForWork con(List<DataModel> dataSet) {
        return Tasks.instrumented(ChoucairSignUpForWork.class, dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(JOBS),
        Scroll.to(JOBS_AVAILABLE),
        Click.on(CLICK_BUTTON_JOB),
        Hit.the(Keys.ARROW_DOWN).into(CLICK_BUTTON_SIGN_UP_FOR_WORK),
        Click.on(CLICK_BUTTON_SIGN_UP_FOR_WORK),
        Enter.theValue((dataSet.get(CERO).getName())).into(ENTER_NAME),
        Enter.theValue((dataSet.get(CERO).getEmail())).into(ENTER_EMAIL),
        Enter.theValue((dataSet.get(CERO).getPhone())).into(ENTER_PHONE),
        Enter.theValue((dataSet.get(CERO).getStudies())).into(ENTER_STUDIES),
        Enter.theValue((dataSet.get(CERO).getExperience())).into(ENTER_EXPERIENCE),
        Enter.theValue((dataSet.get(CERO).getKnowAboutAutomation())).into(ENTER_KNOW_ABOUT_AUTOMATION),
        Enter.theValue((dataSet.get(CERO).getWageAspiration())).into(ENTER_WAGE_ASPIRATION),
        SelectFromOptions.byVisibleText((dataSet.get(CERO).getTime())).from(SELECT_AVAILABILITY),
        Enter.theValue((dataSet.get(CERO).getAdditionalMessage())).into(ENTER_ADDITIONAL_MESSAGE),
        Hit.the(Keys.ARROW_DOWN).into(SEND),
        Click.on(SEND)
                );
    }
}

