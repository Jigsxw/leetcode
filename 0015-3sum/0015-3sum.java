import java.util.Arrays;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);
        
        if(nums.length<3) return arr;
        
        for(int i=0;i<nums.length;i++){
            if(i==0||nums[i]!=nums[i-1]){         
                int low=i+1;
                int high=nums.length-1;
                int target=0-nums[i];

                while(low<high){
                    if(nums[low]+nums[high]==target){
                        arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high&&nums[low]==nums[low+1]) low++;
                        while(low<high&&nums[high]==nums[high-1]) high--;
                        
                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high]<target){
                        low++;
                        
                    }
                    else{
                        high--;
                    }
                }
            }
        }
        
        return arr;
    }  
}