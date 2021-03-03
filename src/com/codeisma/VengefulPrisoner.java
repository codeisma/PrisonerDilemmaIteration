package com.codeisma;

public class VengefulPrisoner extends Prisoner implements State {
    private boolean betrayed;

    @Override
    public boolean betray() {
        if (betrayed)
            return true;
            return false;
        }


        @Override
        public void receiveSentence( int sentence){
            if (sentence > 1)
                betrayed = true;
            super.receiveSentence(sentence);
        }
        @Override
        public void reset() {
            betrayed = false;
        }
    }
