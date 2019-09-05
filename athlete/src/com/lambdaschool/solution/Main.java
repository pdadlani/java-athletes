package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        System.out.println(" *** Track *** ");
        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        System.out.println();

        System.out.println(" *** Hockey *** ");
        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        System.out.println();

        System.out.println(" *** Rugby *** ");
        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        System.out.println();

        System.out.println(" *** Baseball *** ");
        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

    }
}
