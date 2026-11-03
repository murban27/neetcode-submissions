class Solution {
    public boolean isPalindrome(String s) {
                String regex="\\W";
        s=s.replaceAll(regex,"").toLowerCase();
        if(s.length()==1)
        {
            return true;
        }
        int endIndex=s.length()-1;
        int currentIndex=0;
        while(currentIndex<endIndex)
        {
            char first =s.charAt(currentIndex);
            char end=s.charAt(endIndex);
            if(first!=end)
            {
                return false;
            }
            currentIndex++;
            endIndex--;
        }
        return true;
    }
}
