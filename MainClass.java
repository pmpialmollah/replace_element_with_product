package replace_element_with_product;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        int[] array = { 3, 4, 5 };
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(replaceElementWithProduct(array)));
    }

    public static int[] replaceElementWithProduct(int[] array) {
        int n = array.length;
        int[] result = new int[n];

        // left products
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            System.out.println(Arrays.toString(left));
            left[i] = left[i - 1] * array[i - 1];
        }

        System.out.println(Arrays.toString(left));

        // right products and final result
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = left[i] * right;
            right *= array[i];
        }

        return result;
    }

}