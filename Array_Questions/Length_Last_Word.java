public class Length_Last_Word {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;

        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start;
    }
    public static void main(String[] args) {
        Length_Last_Word obj = new Length_Last_Word();

        String input = "   Hello World   ";
        int result = obj.lengthOfLastWord(input);

        System.out.println("Length of last word: " + result);
    }
}
