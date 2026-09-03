import java.util.*;
public class TwoElementSubsets {
static int[] nums = {1, 2, 3};
static void generate(int index, ArrayList<Integer> subset) {
if (subset.size() == 2) {
System.out.println(subset);
return;
}
if (index == nums.length) return;
// Include nums[index]
subset.add(nums[index]);
generate(index + 1, subset);
// Backtrack
subset.remove(subset.size() - 1);
// Exclude nums[index]
generate(index + 1, subset);
}
public static void main(String[] args) {
generate(0, new ArrayList<>());
}
}