package com.jsp;

public class Car {
    private Engine engine;
    public Car() {}
    
    public Car(Engine engine) {
    	this.engine = engine;
    }

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
    
    
}
