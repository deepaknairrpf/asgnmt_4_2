
public class ArrayToSort {

	private int[] array=new int[100];
	 void addElements(int a,int index)
	 {
		 array[index]=a;
		  
	 }
	public void sortArray(int low,int high)
	 {
		int i=low,j=high,temp;
		int pivot=low;
		if(low<high)
		{
			while(i<j){
		while(array[i]<=array[pivot] && i<=high)
		i++;               
		while(array[j]>array[pivot] && j>=low)
			j--;
			
			if(i<j){
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
			}
			
		}
			temp=array[j];
			array[j]=array[pivot];
			array[pivot]=temp;
			sortArray(low,j-1);
			sortArray(j+1,high);
		}
	 }
	public void printArray(int lowerIndex,int higherIndex)
	{
		while(lowerIndex<=higherIndex)
		{
			System.out.println(array[lowerIndex]);
			lowerIndex++;
		}
	}
	public void insertElement(int element,int numberOfElements)
	{
		int i=0,j=numberOfElements-1;
		while(array[i]<element && i<=j)
			i++;
		while(j>=i)
		{
			array[j+1]=array[j];
			j--;
		}
		array[i]=element;
		printArray(0,numberOfElements);
	}

}
