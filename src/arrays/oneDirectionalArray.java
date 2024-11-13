package arrays;
//dataType[] arrayName=new dataType[size];
//dataType arrayName[]=new dataType[size];
//example
//int[] myArray = new int[5];
//int myArray[] new int[5];
//int[] myArray ={,4,3,2,6};


public class oneDirectionalArray {

    // Method to print the elements of an integer array
    public static void printArray(int[] arr) {
        int n = arr.length; // Get the length of the array
        for (int i = 0; i < n; i++) { // Iterate through each element
            System.out.print(arr[i] + " "); // Print the element and a space
        }
        System.out.println(); // Print a newline character
    }

    // Method to demonstrate array usage
    public void arrayDemo() {
        int[] myArray = new int[10]; // Declare and initialize an array of size 10
        printArray(myArray);
        //change the value of index 3
        myArray[3]= 5;
        myArray[4]= 5;
        myArray[6]= 5;
        printArray(myArray);// Print the array elements
        myArray[3]= 4;
        myArray[4]= 7;
        printArray(myArray);
        System.out.println(myArray.length);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        oneDirectionalArray onedirectionalarray = new oneDirectionalArray();
        onedirectionalarray.arrayDemo();
    }
}