class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int area;
        int left=0;
        int right=n-1;
        while(left<=right){
            int l=Math.min(height[left],height[right]);
            int b=right-left;
            area=l*b;
            max=Math.max(max,area);
            if(height[left]<=height[right]){
                left++;
            }else {
                right--;
            }
        }
        return max;
    }
}