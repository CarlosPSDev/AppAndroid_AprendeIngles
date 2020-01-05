package com.example.verbosingles.javabean;

import java.util.ArrayList;

public class ListIrregularVerbs {
    private ArrayList<IrregularVerb> listaVerbos;

    public ListIrregularVerbs() {
       listaVerbos = new ArrayList<IrregularVerb>();
    }

    public void insertarVerbos() {
        listaVerbos.add(new IrregularVerb("ser/estar", "be", "was/were", "been"));
        listaVerbos.add(new IrregularVerb("empezar", "begin", "began", "begun"));
        listaVerbos.add(new IrregularVerb("romper", "break", "broke", "broken"));
        listaVerbos.add(new IrregularVerb("traer", "bring", "brought", "brought"));
        listaVerbos.add(new IrregularVerb("construir", "build", "built", "built"));
        listaVerbos.add(new IrregularVerb("quemar", "burn", "burnt", "burnt"));
        listaVerbos.add(new IrregularVerb("comprar", "buy", "bought", "bought"));
        listaVerbos.add(new IrregularVerb("poder", "can", "could", "been able to"));
        listaVerbos.add(new IrregularVerb("coger", "catch", "cought", "cought"));
        listaVerbos.add(new IrregularVerb("elegir", "choose", "chose", "chosen"));
        listaVerbos.add(new IrregularVerb("venir", "come", "came", "come"));
        listaVerbos.add(new IrregularVerb("costar", "cost", "cost", "cost"));
        listaVerbos.add(new IrregularVerb("cortar", "cut", "cut", "cut"));
        listaVerbos.add(new IrregularVerb("hacer", "do", "did", "done"));
        listaVerbos.add(new IrregularVerb("soñar", "dream", "dreamt", "dreamt")); //15
        listaVerbos.add(new IrregularVerb("beber", "drink", "drank", "drunk"));
        listaVerbos.add(new IrregularVerb("conducir", "drive", "drove", "driven"));
        listaVerbos.add(new IrregularVerb("comer", "eat", "ate", "eaten"));
        listaVerbos.add(new IrregularVerb("caer", "fall", "fell", "fallen"));
        listaVerbos.add(new IrregularVerb("sentir", "feel", "felt", "felt"));
        listaVerbos.add(new IrregularVerb("luchar/pelear", "fight", "fought", "fought"));
        listaVerbos.add(new IrregularVerb("volar", "fly", "flew", "flown"));
        listaVerbos.add(new IrregularVerb("olvidar", "forget", "forgot", "forgotten"));
        listaVerbos.add(new IrregularVerb("obtener", "get", "got", "got"));
        listaVerbos.add(new IrregularVerb("dar", "give", "gave", "given"));
        listaVerbos.add(new IrregularVerb("ir(se)", "go", "went", "gone"));
        listaVerbos.add(new IrregularVerb("tener/haber", "have", "had", "had"));
        listaVerbos.add(new IrregularVerb("oir", "hear", "heard", "heard"));
        listaVerbos.add(new IrregularVerb("saber/conocer", "know", "knew", "known"));
        listaVerbos.add(new IrregularVerb("aprender", "learn", "learnt", "learnt")); //30
        listaVerbos.add(new IrregularVerb("irse/dejar", "leave", "left", "left"));
        listaVerbos.add(new IrregularVerb("perder", "lose", "lost", "lost"));
        listaVerbos.add(new IrregularVerb("hacer/fabricar", "make", "made", "made"));
        listaVerbos.add(new IrregularVerb("tener que", "must", "had to", "had to"));
        listaVerbos.add(new IrregularVerb("pagar", "pay", "paid", "paid"));
        listaVerbos.add(new IrregularVerb("poner", "put", "put", "put"));
        listaVerbos.add(new IrregularVerb("leer", "read", "read", "read"));
        listaVerbos.add(new IrregularVerb("correr", "run", "ran", "run"));
        listaVerbos.add(new IrregularVerb("decir", "say", "said", "said"));
        listaVerbos.add(new IrregularVerb("ver", "see", "saw", "seen"));
        listaVerbos.add(new IrregularVerb("mostrar/enseñar", "show", "showed", "shown"));
        listaVerbos.add(new IrregularVerb("cantar", "sing", "sang", "sung"));
        listaVerbos.add(new IrregularVerb("dormir", "sleep", "slept", "slept"));
        listaVerbos.add(new IrregularVerb("hablar", "speak", "spoke", "spoken"));
        listaVerbos.add(new IrregularVerb("gastar", "spend", "spent", "spent"));
        listaVerbos.add(new IrregularVerb("tomar", "take", "took", "taken"));
        listaVerbos.add(new IrregularVerb("enseñar", "teacher", "taught", "taught"));
        listaVerbos.add(new IrregularVerb("pensar", "think", "thought", "thought"));
        listaVerbos.add(new IrregularVerb("entender", "understand", "understood", "understood"));
        listaVerbos.add(new IrregularVerb("ganar", "win", "won", "won"));
    }

    public ArrayList<IrregularVerb> getListaVerbos() {
        return listaVerbos;
    }
}
