class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;/////////////
                    
                }

            }
        }
        // return arr;
        return new int[] {-1, -1};
    }
    public static void main(String[] args){

        Solution sum1 = new Solution();


        int x[] = sum1.twoSum(new int[]{1,3,5,6,7} , 9);
        // System.out.println(x);
        System.out.println(Arrays.toString(x)); // Print the array as a string

    }
}
