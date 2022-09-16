// COSC499 Individual GitHub Exercise

// Program: Sort Integer & String arrays

// Description: This basic Java program will prompt user to input a integer or string array and the program will display the sorted array

// import libraries used in this program
import java.util.Arrays;
import java.util.Scanner; 

public class SortArray 
{
        public static void main(String[] args) 
        {
                int n = 0;                                                              // initiailize number of elements in array
                char type;                                                              // initialize array type
                Scanner scan = new Scanner(System.in);                                  // declare scanner variable

                System.out.print("Enter the number of elements to sort: ");

                n = scan.nextInt();                                                     // read the number of elements in array

                System.out.print("Integer or String? (I/S): ");

                type = scan.next().charAt(0);

                if (type == 'I' || type == 'i')
                {
                        int[] integerArray = new int[n];                                // create integer array

                        System.out.print("\nEnter the elements of the array: ");

                        for(int i = 0; i < n; i++)
                        {
                                integerArray[i] = scan.nextInt();                       // read in each element
                        }

                        sortIntegerArray(n, integerArray);                              // call sort integer array method
                }
                else if (type == 'S' || type == 's')
                {
                        String[] stringArray = new String[n];                           // create String array

                        System.out.print("\nEnter the elements of the array: ");

                        for(int i = 0; i < n; i++)
                        {
                                stringArray[i] = scan.next();
                        }

                        sortStringArray(n, stringArray);

                }
                else
                {
                        System.out.println("Invalid Selection. Please select \"I\" or \"S\"");
                }

                System.out.println();

        }


        public static int[] sortIntegerArray(int n, int[] array) 
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

                return array;
        }


        public static String[] sortStringArray(int n, String[] array) 
        {
                String temp = "";

                System.out.println("The original sequence of elements in Array is: ");

                for(int i = 0; i < n; i++)
                {
                        System.out.print(array[i] + " ");
                }

                for(int i = 0; i < n - 1; i++)
                {
                        for(int j = i + 1; j < n; j++)
                        {
                                if(array[i].compareTo(array[j]) > 0)
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

                return array;
        }



}
