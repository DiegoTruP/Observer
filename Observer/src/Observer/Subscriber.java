package Observer;

public class Subscriber implements EventListener{
	private String name;
	private EventManager channel;
	
	@Override
	public void update() {
		System.out.println("Hey " + name + " a new video has been uploaded");
	}
	
	public void subscribeChannel(EventManager ch) {
		channel = ch;
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}
}
