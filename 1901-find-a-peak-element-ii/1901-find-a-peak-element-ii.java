class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int left=0;
        int right=n-1;
        int maxRow=0;
        while(left<=right){
            int max=Integer.MIN_VALUE;
            int mid=left+(right-left)/2;
            for(int i=0;i<m;i++){
                if(mat[i][mid]>max){
                    max=mat[i][mid];
                    maxRow=i;
                }
            }
            int leftValue = (mid==0) ? -1 : mat[maxRow][mid-1];
            int rightValue = (mid==n-1) ? -1 : mat[maxRow][mid+1];
            if(leftValue <max && max> rightValue){
                return new int[]{maxRow, mid};
            }else if(leftValue>max){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}