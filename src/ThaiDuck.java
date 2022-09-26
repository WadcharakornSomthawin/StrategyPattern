
public class ThaiDuck extends Duck {

	public ThaiDuck() {
		quackBehavior = new Kab();
		flyBehavior = new FlyRocketPowered();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Thai duck");
	}

}
