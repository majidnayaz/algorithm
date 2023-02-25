  // the name of class must much with file name 
public class array{

	public static void main(String[] args) {
    // intializing an array 
 int arr1[];
 int arr2[] = {1,22,33,54,65,6,7};
 int []arr3 =new int [7];
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
   // this algorithm will copy the elemnt of first array to the second arra
    for (int i=0;i<arr3.length;i++){
      arr3[i]=arr2[i];
      System.out.println(arr3[i]);
    }
    // this array will show you the largist element of this array 
    int max=0;
    for (int i=0;i<arr2.length;i++){
     
      if (arr3[i]>max)
      max=arr3[i];}
      int sum=0; 
    System.out.print("maximam of this array is  ");
      System.out.println(max);
      // this algotithm will colletct all elemnt of this array
      for (int i=0; i<7;i++){
         sum=sum+arr3[i];
      }
      System.out.print("the sum of this array is ");
      System.out.println(sum);
	}
}















