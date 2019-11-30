package co.com.choucair.jobs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.jobs.userinterfaces.ChoucairSearchJobsPage.JOB_FOUND_AREA;

public class Result implements Question<Boolean> {
    private String answer;

    public Result(String answer) {
        this.answer = answer;
    }

    public static Result isThe(String answer) {
        return new Result(answer);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println("mapeo = "+ Text.of(JOB_FOUND_AREA).viewedBy(actor).asString());
        System.out.println("Dato = "+ answer);
        return Text.of(JOB_FOUND_AREA).viewedBy(actor).asString().contains(answer);
    }
}
