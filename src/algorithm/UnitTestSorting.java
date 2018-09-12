package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4,};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array of selection sort is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below
        //Insertion sort
        int [] unSortedArray1 = {6,4,8,3,9,2,7,};
        int [] sortedArray1 = {2,3,4,6,7,8,9};

        sort.insertionSort(unSortedArray1);

        try {
            Assert.assertEquals(sortedArray1, unSortedArray1, "Array of insertion sort is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }


        //Bubble sort
        int [] unSortedArray2 = {6,9,2,5,1,0,4,};
        int [] sortedArray2 =   {0,1,2,4,5,6,9};

        sort.bubbleSort(unSortedArray2);

        try {
            Assert.assertEquals(sortedArray2, unSortedArray2, "Array of Bubble sort is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }


        //Merge sort
        /*int [] unSortedArray3 = {6,9,2,5,1,0,4,};
        int [] sortedArray3 =   {0,1,2,4,5,6,9};

        sort.mergeSort(unSortedArray);

        try {
            Assert.assertEquals(sortedArray3, unSortedArray3, "Array of Bubble sort is not Sorted1");
        }catch(Exception ex){
            ex.getMessage();
        }*/

        //Quick sort
        /*int [] unSortedArray4 = {6,9,2,5,1,0,4,};
        int [] sortedArray4 =   {0,1,2,4,5,6,9};

        sort.quickSort(unSortedArray4);

        try {
            Assert.assertEquals(sortedArray4, unSortedArray4, "Array of Quick sort is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }*/

        //Heap sort
        int [] unSortedArray5 = {6,9,2,5,1,0,4,};
        int [] sortedArray5 =   {0,1,2,4,5,6,9};

        sort.heapSort(unSortedArray5);

        try {
            Assert.assertEquals(sortedArray5, unSortedArray5, "Array of Heap sort is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }


        //Bucket sort
        /*int [] unSortedArray6 = {6,9,2,5,1,0,4,};
        int [] sortedArray6 =   {0,1,2,4,5,6,9};

        sort.bucketSort(unSortedArray6);

        try {
            Assert.assertEquals(sortedArray6, unSortedArray6, "Array of Bucket sort is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }*/


        //Shell sort
        int [] unSortedArray7 = {6,9,2,5,1,0,4,};
        int [] sortedArray7 =   {0,1,2,4,5,6,9};

        sort.shellSort(unSortedArray7);

        try {
            Assert.assertEquals(sortedArray7, unSortedArray7, "Array of Shell sort is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

    }
}
