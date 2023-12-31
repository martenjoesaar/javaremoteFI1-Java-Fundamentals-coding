package D231216;
import java.util.Arrays;

public class JoosepEx {
    public static void main(String[] args) {

        int[] intArray = new int[]{-5, -8, -2, 5, -8, -10, 19, 5, -38, 9};

        int poscount = 0, negcount = 0, length = intArray.length;

        int[] rearrangeArray = new int[length];

        for (int i = 0; i < length ; i++) {
            System.out.println("Element " + i + ": " + intArray[i]);
            if (intArray[i] < 0) {
                rearrangeArray[(length-1) - negcount] = intArray[i];
                System.out.println(length + " - 1) - " + negcount + " = " + intArray[i]);
                negcount++;
            } else {
                rearrangeArray[poscount] = intArray[i];
                System.out.println(poscount + " = " + intArray[i]);
                poscount++;

            }

        }

        System.out.println(Arrays.toString(rearrangeArray));
    }
}
/*
Having an array with integer numbers rearrange the elements to have the positive numbers
on the left and the negative numbers on the right.
Do not use any sorting methods.
 */