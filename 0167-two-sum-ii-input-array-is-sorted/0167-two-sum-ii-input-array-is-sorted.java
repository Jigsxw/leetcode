class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int low=0;
        int high=numbers.length-1;
        
        while(low<high){
            if(numbers[low]+numbers[high]<target){
                low+=1;
            }
            else if(numbers[low]+numbers[high]>target){
                high-=1;;
            }
            else{
                ans[0]=low+1;
                ans[1]=high+1;
                break;
            }
        }
        
        return ans;
        
    }
}