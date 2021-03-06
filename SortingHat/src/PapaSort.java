import java.util.Arrays;

public abstract class PapaSort {

	//protected int [] myList;
	//protected String whichSort;
	
	private int [] myList;
	private String whichSort;
	
	public PapaSort(int [] l, String sortName)
	{
		myList = l;
		whichSort = sortName;
	}
	
	public void swap(int place1, int place2)
	{
		int temp = myList[place2];
		myList[place2] = myList[place1];
		myList[place1] = temp;
	}
	
	public String toString()
	{
		String s = "";
		s += whichSort + ": ";
		s += Arrays.toString(myList);
		return s;
	}
	
	public int[] getList()
	{
		return myList;
	}
	
	//adding additional interface to get numbers
	public int getElement(int whichE)
	{
		return myList[whichE];
	}
	
	public void setElement(int whichE, int val)
	{
		myList[whichE] = val;
	}
	
	//new thing in PapaSort to get length...
	public int getLength()
	{
		return myList.length;
	}
	
	public abstract void executeAlgorithm(); //no curly braces 
	//b/c it's an abstract class
	public String getSortName()
	{
		return whichSort;
	}
	
	
}
