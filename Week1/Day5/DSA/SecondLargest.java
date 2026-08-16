public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {12,45,7,89,34};
        int largest = Integer.MIN_VALUE,secondLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if (num>largest){
                secondLargest = largest;
                largest = num;
            }
            else if (num> secondLargest && num != largest);
        }
        System.out.println("Second Largest = "+secondLargest);
    }
}
