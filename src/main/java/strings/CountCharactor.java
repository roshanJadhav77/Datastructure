package strings;

public class CountCharactor {
    public static void main(String[] args) {
        String str = "my name is roshan jadhav";
        int len = str.length();
        char[] chars = str.toCharArray();
        int count = 0;

        for(int i=0; i<len; i++) {
            if (chars[i] != ' ') {
                count++;
            }
        }
        System.out.println("Total number of characters in a string: "+count);
    }
}
