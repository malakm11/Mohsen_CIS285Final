import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class testSelectionSort {
    SelectionSort sort = new SelectionSort();

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    @Test
    public void testPositive() {
        int[] arr = { 8, 9, 7, 10, 2 };
        int[] sortedArr = { 2, 7, 8, 9, 10 };
        sort.selectionSort(arr); // Note the method name correction
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testNegative() {
      

    @Test
    public void testMixed() {
       

    @Test
    public void testDuplicates() {
       
    }
}
