class Solution2355 {
    public long maximumBooks(int[] books) {
        int n = books.length;
        Stack<Integer> stack = new Stack<>();
        // dp[i] is maximum sum of a strictly increasing subarray ending with books[i]
        long[] dp = new long[n];
        long ans = 0;
        for(int i = 0; i < n; i++){
            // Monotonic stack
            while(!stack.isEmpty() && books[stack.peek()] >= books[i] - (i - stack.peek())){
                stack.pop();
            }
            int prevIdx = stack.isEmpty() ? -1 : stack.peek();
            // Before we calculate the sequence sum between [prevIdx + 1, i]
            // We need to make sure the first term of the sequence >= 0
            // So we should trim length of the sequence to be min(i - prevIdx, books[i] + 1)
            int len = Math.min(i - prevIdx, books[i] + 1);
            long firstTerm = books[i] - len + 1;
            long lastTerm = books[i];
            long prev = prevIdx == -1 ? 0 : dp[prevIdx];
            // dp[i] = sequence sum of [prevIdx + 1, i] + dp[prevIdx]
            dp[i] = (firstTerm + lastTerm) * len / 2 + prev;
            ans = Math.max(ans, dp[i]);
            stack.push(i);
        }
        return ans;
    }
}