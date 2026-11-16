class Solution {
    public int evalRPN(String[] tokens) {
         int totalnumber=0;
        Set<String>symbols=new HashSet<>();
        Stack<Integer>numbers=new Stack<>();
        symbols.add("/");
        symbols.add("*");
        symbols.add("-");
        symbols.add("+");
     for(String s : tokens)
     {
         if(symbols.contains(s))
         {
             int rightNumber=numbers.pop();
             int leftNumber=numbers.pop();
             switch(s)
             {
                 case "/":
                     numbers.push(leftNumber/rightNumber);
                     break;
                 case "*":
                     numbers.push(leftNumber*rightNumber);
                     break;
                 case "-":
                     numbers.push(leftNumber-rightNumber);
                     break;
                 case "+":
                     numbers.push(leftNumber+rightNumber);
                     break;
                 default:throw new IllegalArgumentException();
             }
         }
         else {
             numbers.push(Integer.parseInt(s));
         }
         }
        return numbers.firstElement();
    }

}
