public class MinMaxSumMethod {
    static int[] getStats(int[] arr){
        int min = arr[0],max = arr[0],sum=0;
        for(int num : arr){
            if (num<min) min = num;
            if(num> max) max = num;
            sum += num;
        }
        return new int[] {min,max,sum};
    }
    public static void main(String[] args){
        int[] numbers = {4,8,1,9,3};
        int[] result = getStats(numbers);
        System.out.println("min ="+result[0]);
        System.out.println("max="+result[1]);
        System.out.println("sum="+result[2]);
    }
    
}
