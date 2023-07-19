//BRUTE FORCE
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }
}
//OPTIMIZED
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicate = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                duplicate.add(num);
            }else{
                seen.add(num);
            }
        }
        return duplicate;
    }
}
