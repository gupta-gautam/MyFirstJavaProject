import java.util.*;
public class ArrayPepOne {
    public static void swap(int arr[] , int i , int j){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
int [] arr = new int [5];
arr[0] = 33;
arr[1] = 47;
arr[2] = 59;
arr[3] = 63;
arr[4] = 98;

swap(arr ,0,4);
for(int i =0;i<arr.length;i++){
    System.out.println(arr[i]);
}
    }
}
