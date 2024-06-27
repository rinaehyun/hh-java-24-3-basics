package grouptasks;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {

        int[] firstArray = new int[10];

        // Step 1: Create an array with 1, ..., 10
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
        }
        System.out.println("The first array is: " + Arrays.toString(firstArray));

        //int[] firstArray = {3, 6, 8, 9, 10, 1, 4, 2, 7, 5};

        // Step 2: Get the sum of all elements in the array
        int sumAllElements = 0;
        for (int j : firstArray) {
            sumAllElements += j;
        }
        System.out.println("The sum of all elements in the first array is: " + sumAllElements);


        // Step 3: Get the max element in the array (with for loop)
        int maxElement = firstArray[0];

        for (int i = 0; i < firstArray.length; i++) {
            if (maxElement < firstArray[i]) {
                maxElement = firstArray[i];
            }
        }
        System.out.println("The max element in the first array (for loop) is: " + maxElement);


        // Step 3: Get the max element in the array (with sort method)
        /* if .sort() used, the original Array has been changed */
        Arrays.sort(firstArray);
        int maxElementWithArray = firstArray[firstArray.length - 1];
        System.out.println("The max element in the first array (sort method) is: " + maxElementWithArray);
        //System.out.println(Arrays.toString(firstArray));


        // Step 4: Create the second array with 11, ..., 20
        int[] secondArray = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


        // Step 5: Create the third array with the sum of elements from the first and second arrays
        int[] sumArray = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            sumArray[i] = firstArray[i] + secondArray[i];
        }
        System.out.println("The sum array is: " + Arrays.toString(sumArray));


        // multi-dimensional arrays
        /* METHOD 1: Set the size of arrays and then assign values */
        String[][] breakfast = new String[2][2];
        breakfast[0][0] = "coffee";
        breakfast[0][1] = "juice";
        breakfast[1][0] = "toast";
        breakfast[1][1] = "bagel";

        System.out.println("The 2x2 matrix is: " + Arrays.deepToString(breakfast));
        System.out.println("To read juice: " + breakfast[0][1]);

        /* METHOD 2: Assign values directly -> based on it, the size will be set */
        String[][] lunch = {
                {"rice", "noodle"},
                {"pasta", "pizza"}
        };

        System.out.println("The 2x2 matrix is: " + Arrays.deepToString(lunch));
        System.out.println("To read pasta: " + lunch[1][0]);
    }
}
