public class MergeArrays {
    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        int[] merged = new int[arr1.length+arr2.length];
        int k = 0;
        for (int num: arr1)merged[k++]=num;
        for(int num: arr2)merged[k++] = num;
        for(int num: merged){
            System.out.println(num+" ");
        }
    }
    
}
