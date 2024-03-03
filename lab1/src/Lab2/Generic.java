package Lab2;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

public class Generic {
	private static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
    
	
	private static <T extends Comparable<T>> T findMin(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

	
	 private static <T extends Number> int findSum(T[] array) {
	        int sum = 0;
	        for (T num : array) {
	            sum += num.doubleValue();
	        }
	        return sum;
	    }

	 
	 private static <T extends Comparable<T>> void bubbleSort(T[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j].compareTo(array[j + 1]) > 0) {
	                    // Swap array[j] and array[j+1]
	                    T temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	               
	            }
	        }
	        
	    }
	 
	 private static <T extends Number> double findAverage(T[] array) {
	        double sum = 0.0;
	        for (T num : array) {
	            sum += num.doubleValue();
	        }
	        return sum / array.length;
	    }

	 private static <T extends Comparable<T>> void SortedOddNumbers(T[] array) {
	        ArrayList<T> oddNumbers = new ArrayList<>();
	        for (T num : array) {
	            if ((Integer) num % 2 != 0) {
	                oddNumbers.add(num);
	            }
	        }
	        Collections.sort(oddNumbers);
	        System.out.println("Sorted by odd number:");
	        for (T oddNumber : oddNumbers) {
	            System.out.print(oddNumber + " ");
	        }
	        System.out.println();
	    }
	 
	 private static <T extends Comparable<T>> void SortedEvenNumbers(T[] array) {
	        ArrayList<T> evenNumbers = new ArrayList<>();
	        for (T num : array) {
	            if ((Integer) num % 2 == 0) {
	                evenNumbers.add(num);
	            }
	        }
	        Collections.sort(evenNumbers);
	        System.out.println("Sorted by even number:");
	        for (T oddNumber : evenNumbers) {
	            System.out.print(oddNumber + " ");
	        }
	        System.out.println();
	    }
	 

    private static <T> void printList(T[] array){
    	for(T x:array) {
    		System.out.println(x+" ");
    	}
    	System.out.println();
    }
 
    public static void main(String[] args) {
        Integer[] intArray= {12,3,43,35,6};
        printList(intArray);
        
        Integer maxInt = findMax(intArray);
        System.out.println("Maximum number: " + maxInt);
        
        Integer minInt = findMin(intArray);
        System.out.println("Minimum number: " + minInt);
        
        int sumInt = findSum(intArray);
        System.out.println("Sum of integers: " + sumInt);
        
        bubbleSort(intArray);
        
        
        double averageInt = findAverage(intArray);
        System.out.println("Average of integers: " + averageInt);
        
        SortedOddNumbers(intArray);   
        
        SortedEvenNumbers(intArray);
    }
}