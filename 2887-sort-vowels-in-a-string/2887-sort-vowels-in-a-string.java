class Solution {
    public static boolean vowel(char c){
           return c == 'a' || c == 'e' || c == 'o'|| c == 'u'|| c == 'i' 
            || c == 'A' || c == 'E' || c == 'O'|| c == 'U'|| c == 'I';
    }
    public String sortVowels(String s) {
       ArrayList<Character> list=new ArrayList<>();
       char ans[]=s.toCharArray();
       for(char x:ans){
           if(vowel(x)){
               list.add(x);
           }
       }
       Collections.sort(list);
       StringBuilder sb=new StringBuilder();
       int j=0;
       for(char x:ans){
           if(vowel(x)){
               sb.append(list.get(j));
               j++;
           }else{
               sb.append(x);
           }
       }
       return sb.toString();
    
    }
}