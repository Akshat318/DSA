class Solution {
    public String reverseWords(String s) {
        String str ="";
        s = s.strip();
        String w = "";
        for(int i =s.length()-1;i>=0;i--)
        {   
            char ch= s.charAt(i);
            if(ch == ' '&& i-1 >= 0 &&s.charAt(i-1) == ' ')
            {
                continue;
            }
            if(ch != ' ')
            {  w= ch + "" +w;
            }
            else
            {
               str = str + " " +w;
               w = "";
            }
            if(i == 0)
            {
                str = str + " " +w;
            }
        }
        return str.strip();
    }
}