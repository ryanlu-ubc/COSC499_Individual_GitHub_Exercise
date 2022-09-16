import static org.junit.Assert.assertArrayEquals;

import org.junit.*;

public class SortArrayTest 
{
        @Test
        public void test1() 
        {
                int[] sortedIntegerArray = {7, 12, 15, 26, 88};
                int[] unSortedIntegerArray = {12, 88, 26, 7, 15};
                assertArrayEquals(sortedIntegerArray, SortArray.sortIntegerArray(5, unSortedIntegerArray));
        }

        @Test
        public void test2()
        {
                int[] sortedIntegerArray = {3, 5, 7, 9, 11};
                int[] unSortedIntegerArray = {11, 3, 9, 5, 7};
                assertArrayEquals(sortedIntegerArray, SortArray.sortIntegerArray(5, unSortedIntegerArray));
        }

}
