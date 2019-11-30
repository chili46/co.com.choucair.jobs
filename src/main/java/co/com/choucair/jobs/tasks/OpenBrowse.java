package co.com.choucair.jobs.tasks;


import co.com.choucair.jobs.userinterfaces.ChoucairJobsHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowse implements Task {

    public ChoucairJobsHomePage choucairJobsHomePage;

    public static OpenBrowse theChoucairJobsPage(){
        return Tasks.instrumented(OpenBrowse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairJobsHomePage));
    }
}
