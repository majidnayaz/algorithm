  // the name of class must much with file name 
public class array{

	public static void main(String[] args) {
    // intializing an array 
 int arr1[];
 int arr2[] = {1,2,3,4,5,6,7};
 int []arr3 =new int [5];
 System.out.println(arr2[2]);
 for (int i=0;i<arr2.length;i++ ){
  System.out.println(arr2[i]);
 }
 // example of liner search
 int num = 6;
 boolean found = false; 
 for (int i=0;i<arr2.length;i++){
    if (num==arr2[i])
    found =true;
 }
   if(found == true)
  System.out.println("found");
  else 
  System.out.println( " not found");
   // the O notation of this algorithm is O(the numer of array elemnts)
	}
}















