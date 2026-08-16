public class AverageOfArray {
    public static void main(String[] args){
        int[] arr ={5,10,15,20,25};
        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        double average = (double) sum/ arr.length;
        System.out.println("Average = "+ average);
    }
    
}
