import java.util.stream.IntStream;

public class Solution {
	
	public static int difference(final int... array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("The input array is empty.");
        }

        int max = array[0];
        int min = array[0];

        for (final int i : array) {
            if (max < i) {
                max = i;
            } else if (min > i) {
                min = i;
            }
        }

        return max - min;   
    }


    public static void main(final String[] args) {    	
    	int[] intArr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
    	
    	int beg =1; 
    	int end = 4;
    	
    	
    	
        System.out.println(difference(1, 29, 3, 4, 6,7,9,100));
    }

}
