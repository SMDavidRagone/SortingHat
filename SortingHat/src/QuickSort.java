import java.util.Arrays;

public class QuickSort extends PapaSort 
{
	
	public QuickSort(int[] l, String sortName) 
	{
		super(l, sortName);
	}
	
	@Override
	public void executeAlgorithm()
	{
		
		quickSort(0, this.getLength()-1);
		
	}
	
	private void quickSort(int start, int end)
	{
		int length = (end - start)+1;
		
		if(length > 1)
		{
		int pivot = this.getElement(start);
		
		
		//System.out.println("The list is  " + Arrays.toString(this.getList()));
		//System.out.println("The pivot is " + pivot);
		
		
		//This is the partition location
		int ploc = partition(start+1, end, pivot);
	
		//System.out.println("Calling back from partition the pivot is " + pivot);
		//System.out.println("Swapping " + getElement(ploc) + " and " + getElement(start));
		
		if(this.getElement(start) > this.getElement(ploc))
		{
			swap(start, ploc);
		//System.out.println("After partition list is " + Arrays.toString(getList()));
		}
		
		quickSort(start, ploc-1);
		//System.out.println("After first quickSort list is " + Arrays.toString(getList()));
		
		quickSort(ploc+1, end);
		//System.out.println("After second quickSort list is " + Arrays.toString(getList()));
		
		
		
		}
	}
	
	
	
	
	private int partition(int start, int end, int pivotValue)
	{
		
		int left = start;
		int right = end;
		
		while(left < this.getLength() && right >= 0 && left < right)
		{
			while(left < this.getLength() && this.getElement(left) <= pivotValue)
			{
				left++;
			}
			while(right >= 0 && this.getElement(right) > pivotValue)
			{
				right--;
			}
			
			if(left < right)
			{
			
			if(left < this.getLength() && right >= 0)
			{
				//System.out.println("Before swap list is " + Arrays.toString(getList()));
				swap(left, right);
				//System.out.println("After swap list is " + Arrays.toString(getList()));
			}
			}
		}
		return right;
	}
	
	
}
