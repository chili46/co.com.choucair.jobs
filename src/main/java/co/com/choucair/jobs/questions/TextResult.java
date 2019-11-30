package co.com.choucair.jobs.questions;

import co.com.choucair.jobs.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.jobs.userinterfaces.ChoucairSearchJobsPage.RESULT;
import static co.com.choucair.jobs.userinterfaces.ChoucairSearchJobsPage.VALIDATION;
import static co.com.choucair.jobs.utils.Constants.CERO;


public class TextResult implements Question<Boolean> {
    private List<DataModel> dataSet;

    public TextResult(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public  static TextResult isThe(List<DataModel> dataSet){
        return new TextResult(dataSet);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String word = Text.of(RESULT).viewedBy(actor).asString();
        System.out.println(word);
        return dataSet.get(CERO).getResultText().equals(word);
    }
}