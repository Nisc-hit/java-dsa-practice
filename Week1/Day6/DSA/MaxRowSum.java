public class MaxRowSum {
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3},{10,11,12},{4,5,6}
        };
        int maxSum = Integer.MIN_VALUE,maxRowIndex = -1;
        for(int i=0;i< matrix.length;i++){
            int rowSum = 0;
            for(int num : matrix[i]){
                rowSum += num;
            }
            if(rowSum> maxSum){
                maxSum = rowSum;
                maxRowIndex = i;
            }
        }
        System.out.println("row with max sum = Row"+maxRowIndex + "(sum="+ maxSum+")");
    }
    
}
