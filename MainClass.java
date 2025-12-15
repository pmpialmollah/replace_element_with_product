package replace_element_with_product;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(replaceElementWithProduct(array)));
    }

    public static int[] replaceElementWithProduct(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int totalProduct = 1;
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                totalProduct *= array[j];
            }
            newArray[i] = totalProduct;
        }
        return newArray;
    }
}