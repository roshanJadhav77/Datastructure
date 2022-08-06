package array;

public class MissingElement {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,7};
        int expected_no_element = a.length+1;
        int total_sum = expected_no_element*(expected_no_element+1)/2;

        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        int result = total_sum - sum;

        System.out.println("Missing element is: "+result);
    }
}
