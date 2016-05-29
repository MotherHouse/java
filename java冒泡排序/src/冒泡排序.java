public class 冒泡排序 {

   public static void main(String[] args) {
     int [] winmine = {10,30,20,90,70,50,80,111,333,456,234,66,35,67};
     int i;
     int n=0;
     int y;
     int x;
    int l=winmine.length;
   
   
     for(y=0;y<winmine.length;y++)
         {
         for (i=0;i<winmine.length-1;i++)
             {
    	     if (winmine[i]>winmine[i+1]) 
    	         {
    	         n=winmine[i];
    	         winmine[i]=winmine[i+1];
    	         winmine[i+1]=n;
    	         }
    	     }
         }
        
     
   
     
      for (x=0;x<winmine.length;x++) {
         System.out.println(winmine[x] + "");
      }
     
   }
}
