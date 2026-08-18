public class LargestAndSecondLargest {
    public static void main(String[] args){
        int[] arr = {12,45,7,89,22};
        int largest = Integer.MIN_VALUE,secondLargest = Integer.MIN_VALUE;
        for (int num : arr){
            if(num> largest){
                secondLargest = largest;
                largest = num;
            }else if(num> secondLargest && num != largest){
                secondLargest = num;
            }
        }
        System.out.println("Largest = "+ largest);
        System.out.println("secondLargest = "+ secondLargest);

    }
    
}
