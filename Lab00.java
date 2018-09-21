package Lab00;
public class Lab00
{
   public static void main(String[] args)
   {
      int x = 5;String y = "hello";double z = 9.8;
      System.out.printf("x:" + x+"\n"+"y:"+y+"\n"+"z:"+z+"\n");
      //System.out.printf("y:"+y+"\n");
      //System.out.printf("z:"+z+"\n"); 

      
      int[] nums = {3,6,-1,2};
      for (int num : nums)
         System.out.println(num);
      int numFound = char_count(y,'l');
      System.out.printf("Found:"+numFound);
      
      for (int i=1; i<11; i++) {
         System.out.println(i);
      }
      System.out.println("\n");
      
      
   }
      public static int char_count(String s, char c) {
    	  int count = 0;
    	  for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == c)
    			count++;
    	  }
    	  return count;
      }
   
      
 }
      
  
