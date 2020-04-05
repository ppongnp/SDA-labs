package lect10Code.simulator.Step7observer;
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
