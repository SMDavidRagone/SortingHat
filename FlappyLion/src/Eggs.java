
public class Eggs extends Obstacles
{
	
	//long frameCount = 0;
	//int frameSpeed = 5; // Vach will wait 5 frames before animating
	
	public Eggs(int x, int y, String fileName, String ext, int mW, GameWindow1 gw, int numOfPics) {
		super(x, y, fileName, ext, mW, gw, numOfPics);
		// TODO Auto-generated constructor stub
	}
	public boolean moveObstacle() {
		boolean didReset = false;
		
		
		super.setXLoc(super.getXLoc()-super.getMoveSpeed()); 
		
		if(super.getXLoc() < -1 * (super.getBW() + 200) )
		{
			super.setXLoc(super.getGameWindow1().getWidth() 
					+ super.getBW() 
					+ (int)(Math.random() * 200)
					);
			didReset = true;
			
		}
		//System.out.println("Hi from moveCloud xLoc is " + super.getXLoc());
		return didReset;
		
	}
}
	/*
	public void animate()
	{
		frameCount++;
		
		if(frameCount % frameSpeed == 0)
		{
			super.setCurPic(super.getCurPic() + 1);
			
			if(super.getCurPic() >= super.getMyPicslength())
			{
				super.setCurPic(0);
				
			}
		} 
			
			
		
		
		
	}
	
	
	
	
}*/
