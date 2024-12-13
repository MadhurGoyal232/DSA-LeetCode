class Solution{

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        if (x >= 0 && x < 10) {
            return true; 
        }

        int count = 0;
        int original = x;
        while(original!=0){
            original = original/10;
            count++;
        }
        int arr[] = new int[count]; 
        original = x;       
            for(int i=0;i<count;i++){
                arr[i] = original%10;
                // original = original%10;
                // arr[i] = original;                 
                original = original/10;/////
            }
        
            int start = 0;
            int end = count -1;
            // boolean bool = true;
        while (start<end){

            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;


    }

    public static void main(String[] args){

        Solution sum1 = new Solution();

        boolean res = sum1.isPalindrome(101);
        System.out.println(res);


    }
}




