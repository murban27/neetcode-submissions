class Solution {
    public int[] productExceptSelf(int[] nums) {
                  int[] numsleft=new int[nums.length];
        int[] numsright=new int[nums.length];
        //from left
        int[]leftindex=new int[nums.length];
        int[]rightIndex=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                leftindex[0]=1;
            }
            else {
                leftindex[i] = nums[i - 1] * leftindex[i - 1];
            }
        }

        for(int j=nums.length-1;j>=0;j--)
        {
            if(j==nums.length-1)
            {
                rightIndex[nums.length-1]=1;
            }
            else {
                rightIndex[j] = nums[j +1] * rightIndex[j + 1];
            }
        }
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            result[i]=rightIndex[i]*leftindex[i];
        }
        return result;
}  
}

