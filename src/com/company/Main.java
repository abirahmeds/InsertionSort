package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = intArr(10);
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i ++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j-1] > arr[j])
                {
                    swap(arr, j, j-1);
                }else
                    {
                    j = 0;
                }
            }
        }
    }
    public static void swap(int[] arr, int idx, int idx2)
    {
        int temp = arr[idx];
        arr[idx] = arr[idx2];
        arr[idx2] = temp;
    }
    public static int[] intArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            int randInt = (int)(Math.random() * ((11)));
            arr[i] = randInt;
        }
        return arr;
    }
}
