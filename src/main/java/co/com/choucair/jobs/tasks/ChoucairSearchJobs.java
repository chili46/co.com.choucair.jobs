package co.com.choucair.jobs.tasks;


import co.com.choucair.jobs.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.type.Type;

import java.util.List;

import static co.com.choucair.jobs.userinterfaces.ChoucairSearchJobsPage.*;
import static co.com.choucair.jobs.utils.Constants.CERO;

public class ChoucairSearchJobs implements Task {

    private List<DataModel> dataSet;
    public ChoucairSearchJobs(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static ChoucairSearchJobs con(List<DataModel> dataSet) {
        return Tasks.instrumented(ChoucairSearchJobs.class, dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(JOBS),
        Scroll.to(JOBS_AVAILABLE),
        Type.theValue(dataSet.get(CERO).getKeyword()).into(ENTER_KEYWORD),
        Click.on(CLICK_BUTTON_SEARCH_JOB));
    }
}

