class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        
        int[] count=new int[1001];
        
        for(int i=0;i<nums1.length;i++){
            count[nums1[i]]+=1;
            hm.put(nums1[i],false);
            
        }
        
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])){
                if(count[nums2[i]]>0){
                    arr.add(nums2[i]);
                    count[nums2[i]]-=1;
                }
            }
        }
        
        int[] ans=new int[arr.size()];
        
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        
        return ans;
    }
}