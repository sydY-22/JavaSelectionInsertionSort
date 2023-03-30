package project10_4;

public class Sorting<T> {
    //  Sorts the specified array of objects using the selection
    //  sort algorithm.
    public void selectionSort(Comparable<T>[] list)
    {
        int max;
        Comparable<T> temp;

        for (int index = 0; index < list.length-1; index++)
        {
            max = index;
            for (int scan = index+1; scan < list.length; scan++)
            	// set the compare to method greater than 0 
                if (list[scan].compareTo((T)list[max]) > 0)
                	// set max equal to scan
                    max = scan;

            // Swap the values
            temp = list[max];
            list[max] = list[index];
            list[index] = temp;
        }
    }
    //  Sorts the specified array of objects using the insertion
    //  sort algorithm.
    public void insertionSort (Comparable<T>[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable<T> key = list[index];
            int position = index;

            //  Shift larger values to the left (front of the list)
            while (position > 0 && key.compareTo((T)list[position-1]) > 0)
            {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }

}
