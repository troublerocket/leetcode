class Solution1548 {
    public List<Integer> mostSimilar(int n, int[][] roads, String[] names, String[] targetPath) {
        int m = targetPath.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int[]road : roads){
            int x = road[0], y = road[1];
            map.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            map.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }
        int[][] dp = new int[m][n];
        int[][] path = new int[m][n];

        // Define base case
        for(int i = 0;i < n; i++){
            if(!names[i].equals(targetPath[0]))
                dp[0][i] = 1;
        }

        // dp[i][j] is the ending-at-j path's minimum edit distance to targetPath[0..i]
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                int currEditDistance = names[j].equals(targetPath[i]) ? 0 : 1;
                dp[i][j] = m + 1;
                for(int nei : map.get(j)){
                    if(dp[i-1][nei] + currEditDistance < dp[i][j]){
                        // update dp[i][j] with neighbours of j as the previous vertex
                        dp[i][j] = Math.min(dp[i][j], dp[i-1][nei] + currEditDistance);
                        // path[i][j] keeps the previous vertex with min distance
                        path[i][j] = nei;
                    }
                }
            }
        }

        // Find the last vertex of the minimum-edit-distance path
        int curr = -1, min = m + 1;
        for(int i = 0; i < n; i++){
            if(dp[m-1][i] < min){
                min = dp[m-1][i];
                curr = i;
            }
        }
        List<Integer> res = new ArrayList<>(m);
        res.add(curr);

        // Use path[v] to trace back from the last vertex along the min path
        for(int i = m-1; i > 0; i--){
            res.add(0, path[i][curr]);
            curr = path[i][curr];
        }

        return res;
    }
}