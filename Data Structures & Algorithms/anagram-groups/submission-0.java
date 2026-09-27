class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
              List<List<String>> ts=new ArrayList<>();
        HashMap<String,List<String>>set=new HashMap<>();
        for(String str : strs)
        {
            String word=str.toLowerCase();
            int []chars=new int[26];
            for(int i=0;i<str.length();i++)
            {
                int chartIndex=word.charAt(i)-'a';
                chars[chartIndex]++;
            }
            String key=Arrays.toString(chars);
            if(!set.containsKey(key))
            {
                List<String> list= new ArrayList<>();
                list.add(word);
                set.put(key,list);
            }
           else {
                set.get(key).add(word);
            }
        }
        return new ArrayList<>(set.values());
    }
}
