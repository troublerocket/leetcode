class Solution1063 {
    public int validSubarrays(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return 1;
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            // Monotonic Stack
            while(!stack.isEmpty() && nums[i] < nums[stack.peek()]){
                ans += i - stack.pop();
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ans += n - stack.pop();
        }
        return ans;
    }
}