package com.codeisma;

import java.util.Random;

public class RandomPrisoner extends Prisoner {
    @Override
    public boolean betray() {
        Random r = new Random();
        if(r.nextInt(2)>0)
        return false;
        return true;
    }
}