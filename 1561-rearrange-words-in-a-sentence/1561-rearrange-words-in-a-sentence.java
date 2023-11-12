class Solution {
    public String arrangeWords(String text) {
        String words[]=text.split(" ");
        Arrays.sort(words,(x,y)->x.length()-y.length());
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(words[0].charAt(0)));
         sb.append(words[0].substring(1,words[0].length()));
        for(int i=1;i<words.length;i++){
            sb.append(" ");
            sb.append(words[i].toLowerCase());
        }
        return sb.toString();
    }
}