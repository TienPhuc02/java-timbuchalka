package dev.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] scannerArray= getIntegers(5);
        System.out.println(Arrays.toString(scannerArray));
        printArray(scannerArray);
        int[] sortedArray=sortIntegers(scannerArray);
        System.out.println(Arrays.toString(sortedArray));
    }
    private static int[] getIntegers(int len){
        Scanner scanner = new Scanner(System.in);
        int[] scannerArray=new int[len];
        for(int i=0; i<len;i++){
            scannerArray[i]=scanner.nextInt();
        }
        return  scannerArray;
    }
    private static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+ i+  " contents " + array[i]);
        }

    }
    private static int[] sortIntegers(int[] array){
        int[] sortedArray=Arrays.copyOf(array,array.length);
        int temp;
        boolean flag =true;
        while (flag){
            flag=false;
            for(int i =0; i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i+1];
                    sortedArray[i+1]=sortedArray[i];
                    sortedArray[i]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}
