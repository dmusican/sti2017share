// Kick it all off
public static void mergeSort(int[] array)
{
    int[] tempArray = new int[array.length];
    mergeSort(array,tempArray,0,array.length-1);
}

// Recursive method that outlines the procedure
private static void mergeSort(int[] array, int[] tempArray,
              int left, int right)
{
    if (left < right)
    {
        int center = (left + right) / 2;
        mergeSort(array, tempArray, left, center);
        mergeSort(array, tempArray, center+1, right);
        merge(array, tempArray, left, center+1, right);
    }
}

// Workhorse: Merge together two sorted runs of integers: one starting
// at leftStart, and ending at rightStart-1; the second starting at
// rightStart, and ending at rightEnd
private static void merge(int array[], int tempArray[],
                          int leftStart, int rightStart, int rightEnd) {
    int leftEnd = rightStart - 1;
    int left = leftStart;
    int right = rightStart;
    int temp = 0;  // index into temp array

    // Start merging until one of the halves is exhausted
    while (left <= leftEnd && right <= rightEnd) {
        if (array[left] <= array[right])
        {

            tempArray[temp] = ______________________________;

            left = ________________________________________;
        }
        else
        {
            tempArray[temp] = ______________________________;

            right = _____________________________________;
        }

        temp = ________________________________________;
    }

    // If above loop exits, either left half or right half is
    // done. Finish copying other half that's not done.

    // If left half is not done

    while (_____________________________________)
    {
        tempArray[temp] = ______________________________;
        temp = temp + 1;
        left = left + 1;
    }

    // If right half is not done

    while (_________________________________________)
    {

        tempArray[temp] = ___________________________________;
        temp = temp + 1;
        right = right + 1;
    }

    // Copy temp array over original array

    for (int i=0; i < ________________________________; i++)

        __________________________________ = tempArray[i];

}

