
public class RubberDuck extends Duck {
	
	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Rubber Duck");
	}

}
