class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll(",","");
        s=s.replaceAll(":","");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String words[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
        }
        String ans=sb.toString();
        StringBuilder sr=new StringBuilder(sb);
         String ans1=sr.reverse().toString();
        return ans.equals(ans1);
    }
}