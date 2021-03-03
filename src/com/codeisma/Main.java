package com.codeisma;

public class Main {
    public static void main(String[] args) {
        Prosecutor prosecute = new Prosecutor();

        Prisoner[] prisoners1 = new Prisoner[5];
        prisoners1[0] = new BetrayalPrisoner();
        prisoners1[1] = new TrustyPrisoner();
        prisoners1[2] = new VengefulPrisoner();
        prisoners1[3] = new RandomPrisoner();
        prisoners1[4] = new MemoryPrisoner();

        Prisoner[] prisoners2 = new Prisoner[5];
        prisoners2[0] = new BetrayalPrisoner();
        prisoners2[1] = new TrustyPrisoner();
        prisoners2[2] = new VengefulPrisoner();
        prisoners2[3] = new RandomPrisoner();
        prisoners2[4] = new MemoryPrisoner();
        for(Prisoner p1 :prisoners1){
            for(Prisoner p2 :prisoners2) {
                for (int i = 0; i < 100; i++) {
                    prosecute.offerBargain(p1, p2);
                }
                if (State.class.isAssignableFrom(p1.getClass())) ((State) p1).reset();
                if (State.class.isAssignableFrom(p2.getClass())) ((State) p2).reset();
            }
        }
        for(Prisoner p : prisoners1){
            System.out.println(p);
        }
    }
}
