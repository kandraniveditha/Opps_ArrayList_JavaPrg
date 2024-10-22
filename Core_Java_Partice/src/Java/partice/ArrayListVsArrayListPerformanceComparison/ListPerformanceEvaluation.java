package Java.partice.ArrayListVsArrayListPerformanceComparison;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceEvaluation {

    // Method to fill the list
    private static void fillOutList(List<Integer> list, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            list.add(i);
        }
    }

    // Adding elements to the beginning
    public static void addElementsToBeginning(List<Integer> list, int numberOfElementsToAdd) {
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            list.add(0, i);  // Add at the beginning (index 0)
        }
    }

    // Adding elements to the middle
    public static void addElementsToMiddle(List<Integer> list, int numberOfElementsToAdd) {
        int middleIndex = list.size() / 2;
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            list.add(middleIndex, i);  // Add around the middle
        }
    }

    // Adding elements to the end
    public static void addElementsToEnd(List<Integer> list, int numberOfElementsToAdd) {
        for (int i = 0; i < numberOfElementsToAdd; i++) {
            list.add(i);  // Add at the end
        }
    }

    // Removing elements from the beginning
    public static void removeElementsFromBeginning(List<Integer> list, int numberOfElementsToRemove) {
        for (int i = 0; i < numberOfElementsToRemove; i++) {
            if (!list.isEmpty()) {
                list.remove(0);  // Remove from the beginning (index 0)
            }
        }
    }

    // Removing elements from the middle
    public static void removeElementsFromMiddle(List<Integer> list, int numberOfElementsToRemove) {
        int middleIndex = list.size() / 2;
        for (int i = 0; i < numberOfElementsToRemove; i++) {
            if (!list.isEmpty() && middleIndex < list.size()) {
                list.remove(middleIndex);  // Remove from around the middle
            }
        }
    }

    // Removing elements from the end
    public static void removeElementsFromEnd(List<Integer> list, int numberOfElementsToRemove) {
        for (int i = 0; i < numberOfElementsToRemove; i++) {
            if (!list.isEmpty()) {
                list.remove(list.size() - 1);  // Remove from the end
            }
        }
    }

    // Main method remains unchanged
    public static void main(String[] args) {
        // Your main method is already defined for performance tests.
    }
}