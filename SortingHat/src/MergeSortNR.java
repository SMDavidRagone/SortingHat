public class MergeSortNR extends PapaSort
{
	
	public MergeSortNR(int[] l, String sortName) {
		super(l, sortName);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void executeAlgorithm()
	{
	
	//for(int j=1; Math.log(j)/Math.log(2) <= this.getLength(); j*=2) //this goes 2, 4, 8, 16, 32... n*log(n)
	//{
		for(int j=1, e=0; Math.pow(2.0, (double)(e)) <= this.getLength(); j*=2, e++) //this goes 2, 4, 8, 16, 32... n*log(n)
		{
		for(int i =0; i < this.getLength() - 1; i+= j*2)
		{
			if(i+(j*2)-1 < this.getLength()-1)
			{
			merge(i, i+j-1, i+j, i+(j*2)-1);
			} else
			{
				merge(i, i+j-1, i+j, this.getLength()-1); //our best thinking
			}
		}
		//System.out.println(j);
		}
	
	}
	
	
	
	/*
	for(int k = 0; k < this.getLength() -1; k++)
	{
		for(int i = 0, j = 1; j <= this.getLength() - 1; i+=2, j+=2)
		{
			merge(i,i,j,j);
		}
		for(int i = 1, j = 2; j <= this.getLength() - 1; i+=2, j+=2)
		{
			merge(i,i,j,j);
		}
	}	
	
	}
	*/
	
	
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
