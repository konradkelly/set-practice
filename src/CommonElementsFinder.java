import java.util.HashSet;
import java.util.Set;

/**
 * The CommonElementsFinder class provides a method for finding common elements
 * between two arrays of integers.
 */
public class CommonElementsFinder {

    /**
     * Finds the common elements between two arrays of integers.
     *
     * @param array1 the first array of integers
     * @param array2 the second array of integers
     * @return a Set<Integer> containing the integers that are present in both arrays
     */
    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> numsArr1 = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            numsArr1.add(array1[i]);
        }
        Set<Integer> commonNums = new HashSet<>();
        for (int j = 0; j < array2.length; j++) {
            if(numsArr1.contains(array2[j])) {
                commonNums.add(array2[j]);
            }
        }
        return commonNums;
    }
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> common = findCommonElements(array1, array2);
        System.out.println("Common elements: " + common);
    }
}
