
public interface MovableObject {
	public boolean canAccelerate();
	public void accelerate();
	public double getTimeToMove(double a );
	public void brake();
}
