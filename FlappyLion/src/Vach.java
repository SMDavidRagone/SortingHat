
public class Vach extends Obstacles
{
	
	long frameCount = 0;
	int frameSpeed = 5; // Vach will wait 5 frames before animating
	
	public Vach(int x, int y, String fileName, String ext, int mW, GameWindow1 gw, int numOfPics) {
		super(x, y, fileName, ext, mW, gw, numOfPics);
		// TODO Auto-generated constructor stub
	}
	
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
	
	
}
