
public class MovableUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstantSpeedMovable a = new ConstantSpeedMovable(10);
		GenericMovable b = new GenericMovable(10);
		GenericMovable c = new GenericMovable(10);
		c.accelerate();
		System.out.println("a "+ a.getTimeToMove(1));
		System.out.println("b "+ b.getTimeToMove(1));
		System.out.println("c "+ c.getTimeToMove(1));

	}

}
