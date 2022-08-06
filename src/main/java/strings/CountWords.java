package strings;

public class CountWords {
    public static void main(String[] args) {
        String str = "My name is roshan";
        int len = str.length() - 1;

        int count = 1;

        for(int i=0; i<len; i++) {
            if(str.charAt(i) == ' ' && str.charAt(i+1) != ' '){
                count++;
            }
        }

        System.out.println("Number of words in given string is: "+count);
    }
}
