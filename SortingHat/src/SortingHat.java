import java.util.Arrays;

public class SortingHat {
	
	public static void main(String[] args)
	{
		int howMany = 100000;
		int [ ] nums0 = getAscendingOrder(howMany);
		int [ ] nums1 = nums0.clone();
		int [ ] nums2 = getRandom(howMany);
		//int [ ] nums3 = nums2.clone();
		int [ ] nums4 = getDescendingOrder(howMany);
		int [ ] nums5 = nums4.clone();
		int [ ] nums6 = nums4.clone();
		
		//System.out.println((Arrays.toString(nums0)));
		//System.out.println((Arrays.toString(nums1)));
		//System.out.println(Arrays.toString(nums4));
		
		SelectionSort sSort = new SelectionSort(nums4, "Selection Sort");
		doTiming(sSort);
		
		BubbleSort bSort = new BubbleSort(nums5, "Bubble Sort");
		doTiming(bSort);
		
		InsertionSort iSort = new InsertionSort(nums6, "Insertion Sort");
		doTiming(iSort);
		/*
		System.out.println(bSort);
		long startT = System.currentTimeMillis();
		long startT2 = System.nanoTime();
		bSort.executeAlgorithm();
		System.out.println(bSort);
		long endT = System.currentTimeMillis();
		long endT2 = System.nanoTime();
		long theTime = endT-startT;
		long theTime2 = endT2-startT2;
		
		if(howMany <= 100)
		{
		System.out.println("The time for bubble sort is "
				+ theTime2 + " nanoseconds.");
		} else {
			System.out.println("The time for bubble sort is: " 
		+ theTime + " miliseconds.");
		
		}
			
			System.out.println(sSort);
			long startT0 = System.currentTimeMillis();
			long startT1 = System.nanoTime();
			sSort.executeAlgorithm();
			System.out.println(sSort);
			long endT0 = System.currentTimeMillis();
			long endT1 = System.nanoTime();
			long theTime0 = endT0-startT0;
			long theTime1 = endT1-startT1;
			
			if(howMany <= 100)
			{
			System.out.println("The time for selection sort is "
					+ theTime1 + " nanoseconds.");
			} else {
				System.out.println("The time for selection sort is: " 
			+ theTime0 + " miliseconds.");
		
		}
		*/
		
		
	}
	
	public static void doTiming(PapaSort s)
	{
		
		
		long startT0 = System.currentTimeMillis();
		long startT1 = System.nanoTime();
		
		s.executeAlgorithm();
		
		long endT0 = System.currentTimeMillis();
		long endT1 = System.nanoTime();
		long theTime0 = endT0-startT0;
		long theTime1 = endT1-startT1;
		
		if(s.getLength() <= 1000)
		{
		System.out.println("The time for " + s.getSortName() + " of " + s.getLength() 
		+ " numbers is " + theTime1 + " nanoseconds.");
		} else {
			System.out.println("The time for " + s.getSortName() + " of " + s.getLength() 
			+ " numbers is " + theTime0 + " miliseconds.");
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
	
}