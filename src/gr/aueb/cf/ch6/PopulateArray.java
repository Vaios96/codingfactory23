package gr.aueb.cf.ch6;

/**
 * Declaration, initialization of an array.
 * Populate (input values to the array for the first time)
 */
public class PopulateArray {

    public static void main(String[] args) {

        //Declaration and initialization of an array with length 3
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Unsized initialization
        int[] arr2 = {1, 5, 8, 9, 12};

        //Array Initializer
        int[] arr3;
        arr3 = new int[] {4, 6, 9, 10};

        //Enhanced for
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
