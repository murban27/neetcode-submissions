class Solution {
    public boolean isValid(String s) {
      if(s.length()%2!=0)
        {
            return false;
        }
        Deque<Character>chars=new ArrayDeque();
        Deque<Character>oposite=new ArrayDeque();

        HashMap<Character, Character>hashMap=new HashMap<>();
        hashMap.put(')','(');
        hashMap.put('}','{');
        hashMap.put(']','[');
        for(int i=0;i<s.length();i++)
        {
            //([{}])
            // ()[]{}
            if(!hashMap.containsKey(s.charAt(i))) {
                chars.push(s.charAt(i));
            }
            else
            {
               var closedBracked= hashMap.getOrDefault(s.charAt(i),'l');
               if(chars.size()>0&&closedBracked.equals(chars.getFirst()))
                {
                    chars.removeFirst();
                }
               else
               {
                   return false;
               }
            }
        }

        if(chars.size()!=0)
        {
            return false;
        }
        return true;
    }
}
