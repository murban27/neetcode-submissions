class Solution {
    public int[] twoSum(int[] nums, int target) {
                HashMap<Integer,Integer> hashMap=new HashMap<>();

                  for (int i = 0; i < nums.length; i++) {
                int difference=target-nums[i];
                if(hashMap.containsKey(nums[i]))
                {
                    return new int[]{hashMap.get(nums[i]),i};
                }
                hashMap.put(difference,i);
        }
                return null;
}
}