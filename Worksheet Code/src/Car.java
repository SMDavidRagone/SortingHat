import java.awt.Color;

public class Car 
{
 private String driverName;
 private int cNum;
 private Color cColor;
 private double tP;
	
 	//instance variables
	public void setDriverName(String drivrName)
	{
		driverName = drivrName;
	}
 	
	public void setcNum(int carNum)
	{
		cNum = carNum;
	}
 	
	public void setcColor(Color carColor)
	{
		cColor = carColor;
	}
	
	public void settP(double tankP)
	{
		tP = tankP;
	}
	
	//constructors
	public Car(int carNum, String drivrName, Color carColor, double tankP)
	{
		driverName = drivrName;
		cNum = carNum;
		cColor = carColor;
		tP = tankP;
	}
	
	boolean needsFuel()
	{
		return(tP >= 0.01);
	}
	void fillTank()
	{
		tP = 1;
	}
	
	public String toString()
	{
		return "Car number " + cNum + " is driven by " 
	+ driverName + ". Fuel is: " + tP + ".";
	}
	
	
}