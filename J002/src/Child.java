
public class Child extends Parent {
	public Child(String name) {
		super(name);
	}

	@Override
	public void whatAmI() {
		System.out.println("I am a child.");
	}
}
