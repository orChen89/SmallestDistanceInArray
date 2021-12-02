package com.or;

public class Main {

    public static void main(String[] args) {

        int[] arr = {8, 6, 4, 2, 9, 8, 3};

        System.out.println("The first index which indicates the smallest distance is: " +smallestDistance(arr));
    }

    public static int smallestDistance(int [] arr){

        int distance;
        int counter = 1;
        int smallest = 1;

        for (int i = 0; i < arr.length; i++) {
            distance = Math.abs(arr[i] - arr[counter]);
            counter++;
            if (distance <= smallest) {
                smallest = arr[i];
                break;
            }
        }
        return smallest;
    }
}





