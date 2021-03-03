package com.codeisma;

public abstract class Prisoner {
    private String type = getClass().getSimpleName();
    private int prisonSentence;

    public Prisoner(){
    }
    public Prisoner(int prisonSentence){ this.prisonSentence = prisonSentence; }
    public abstract boolean betray();
    public void receiveSentence(int sentence){
        prisonSentence += sentence;
    }
    public String toString(){
        return type + " " + prisonSentence;
    }
}