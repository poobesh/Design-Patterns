package com.poobesh.pattern.observer;

public interface Observable {
	
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyAllObserver();

}
