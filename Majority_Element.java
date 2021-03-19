Class Majority_Element
{
   public List<Integer> majorityElement(int nums[])
   {
      int el1=0,el2=0,c1=0,c2=0;
      
      for(n:nums){
         if(n == el1)
            c1++;
         else if(n == el2)
            c2++;
         else if(c1 == 0)
             el1=n;
             c1++;
         else if(c2 == 0)
              el2=n;
              c2++;
         else
             c1--;
             c2--
         }
       
       c1=0,c2=0;
       for(n:nums){
          if(n == el1)
              c1++;
          if(n==el2)
              c2++;
         }
       
     List<Integer> ans = new ArrayList<>();
     if(c1 > nums.length/3)
         ans.add(el1);
     if(c2 > nums.length/3)
         ans.add(el2);
   }
      return ans;
}
   
