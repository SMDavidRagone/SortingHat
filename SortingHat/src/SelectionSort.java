import java.util.Arrays;

public class SelectionSort extends PapaSort
{
	//data is handled in the superclass AKA PapaSort
	
	public SelectionSort(int[] l, String name)
	{
		super(l, name);
		//System.out.println("Bubble Sort with Hierarchy");
	}
	
	public void executeAlgorithm()
	{
		for(int j = 0; j < super.getList().length - 1; j++)
		{
		
		//loop through numbers to find biggest
		//int biggest = myList[j];
		//int bigLoc = j;
		int biggest = getElement(0);
		int bigLoc = 0;
		
		
		for(int i = 0; i < super.getList().length - j; i++)
		{
			if(biggest < getElement(i))
			{
				biggest = getElement(i);
				bigLoc = i;
			}
		}
		super.swap(bigLoc, super.getList().length - 1 - j);
		}
	}
	
}
