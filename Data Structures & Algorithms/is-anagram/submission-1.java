class Solution {
    public boolean isAnagram(String s, String t){
        TreeMap<Character,Integer>sets=new TreeMap<>();
        TreeMap<Character,Integer>sett=new TreeMap<>();

        if(s.length()==t.length())
        {

            for(int i=0;i<s.length();i++)
            {
                char ss=s.charAt(i);
                char tt=t.charAt(i);
                if(!sets.containsKey(s.charAt(i)))
                {
                    sets.put(ss,1);
                }
                else
                {
                    sets.put(ss,sets.get(ss).intValue()+1);
                }
                if(!sett.containsKey(t.charAt(i)))
                {
                    sett.put(tt,1);
                }
                else
                {
                    sett.put(tt,sett.get(tt).intValue()+1);
                }

            }
           Iterator<Map.Entry<Character,Integer>> bla=sett.entrySet().iterator();
            while (bla.hasNext())
            {
               Map.Entry<Character,Integer> entry=bla.next();
               var seCondEntry=sets.get(entry.getKey());
               if(seCondEntry==null||!(seCondEntry==entry.getValue().intValue()))
               {
                   return false;
               }
            }
            return  true;
        }
        else{
            return false;
        }
    }
}