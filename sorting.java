public class sorting {
  public static void main(String []args){
    // the sorting in bubble algorithm 
    int  arry[]={1,11,3,4,15,6,8,9};
    for (int i=0;i<arry.length;i++){
      for (int j=0;j<arry.length-1;j++){
        if(arry[j]>arry[j+1]){
          int swap=arry[j];
          arry[j]=arry[j+1];
          arry[j+1]=swap;
        }}}

    for (int i=0;i<arry.length;i++){
      System.out.print(arry[i]+"   ");
    }}}