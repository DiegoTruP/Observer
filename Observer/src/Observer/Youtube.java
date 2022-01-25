package Observer;

public class Youtube {

	public static void main(String[] args) {
		
		
		EventManager eventManager = new EventManager();//Event manager
		
		
		Subscriber s1 = new Subscriber("Diego");//Event Listeners
		Subscriber s2 = new Subscriber("Luis");
		Subscriber s3 = new Subscriber("Miguel");
		
		
		eventManager.subscribe(s1);
		eventManager.subscribe(s2);
		eventManager.subscribe(s3);
		
		
		eventManager.upload("Hello world");
		
		
		eventManager.unSubscribe(s1);
		
		eventManager.upload("Hello Hcl");

	}

}
