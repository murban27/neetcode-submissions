class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {return 0;}
                TreeSet<Integer>numeros=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            numeros.add(nums[i]);
        }
        Iterator<Integer>numbers=numeros.iterator();
        int maxrecord=0;
        int currentrecord=1;
        int previousnumber=numeros.first();
        while(numbers.hasNext())
        {
            int number=numbers.next();
            if(previousnumber-number==-1)
            {
                currentrecord++;
            }
            if(currentrecord>maxrecord)
            {
                maxrecord=currentrecord;
            }
            if(previousnumber-number!=-1)
            {
                currentrecord=1;
            }
            previousnumber=number;
        }
        return maxrecord;
    }
}
