class Solution {
    public int[] twoSum(int[] numbers, int target) {
                if (numbers.length == 2) {
            return new int[]{1,2};
        }
        int leftindex = 0;
        int rightIndex = numbers.length-1;
        while (leftindex < rightIndex) {
            if (numbers[leftindex] + numbers[rightIndex] != target) {
                if (numbers[leftindex] + numbers[rightIndex] > target) {
                    rightIndex--;
                } else {
                    leftindex++;
                }
            } else {
                return new int[]{leftindex+1,rightIndex+1};

            }


        }
        return null;
    }
}
