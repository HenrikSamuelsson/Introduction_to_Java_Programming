# Checkpoint Answers Chapter 23 #
## 23.1 ##
Insertion sort works the same way as one would sort a hand of cards, i.e. starting with an empty left hand and the cards in the deck face down on the table. One card at a time is then dealt from the table and inserted into the correct position in the left hand. To find the correct position for a card, it is compared with each of the cards already in the hand, from right to left.  

The time complexity for insertion sort is O(n^2).   

## 23.4 ##
Bubble sort will repeatedly step through the list to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.  

The time complexity for a bubble sort is O(n^2).  

## 23.7 ##
Quicksort is a divide and conquer algorithm. Quicksort first divides a large array into two smaller sub-arrays: the low elements and the high elements. Quicksort can then recursively sort the sub-arrays.  
  
The steps are:

1. Pick an element, called a pivot, from the array.  
2. Reorder the array so that all elements with values less than the pivot come before the pivot, while all elements with values greater than the pivot come after it (equal values can go either way). After this partitioning, the pivot is in its final position. This is called the partition operation.  
3. Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.  

The time complexity for a merge sort is O(nlogn).  

## 23.14 ##
The return value will be null when invoking the remove method if the heap is empty.  

## 23.21 ##
Bucket sort is not suitable for sorting strings.  
