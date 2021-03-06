
public class InsertionSort extends PapaSort{
	
	public InsertionSort(int[] l, String name)
	{
		super(l, name);
	}
	
	@Override
	public void executeAlgorithm()
	{	//concept is long winded bubble sort
		for(int i =1; i < this.getLength(); i++)
		{
			int j = i;
			while(j > 0 && this.getElement(j) < this.getElement(j-1))
			{
				swap(j, j-1);
				j--;
			} 
		}
		
	}

}
