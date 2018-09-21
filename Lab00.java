public class Lab00
{
   public static void main(String[] args)
   {
      int x = 5;String y = "hello";double z = 9.8;
      System.out.printf("x:",x); 
      
      System.out.printf("y:",y); 
      
      System.out.printf("z:",y);
      
      
      int[] nums = {3,6,-1,2};
      for (int num : nums)
         System.out.println(nums[num]);
      
      numFound = char_counts(y,'l');
      System.out.println(numFound);
      
      for (int i; i<11;i++)
         System.out.println(i);
      
      System.out.println("\n");
      
      
      
   }
   public static void char_count(String s, char c)
   {
      int count = 0;
      for(int i; i<s.length(); i++)
      {
         if (s[i] == c){
            count++;
         }
      }
   }
}
