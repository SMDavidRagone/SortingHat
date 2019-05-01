public class MergeSortRecursive extends PapaSort
{
	
	public MergeSortRecursive(int[] l, String sortName) {
		super(l, sortName);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void executeAlgorithm()
	{
		mergeSort(0, this.getLength()-1);
		
	}	
		
	//This is our recursive method that will be called again and again
	private void mergeSort(int lStart, int lEnd)
	{
		int listLength= lEnd -lStart;
		//System.out.println("In MergeSort list length is " + listLength);
		//System.out.println("In MergeSort list start and end are " + lStart + "," + lEnd);
		
		if(listLength > 1)
		{
			mergeSort(lStart, lStart + (listLength/2) - 1);
			mergeSort(lStart + (listLength/2), lEnd);
			
			merge(lStart, lStart + (listLength/2)-1, lStart + (listLength/2), lEnd);
		}
		
	}
	
	
	private void merge(int s1, int e1, int s2, int e2)
	{
		//System.out.println("Hi, merge this");
		
		//write the code to do the merge
		int length = e2-s1+1;
		int [] temp = new int [length]; 
		int l1 = s1;
		int l2 = s2;
		int tPointer = 0;
		
		while(l1 <= e1 && l2 <= e2)
		{
			if(this.getElement(l1) <= this.getElement(l2))
			{
				
				temp[tPointer] = this.getElement(l1);
				l1++;
				
			} else
			{
				temp[tPointer] = this.getElement(l2);
				l2++;
			}	
				tPointer++;
		}
		
		//cleanup; put extras on temp
		for(int tp = tPointer; tp < temp.length; tp++)
		{
			if(l1 <= e1)
			{
				temp[tp] = this.getElement(l1);
				l1++;
				
			} else
			{
				temp[tp] = this.getElement(l2);
				l2++;
			}
			
		}
		
		/*		
		for(int i = 0; i < length; ++i) {
			if (l1>e1) {
				temp[i] = myList[l2];
				++l2;
			}
			else if (l2 > e2) {
				temp[i] = myList[l1];
				++l1;
			}else if (myList[l1] > myList[l2]) {
				temp[i] = myList[l2];
				++l2;
			}else {
				temp[i] = myList[l1];
				++l1;
			}
		}
		
		for(int i = 0; i < length; i++) {
			myList[i+s1] = temp[i];
		
		}
		*/
		
		
		
		//figure out which numbers to put on temp
		
		
		
		//more cleanup -- finally copy everything back to numList
		//copy the result back to the array
		for(int i = s1, t = 0; i <= e2; i++, t++)
		{
			this.setElement(i, temp[t]);	
		}
	
	}
}
