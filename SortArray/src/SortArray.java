// COSC499 Individual GitHub Exercise

// Program: Sort Integer & String arrays

// Description: This basic Java program will prompt user to input a integer or string array and the program will display the sorted array

// import libraries used in this program
import java.util.Scanner; 

public class SortArray 
{
        public static void main(String[] args) 
        {
                int n = 0;                                                              // initiailize number of elements in array
                Scanner scan = new Scanner(System.in);                                  // declare scanner variable

                System.out.print("Enter the number of elements to sort: ");

                n = scan.nextInt();                                                     // read the number of elements in array

                int[] integerArray = new int[n];                                        // create integer array
        
                System.out.print("\nEnter the elements of the array: ");

                for(int i = 0; i < n; i++)
                {
                        integerArray[i] = scan.nextInt();                               // read in each element
                }

                sortIntegerArray(n, integerArray);                                      // call sort integer array method

                System.out.println();

        }


        public static void sortIntegerArray(int n, int[] array) 
        {
                int temp = 0;                                                           // initialize variable used for sorting

                System.out.println("The original sequence of elements in Array is: ");

                for(int i = 0; i < n; i++)
                {
                        System.out.print(array[i] + " ");
                }

                for(int i = 0; i < n; i++)                                              // sort the array in ascending order
                {
                        for(int j = i + 1; j < n; j++)
                        {
                                if(array[i] > array[j])
                                {
                                        temp = array[i];
                                        array[i] = array[j];
                                        array[j] = temp;
                                }
                        }
                }

                System.out.println("\nThe sorted sequence of elements in Array is: ");

                for(int i = 0; i < n; i++)
                {
                        System.out.print(array[i] + " ");
                }
        }
}
