class Solution {
    public String removeOuterParentheses(String s) {
        String str ="";
        int c = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            
                if(s.charAt(i) == '(' )
                c++;
                else
                c--;
                if(c==1 && s.charAt(i) == '(' || c == 0 && s.charAt(i) == ')')
                {
                    continue;
                }
                else
                {
                    str = str + "" + s.charAt(i);
                }
           
                
            
        }
        return str;
    }
}