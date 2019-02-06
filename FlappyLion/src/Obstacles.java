
public class Obstacles extends ScreenObj
{
	private int moveSpeed; //we like data hiding
	private boolean obHit; //*******New for scorekeeping
	
	public Obstacles(int x, int y, String fileName, String ext, int mW, GameWindow1 gw, int numOfPics)
	{
		super(x, y, fileName, ext, mW, gw, numOfPics);
		// TODO Auto-generated constructor stub
		
		moveSpeed = 20;
		obHit = false;
		}
	//recycling of old moveCLouds...
	public boolean moveObstacle() {
		boolean didReset = false;
		
		
		super.setXLoc(super.getXLoc()-moveSpeed); 
		
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
	public void MoveSpeed(int nSpeed)
	{
		moveSpeed = nSpeed;
	}
	
/*	public boolean collision(Obstacles theLion)
	{
		boolean didC = false;
		int theLionX0 = theLion.getXLoc() + theLion.getGameBBXExtra() - (int)(theLion.getBW()/2);
		int theLionX1 = theLionX0 + theLion.getGameBBW();
		int myX0 = this.getXLoc() + this.getGameBBXExtra() - (int)(this.getBW()/2);
		int myX1 = myX0 + this.getGameBBH();
		int theLionY0 = theLion.getYLoc() + theLion.getGameBBYExtra() - (int)(theLion.getBH()/2);
		int theLionY1 = theLionY0 + theLion.getGameBBH();
		int myY0 = this.getYLoc() + this.getGameBBYExtra() - (int)(this.getBH()/2);
		int myY1 = myY0 + this.getGameBBH();
		
		if(
			theLionX0 < myX0  && myX0 < theLionX1 ||
			theLionX0 < myX1 && myX1 < theLionX1)
		{
			if(
				(theLionY0 < myY0  && myY0 < theLionY1 ||
				theLionY0 < myY1 && myY1 < theLionY1) ||
				
				(myY0 < theLionY0  && theLionY0 < myY1 ||
				myY0 < theLionY1 && theLionY1 < myY1))
				
				{
				
				didC = true;
				
				}
			}
	//				System.out.println("We have a Y intersection...");
	//			}
	//		System.out.println("We have an X intersection...");
	//	}
		
				return didC;
	}
	
} */

public boolean collision(Obstacles theLion)
{
    boolean didC = false;
    // get all the x coordinate info you need....
    int theLionX0 = theLion.getXLoc() -(int)(theLion.getBW()/2) + theLion.getGameBBXExtra();
    int theLionX1 = theLionX0 + theLion.getGameBBW();    
    
    int myX0 = this.getXLoc() -(int)(this.getBW()/2)+ this.getGameBBXExtra();
    int myX1 = myX0 + this.getGameBBW();
    
    //now adding y
    int theLionY0 = theLion.getYLoc() -(int)(theLion.getBH()/2)+ theLion.getGameBBYExtra();
    int theLionY1 = theLionY0 + theLion.getGameBBH();  
    
    int myY0 = this.getYLoc() -(int)(this.getBH()/2) + this.getGameBBYExtra();
    int myY1 = myY0 + this.getGameBBH();
    
    
    //*** Now Checking each point
    //Check point1 myX0, myY0 to see if its in Lion Box
    if( 
            theLionX0 <= myX0 && myX0 <= theLionX1 && 
            theLionY0 <= myY0 && myY0 <= theLionY1
      ) {
        System.out.println("Point 1A Intersect");
        didC = true;
    }
    //Check point2 myX1, myY0 to see if its in Lion Box
    if( 
            theLionX0 <= myX1 && myX1 <= theLionX1 && 
            theLionY0 <= myY0 && myY0 <= theLionY1
      ) {
        System.out.println("Point 2A Intersect");
        didC = true;
    }
    
    //Check point3 myX0, myY1 to see if its in Lion Box
    if( 
            theLionX0 <= myX0 && myX0 <= theLionX1 && 
            theLionY0 <= myY1 && myY1 <= theLionY1
      ) {
        System.out.println("Point 3A Intersect");
        didC = true;
    }
    
    //Check point4 myX1, myY1 to see if its in Lion Box
    if( 
            theLionX0 <= myX1 && myX1 <= theLionX1 && 
            theLionY0 <= myY1 && myY1 <= theLionY1
      ) {
        System.out.println("Point 4A Intersect");
        didC = true;
    }
    
    //Now do it the other way around
    //Check point1 LionX0, LionY0 to see if its in Lion Box
    if( 
            myX0 <= theLionX0 && theLionX0  <= myX1 && 
            myY0 <= theLionY0 && theLionY0  <= myY1
      ) {
        System.out.println("Point 1B Intersect");
        didC = true;
    }  
    
  //Check point2 LionX1, LionY0 to see if its in Lion Box
    if( 
    		myX0 <= theLionX1 && theLionX1  <= myX1 && 
    		myY0 <= theLionY0 && theLionY0  <= myY1)
    {
        System.out.println("Point 2B Intersect");
        didC = true;
    }  
    
    //Check point3 LionX0, LionY1 to see if its in Lion Box
    if( 
            myX0 <= theLionX0 && theLionX0  <= myX1 && 
            myY0 <= theLionY1 && theLionY1  <= myY1
      ) {
        System.out.println("Point 3B Intersect");
        didC = true;
    } 
    
    //Check point4 LionX1, LionY1 to see if its in Lion Box
    if( 
            myX0 <= theLionX1 && theLionX1  <= myX1 && 
            myY0 <= theLionY1 && theLionY1  <= myY1
      ) {
        System.out.println("Point 4B Intersect");
        didC = true;
    }  

    if (myX0 < theLionX1 &&
            myX1 > theLionX0 &&
            myY0 < theLionY1 &&
            myY1 > theLionY0) {
                didC = true;
                System.out.println("Extra Intersect");
         }

    
       
    
    if(
            
            
            (theLionX0 < myX0 && myX0 < theLionX1 ||
            theLionX0 < myX1 && myX1 < theLionX1 )
            
            ||
            
            (myX0 < theLionX0 && theLionX0 < myX1 ||
             myX1 < theLionX1 && theLionX1 < myX1) 
            ) 
    {
        if(
               
                
                (theLionY0 < myY0 && myY0 < theLionY1 ||
                theLionY0 < myY1 && myY1 < theLionY1) 
                ||
                (myY0 < theLionY0 && theLionY0 < myY1 ||
                 myY0 < theLionY1 && theLionY1 < myY1) 
            
                ) 
        {
          
        didC = true;
        System.out.println("We have an  intersect..." );
        }
    }

    return didC;
		}
	
	//********NEW FOR SCOREKEEPING
	public void setObHit(boolean hState)
	{
		obHit = hState;
	}
	
	//********NEW FOR SCOREKEEPING
	public boolean getObHit()
	{
		return obHit;
	}
	
	public void resetPosition()
	{
		//send obstacle off-screen
		super.setXLoc(super.getGameWindow1().getWidth() 
				+ super.getBW() 
				+ (int)(Math.random() * 200)
				);
		//reset the obhit variable
		obHit=false;
	}	
		
	public int getMoveSpeed()
	{
		return moveSpeed;
	}
		
		
		
		
		
		
	
}








