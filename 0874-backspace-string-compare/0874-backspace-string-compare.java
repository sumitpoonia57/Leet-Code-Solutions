class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(st.size()>0 && c=='#'){
                st.pop();
            }
             else if(st.size()==0 && c=='#'){
                continue;
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char x:st){
            sb.append(x);
        }
        String ans1=sb.toString();
        st=new Stack<>();
          for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(st.size()>0 && c=='#'){
                st.pop();
            }
            else if(st.size()==0 && c=='#'){
                continue;
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb1=new StringBuilder();
        for(char x:st){
            sb1.append(x);
        }
        String ans2=sb1.toString();
        return ans1.equals(ans2);

    }
}