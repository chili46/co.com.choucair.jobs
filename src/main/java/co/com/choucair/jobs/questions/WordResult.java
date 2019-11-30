package co.com.choucair.jobs.questions;

import co.com.choucair.jobs.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.choucair.jobs.userinterfaces.ChoucairSearchJobsPage.VALIDATION;
import static co.com.choucair.jobs.utils.Constants.CERO;


public class WordResult implements Question<Boolean> {
    private List<DataModel> dataSet;

    public WordResult(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public  static WordResult isThe(List<DataModel> dataSet){
        return new WordResult(dataSet);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String word = Text.of(VALIDATION).viewedBy(actor).asString();
        System.out.println(word);
        return word.contains(dataSet.get(CERO).getResult());
    }
}