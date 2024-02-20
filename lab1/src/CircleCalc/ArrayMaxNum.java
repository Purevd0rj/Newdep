package CircleCalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class ArrayMaxNum {
    public static int findMax(ArrayList<Integer> arrayList) {
        
        int max = arrayList.get(0); 
        for (int i = 1; i < arrayList.size(); i++) {
            int current = arrayList.get(i);
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
    
public static int findMin (ArrayList<Integer> arrayList) {
        
	    int min = arrayList.get(0);
	    for (int i = 1; i < arrayList.size(); i++) {
            int current = arrayList.get(i);
            if (current < min) {
                min = current;
            }
        }
        return min;
    }

public static int sum(ArrayList<Integer> arrayList) {
    
    int sum = 0; 
    for (int i = 0; i < arrayList.size(); i++) {
        sum += arrayList.get(i);
    }

    return sum;
}

public static ArrayList<Integer> sorted(ArrayList<Integer> arrayList) {
   
    ArrayList<Integer> sortedList = new ArrayList<>(arrayList);    
    Collections.sort(sortedList);

    return sortedList;
}

static class OddComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        if (a % 2 != 0 && b % 2 == 0) {
            return -1;
        } else if (a % 2 == 0 && b % 2 != 0) {
            return 1; 
        } else {
            return a - b; 
        }
    }
}
static class EvenComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        if (a % 2 == 0 && b % 2 != 0) {
            return -1; 
        } else if (a % 2 != 0 && b % 2 == 0) {
            return 1; 
        } else {
            return a - b; 
        }
    }
}
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(15);
        numbers.add(8);

        int maxNumber = findMax(numbers);
        System.out.println("Maximum number: " + maxNumber);
        int minNumber=findMin(numbers);
        System.out.println("Minimum number:"+minNumber);
        int sum = sum(numbers);
        System.out.println("Sum of all elements: " + sum);
        
        
        ArrayList<Integer> sortedList = sorted(numbers);
        System.out.println("Original List: " + numbers);
        System.out.println("Sorted List: " + sortedList);
        
        Collections.sort(numbers, new OddComparator());
        System.out.println("Sorted ArrayList by odd numbers: " + numbers);
        
        Collections.sort(numbers, new EvenComparator());  
        System.out.println("Sorted ArrayList by even numbers: " + numbers);
        
    }
}
