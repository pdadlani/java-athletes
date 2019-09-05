package com.lambdaschool.solution;

public class MyApplication implements Processor {
    private AthleteCreation athlete;

    public MyApplication(AthleteCreation athlete) {
        this.athlete = athlete;
    }

    @Override
    public void displayAthlete() {
        athlete.displayAthlete();
    }
}
