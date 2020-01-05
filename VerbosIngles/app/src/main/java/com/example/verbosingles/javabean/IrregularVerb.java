package com.example.verbosingles.javabean;

public class IrregularVerb {
    private String spanish;
    private String baseForm;
    private String pastSimple;
    private String pastParticiple;

    public IrregularVerb(String spanish, String baseForm, String pastSimple, String pastParticiple) {
        this.spanish = spanish;
        this.baseForm = baseForm;
        this.pastSimple = pastSimple;
        this.pastParticiple = pastParticiple;
    }

    public String getSpanish() {
        return spanish;
    }

    public String getBaseForm() {
        return baseForm;
    }

    public String getPastSimple() {
        return pastSimple;
    }

    public String getPastParticiple() {
        return pastParticiple;
    }

    @Override
    public String toString() {
        return "spanish: " + spanish + ", base form: " + baseForm + ", past Simple: " + pastSimple + ", pastParticiple: " + pastParticiple;
    }
}
