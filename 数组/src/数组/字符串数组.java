 package 数组;
public class 字符串数组{

   public static void main(String args[]){
      String[] winmine=new String[10];
//      String [] winmine = {"1","2","3"};
      
      for (int i=0;i<winmine.length;i++) {
    	  winmine[i] ="Here and Now is Happiness " + i;
    	  
      }
      
      
       for(int i=0;i<winmine.length;i++)
       {
      System.out.println(winmine[i]);
       }
  
}
}