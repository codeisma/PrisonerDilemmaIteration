package com.codeisma;

public class Prosecutor {
    public void offerBargain(Prisoner p1, Prisoner p2){
        if (p1.betray()&&p2.betray()){
            p1.receiveSentence(2);
            p2.receiveSentence(2);
        }
        else if (p1.betray()){
            p1.receiveSentence(0);
            p2.receiveSentence(3);
        }
        else if (p2.betray()){
            p1.receiveSentence(3);
            p2.receiveSentence(0);
        }
        else {
            p1.receiveSentence(1);
            p2.receiveSentence(1);
        }
    }
}
