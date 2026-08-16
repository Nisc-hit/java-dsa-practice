class Solution{
    public int[] twoSum(int[] nums, int target){
        java.util.Map<Integer,Integer>map = new java.util.HashMap<>();
        for(int i =0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};}map.put(nums[i],i);
        }
         return new int[]{};
    }
   
}
public class TwoSum{
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target = 9;
        java.util.Map<Integer,Integer>map = new java.util.HashMap<>();
        int[] result = new int[0];
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                result = new int[]{map.get(complement),i};
                break;
            }
            map.put(nums[i],i);
        }
        System.out.println("Indices:"+result[0]+", "+result[1]);
    }
}