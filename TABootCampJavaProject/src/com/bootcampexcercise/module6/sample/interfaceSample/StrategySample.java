package com.bootcampexcercise.module6.sample.interfaceSample;


public class StrategySample {

	public static void main(String arg[]){
		
		//Use interfaces when declaring identifiers instead of the actual classes
		
		Strategy s1 = new StrategyImplOne();
		Strategy s2 = new StrategyImplTwo();
		
		General g = new General("John Doe");
		
		//Instead of creating subclasses of 'General' with different strategies
		//We instead assign different 'strategies' to the General
//		g.setStrategy(s1);
//		g.executeStrategy();
		g.executeStrategy(s1);
//		g.setStrategy(s2);
//		g.executeStrategy();
		g.executeStrategy(s2);
		s1.execute();;
		s2.execute();
	}
}
