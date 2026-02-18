public class LeetCode283 {
    private void swap(int[] nums,int i,int count){
        int temp = nums[i];
        nums[i] =nums[count];
        nums[count]=temp;

    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count =0;
        for(int i =0;i<n;i++){
            if(nums[i]!=0){
                swap(nums,i,count);
                count++;
            }

        }
    }
}
