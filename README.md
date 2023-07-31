# Randomized Select Algorithm

This is a Java implementation of the Randomized Select algorithm, which finds the k-th smallest element in an array. The algorithm is based on the quicksort partitioning technique, and it has a time complexity of O(n) on average.

## How to Use

1. Make sure you have Java installed on your machine.

2. Clone this repository to your local machine
3. Compile the Java source code using the following command:
  javac OS_Finding.java
4. Run the program with the input file containing integers and the index (k) of the element to find. Replace input_file.txt with the name of your input file and k_value with the index of the element to find:
java OS_Finding input_file.txt k_value
5. The program will read the integers from the input file, find the k-th smallest element in the array, and print the result. If the specified index (k) is greater than the number of elements in the array, it will print null.

## Example
Suppose you have an input file named input.txt with the following content:

15

7

12

3

9

6

To find the 3rd smallest element, run the program as follows:

java OS_Finding input.txt 3

The output will be: 7

## About the Randomized Select Algorithm
The Randomized Select algorithm is a variation of the QuickSelect algorithm, which is used to find the k-th smallest or largest element in an unsorted array. The algorithm employs randomization to choose a pivot element, which ensures an average-case time complexity of O(n) with high probability.


