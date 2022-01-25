package Observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {//Event Manager.
	
	List<EventListener> subs = new ArrayList<>();
	private String title;
	
	public void subscribe(EventListener sub) {
		subs.add(sub);
	}
	
	public void unSubscribe(EventListener sub) {
		subs.remove(sub);
	}
	
	public void notifySubscribers() {
		for(EventListener sub : subs) {
			sub.update();
		}
	}
	
	public void upload(String title) {
		this.title = title;
		notifySubscribers();
	}
}
