class Solution {
   
    public int maxArea(int[] heights) {
        int startIndex=0;
        int endIndex=heights.length-1;
        int record=0;
        while(startIndex<endIndex)
        {
            int leftvalue=heights[startIndex];
            int rightValue=heights[endIndex];
            int currentResult=Integer.min(leftvalue,rightValue)*(endIndex-startIndex);
            record=Integer.max(record,currentResult);
            if(leftvalue<rightValue)
            {
                startIndex++;
            }
            else
            {
                endIndex--;
            }
        }
        return record;
    }

}
