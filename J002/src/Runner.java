
public class Runner {

	public static void main(String[] args) {
		Parent parent = new Parent("Ben");
		parent.whoAmI();
		Child child = new Child("Tom");
		child.whoAmI();
		Parent anotherChild = new Child("Kenny");
		anotherChild.whoAmI();
	}

}
