import java.util.Arrays;
public class Q3reverseArray {
 public static void main(String[] args) {         
  int[] arr = {10, 20, 30, 40, 50};
 System.out.println("Original array: " + Arrays.toString(arr));
 reverseArray(arr);
 System.out.println("Reversed array: " + Arrays.toString(arr));
}
public static void reverseArray(int[] arr) {
 int left = 0, right = arr.length - 1;
 while (left < right) {           
 int temp = arr[left];
 arr[left] = arr[right];
  arr[right] = temp;           
 left++;
 right--;
 }
        }
    }
    

