import java.util.Arrays;

public class SortingHat {
	
	public static void main(String[] args)
	{
		/*
		int howMany = 1000;
		int [ ] nums0 = getAscendingOrder(howMany);
		int [ ] nums1 = nums0.clone();
		int [ ] nums2 = getRandom(howMany);
		//int [ ] nums3 = nums2.clone();
		int [ ] nums4 = getDescendingOrder(howMany);
		int [ ] nums5 = nums4.clone();
		int [ ] nums6 = nums4.clone();

		
		
		
		
		*/
		
		
		
		int howMany = 1000;
		//Step 1 make a very specific array
		int numList[] = getRandom(howMany);
		//int numList[] = {1,3,5,7,9,11,13,15,    2,4,6,8,10,12,14,16,18,20,22};
		
		
		QuickSort qs= new QuickSort(numList, "QuickSort");
		//qs.executeAlgorithm();
		doTiming(qs);
		listCheck(numList, "QuickSort");
		
		InsertionSort iSort = new InsertionSort(numList, "Insertion Sort");
		doTiming(iSort);
		
		BubbleSort bSort = new BubbleSort(numList, "Bubble Sort");
		doTiming(bSort);
		
		SelectionSort sSort = new SelectionSort(numList, "Selection Sort");
		doTiming(sSort);
		//Create a merge sort object
		MergeSortNR ms = new MergeSortNR(numList, "MS Non-Recursive");
		//Write and test a merge a routine (using just one array)
		doTiming(ms);
		
		MergeSortRecursive msr = new MergeSortRecursive(numList, "MS Recursive");
		doTiming(msr);
		

	}
	
	public static void doTiming(PapaSort s)
	{
		if(s.getLength() < 100)
		{
			System.out.println("Before: " + s);
		}
		
		long startT0 = System.currentTimeMillis();
		long startT1 = System.nanoTime();
		
		s.executeAlgorithm();
		
		long endT0 = System.currentTimeMillis();
		long endT1 = System.nanoTime();
		long theTime0 = endT0-startT0;
		long theTime1 = endT1-startT1;
		
		if(s.getLength() <= 10000)
		{
		System.out.println("The time for " + s.getSortName() + " of " + s.getLength() 
		+ " numbers is " + theTime1 + " nanoseconds.");
			System.out.println("After: " + s);
		} else {
			System.out.println("The time for " + s.getSortName() + " of " + s.getLength() 
			+ " numbers is " + theTime0 + " miliseconds.");
			//System.out.println("After: " + s);
		}
	}
		/*
		long startT0 = System.currentTimeMillis();
		long startT1 = System.nanoTime();
		long endT0 = System.currentTimeMillis();
		long endT1 = System.nanoTime();
		long theTime0 = endT0-startT0;
		long theTime1 = endT1-startT1;
		
		if(s.getLenght() <= 100)
		{
		System.out.println("The time for selection sort is "
				+ theTime1 + " nanoseconds.");
		} else {
			System.out.println("The time for selection sort is: " 
		+ theTime0 + " miliseconds.");
	*/
	
	public static int [ ] getRandom(int n)
	{
		int [] nList = new int[n];
		
		for(int i= 0; i < nList.length; i++)
		{
			nList[i]=(int)(Math.random()*1000);
		}
		
		return nList;
	}
	
	public static int [ ] getAscendingOrder(int n)
	{
		int [] nList = new int[n];
		
		for(int i= 0; i < nList.length; i++)
		{
			nList[i]=(i+1);
		}
		
		return nList;
	}
	
	public static int [ ] getDescendingOrder(int n)
	{
		int [] nList = new int[n];
		
		for(int i = 0; i < nList.length; i++)
		{
			nList[i] = nList.length - i;
		}
		
		return nList;
	}
	
	public static void listCheck(int [] l, String name)
	{
		boolean error = false;
		for(int i = 0; i < l.length -1; i++)
		{
			if(l[i] > l[i+1])
			{
				error = true;
			}
		}
		
		if(error == false)
		{
			System.out.println(name + " is all good");
		}
		else
		{
			System.out.println(name + " is messed up");
		}
		
	}
	
	
}
