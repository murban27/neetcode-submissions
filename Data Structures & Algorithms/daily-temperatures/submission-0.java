class Solution {
 public int[] dailyTemperatures(int[] temperatures) {
        int[]result=new int [temperatures.length];
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            if (integerStack.empty()) {
                integerStack.push(i);
            }
            else
            {
                while((!integerStack.isEmpty())&&temperatures[i]>temperatures[integerStack.peek()])
                {
                    int previous=integerStack.peek();
                    result[previous]=i-previous;
                    integerStack.pop();
                }
                integerStack.push(i);
            }
        }
        return result;
    }
}

