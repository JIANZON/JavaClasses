
public class Parent {
	private String name;
	public void  whatAmI(){
		System.out.println("I am a Parent");
		
	}
	public void whoAmI(){
		System.out.println("I am "+this.name);
	}
	
	public Parent(String name){
		this.name = name;
	}

}
