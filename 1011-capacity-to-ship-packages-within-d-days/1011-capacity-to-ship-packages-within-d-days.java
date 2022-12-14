class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0,right=0;
        for(int w: weights){
            left=Math.max(left,w);
            right+=w;
        }
        
        while(left<right){
            int mid=(left+right)/2,day=1,curr=0;
            for(int w:weights){
                if(curr+w>mid){
                    day+=1;
                    curr=0;
                }
                curr+=w;
            }
            if(day>days){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}