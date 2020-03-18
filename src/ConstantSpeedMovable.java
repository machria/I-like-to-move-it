
public class ConstantSpeedMovable implements MovableObject{
	
	private double speed;
	
	
	
	public ConstantSpeedMovable(double speed) {
		this.speed = speed;
	}

	@Override
	public boolean canAccelerate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTimeToMove(double a) {
		// TODO Auto-generated method stub
		return a/this.speed;
	}

}
