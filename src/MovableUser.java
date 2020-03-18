
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
		
		System.out.println("a "+ getTotalTime(a));
		System.out.println("b "+ getTotalTime(b));
		System.out.println("c "+ getTotalTime(c));

	}
	public static double getTotalTime(MovableObject a) {
		double count=a.getTimeToMove(1);
		a.brake();
		count+=a.getTimeToMove(0.1);
		a.accelerate();
		count+=a.getTimeToMove(1);
		return count;
	}
}
