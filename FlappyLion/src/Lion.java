
public class Lion extends Obstacles
{

	private int ySpeed;
	private int origY;
	
	public Lion(int x, int y, String fileName, String ext, int mW, GameWindow1 gw, int numOfPics) {
		super(x, y, fileName, ext, mW, gw, numOfPics);
		// TODO Auto-generated constructor stub
		
		ySpeed = 0;
		origY = y;
	}
	
	public void resetLion()
	{
		ySpeed=0;
		super.setYLoc(origY);
		
	}
	
	
		public void animate()
		{
			super.animate();
			
			super.setYLoc(super.getYLoc()+ySpeed);
			ySpeed += GameWindow1.L_GRAVITY;

			
			if(super.getYLoc() > origY)
			{
				super.setYLoc(origY);
				ySpeed = 0;
			}
			
			if(super.getYLoc() < origY - 500)
			{
				ySpeed = GameWindow1.L_GRAVITY*15;
			}
		}
		public void jump()
		{
			ySpeed -= GameWindow1.L_GRAVITY*15;
		
		}
}


