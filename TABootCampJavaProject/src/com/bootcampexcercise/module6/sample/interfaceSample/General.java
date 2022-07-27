package com.bootcampexcercise.module6.sample.interfaceSample;

public class General {

    //Use interfaces instead of actual classes.  This way your code does not get
    //locked down to any specific implementation of an interface.
    private Strategy myStrategy;

    private String name;

    public General(String name) {
        this.name = name;
    }

    //The method below is able to accept any class that implements the Strategy int
    public void setStrategy(Strategy strategy) {
        myStrategy = strategy;
    }


    //The actual behavior of the method 'execute' will depend on what is the actual implementation
    //class that was passed down as a Strategy.  This will allow the method executeStrategy to be
    //modifiable during runtime
    public void executeStrategy() {
        System.out.print("General " + name + " executing his strategy...");
        myStrategy.execute();
    }
    public void executeStrategy(Strategy s) {
        System.out.print("General " + name + " executing his strategy...");
        s.execute();
    }
}
