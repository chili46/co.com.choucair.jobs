package co.com.choucair.jobs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.choucair.jobs.userinterfaces.ChoucairSearchJobsPage.*;

public class Typing implements Task {

    private String theWord;

    public Typing(String theWord) {
        this.theWord = theWord;
    }

    public static Typing outOfContext(String theWord) {
        return Tasks.instrumented(Typing.class, theWord);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JOBS),
                Scroll.to(JOBS_AVAILABLE),
                Type.theValue(theWord).into(ENTER_KEYWORD),
                Click.on(CLICK_BUTTON_SEARCH_JOB));
    }
}

