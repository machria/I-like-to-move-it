
public class GenericMovable implements MovableObject{

	private double speed;

	
	
	public GenericMovable(double speed) {
		this.speed = speed;
	}

	@Override
	public boolean canAccelerate() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void accelerate() {
		this.speed+=5;
		
	}

	@Override
	public double getTimeToMove(double a) {
		// TODO Auto-generated method stub
		return a/this.speed;
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}

}
