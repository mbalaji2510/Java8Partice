import java.io.Serializable;

class Robot implements Serializable{
	
    private int currentX;
    private int currentY;
    private int previousX;
    private int previousY;
	public Robot(int currentX, int currentY, int previousX, int previousY) {
		super();
		this.currentX = currentX;
		this.currentY = currentY;
		this.previousX = previousX;
		this.previousY = previousY;
	}
	public Robot(int currentX, int currentY) {
		super();
		this.currentX = currentX;
		this.currentY = currentY;
	}
	public Robot() {
		super();
		// TODO Auto-generated constructor stub
	}
   

}