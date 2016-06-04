import java.util.Scanner;
public class asgnmt_4_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfElements,temp,i=0;
 Scanner sc=new Scanner(System.in);
 ArrayToSort obj = new ArrayToSort();
 System.out.println("Enter the number of elements in the array");
 numberOfElements=sc.nextInt();
 System.out.println("Enter the elements in the array one-by-one");
 while(i<numberOfElements)
 {
	 temp=sc.nextInt();
	 obj.addElements(temp,i);
	 i++;
 }
 System.out.println("The elements you entered are \n");
 obj.printArray(0,numberOfElements-1);
 System.out.println("\nThe Sorted list of elements are\n");
 obj.sortArray(0,numberOfElements-1);
 obj.printArray(0,numberOfElements-1);
 
 System.out.println("Enter the element which you would like to insert");
 int element=sc.nextInt();
 System.out.println("\nThe new array after insertion of " + element + " at appropriate position is ");
 obj.insertElement(element,numberOfElements);
 

	}
	
}
