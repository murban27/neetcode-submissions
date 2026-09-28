class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
       TreeMap<Integer,Integer>map=new TreeMap<>();
            for(int i=0;i<nums.length;i++)
            {
                map.merge(nums[i],1, Integer::sum);
            }

            return map.entrySet()
                    .stream()
                    .sorted((f,s)->s.getValue().compareTo(f.getValue()))
                    .limit(k)
                    .mapToInt((f)->(int)f.getKey())
                    .toArray();
    }
}
