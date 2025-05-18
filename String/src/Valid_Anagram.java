public class Valid_Anagram {
    public static boolean valid_Anagram(String s,String t){
        if(s == null || t == null) return false;

        if(s.length() != t.length()) return false;

        int [] counter = new int[26];
        for(int i = 0; i<s.length(); i++){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
        }
       for(int index : counter){
           if(index  != 0){
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args) {
        System.out.println(valid_Anagram("listen", "silent")); // true
        System.out.println(valid_Anagram("hello", "bello"));
    }
}
