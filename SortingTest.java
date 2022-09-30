import org.junit.Test;
import org.junit.Assert;

public class SortingTest {
    /**
     * Test of insertionSort method, of class Sorting.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("Testing insertionSort...\n");
        int[] nums1 = new int[]{ 3, 6, 1 };
        int[] expResult1 = new int[]{ 1, 3, 6 };
        Sorting instance = new Sorting(nums1);
        instance.insertionSort();
        Assert.assertArrayEquals(expResult1, instance.sortingArray);
        Assert.assertEquals(3, instance.comparisonCount);

        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] expResult2 = new int[]{ 1, 2, 3, 4};
        instance = new Sorting(nums2);
        instance.insertionSort();
        Assert.assertArrayEquals(expResult2, instance.sortingArray);
        Assert.assertEquals(3, instance.comparisonCount);

    }

    /**
     * Test of mergeSort method, of class Sorting.
     */
    @Test
    public void testMergeSort() {
        System.out.println("Testing mergeSort...\n");
        int[] nums1 = new int[]{ 3, 6, 1 };
        int[] expResult1 = new int[]{ 1, 3, 6 };
        Sorting instance = new Sorting(nums1);
        instance.mergeSort(0, nums1.length-1);
        Assert.assertArrayEquals(expResult1, instance.sortingArray);
        Assert.assertEquals(2, instance.comparisonCount);

        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] expResult2 = new int[]{1, 2, 3, 4};
        instance = new Sorting(nums2);
        instance.mergeSort(0, nums2.length-1);
        Assert.assertArrayEquals(expResult2, instance.sortingArray);
        Assert.assertEquals(4, instance.comparisonCount);

    }


    /**
     * Test of heapSort method, of class Sorting.
     */
    @Test
    public void testHeapSort() {
        System.out.println("Testing heapSort...\n");
        int[] nums1 = new int[]{ 3, 6, 1 };
        int[] expResult1 = new int[]{ 1, 3, 6 };
        Sorting instance = new Sorting(nums1);
        instance.heapSort();
        Assert.assertArrayEquals(expResult1, instance.sortingArray);
        Assert.assertEquals(3, instance.comparisonCount);

        int[] nums2 = new int[]{1, 2, 3, 4};
        int[] expResult2 = new int[]{ 1, 2, 3, 4};
        instance = new Sorting(nums2);
        instance.heapSort();
        Assert.assertArrayEquals(expResult2, instance.sortingArray);
        Assert.assertEquals(7, instance.comparisonCount);

    }

}
