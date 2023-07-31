import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.lang.Math;
public class OS_Finding {

    public static void main(String[] args) throws FileNotFoundException {
        int index = Integer.parseInt(args[1]); // set index to the number the user enters as the command parameter
        Scanner input = new Scanner(new File(args[0])); // create scanner to open file that user enters as a command parameter
        int count = 0; // create a counter variable
        while (input.hasNextLine()) { //create a while loop that will go through and count each line of the file
            input.nextLine();
            count++;
        }
        input.close(); //close the input scanner
        int[] arrays = new int[count]; //create an integer array that is the same size as the number of lines in the file
        Scanner insert = new Scanner(new File(args[0])); //create a new scanner to reopen the file
        int i = 0; // create another counter variable
        while (insert.hasNextInt()) { // going through to each integer in txt file
            arrays[i++] = insert.nextInt(); // putting every integer into the array
        }
        insert.close(); //closer insert scanner
        if (index <= arrays.length) { //if the index entered is less than or equal to the array length
            System.out.println(RandomizedSelect(arrays, 0, arrays.length - 1, index)); //call the method
            //print out the result of the RandomizedSelect method
        } else {
            System.out.println((String) null); //else print out null because the index is bigger than the array size
        }
    }

        public static int partition(int[] A, int left, int right) {
            int pivot = A[right]; // set pivot to the right of the array
            int index = left; //set index to the left

            for (int i = left; i <= right - 1; i++) { //for loop
                if (A[i] <= pivot) {
                    swap(A,index, i); // call swap method to swap the index and i
                    index++; //increment index
                }

            }
            swap(A, index, right); //call swap method to swap the index and right
            return index; //return index
    }
    static void swap(int A[], int x, int y) { //swap method
        int array = A[x];
        A[x] = A[y];
        A[y] = array;
    }
    static int randomized_partition(int[] A, int left, int right) {
        int i = left + (int)(Math.random() *((right - left) + 1)); //use random method with the range of right and left
        swap(A, right, left); //call swap method to swap the right and left
        return partition(A, left, right); //return partition
    }
    static int RandomizedSelect(int [] A, int p, int r, int i) {
        if (p == r) { //if p equals r return A[p]
            return A[p];
        }
        int q = randomized_partition(A, p, r); //call randomized_partition method
        int k = q - p + 1;
        if(i == k) {
            return A[q];
        }
        else if (i < k) {
            return RandomizedSelect(A, p, q - 1, i); //call itself
        }
        else {
            return RandomizedSelect(A, q+1, r, i -k); //call itself
        }
    }



}
