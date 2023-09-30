# Menu
[269. Alien Dictionary](#alien-dictionary)

[727. Minimum Window Subsequence](#minimum-window-subsequence)

[1063. Number of Valid Subarrays](#number-of-valid-subarrays)

[1548. The Most Similar Path in a Graph](#the-most-similar-path-in-a-graph)

## Alien Dictionary
 <!--- Problem statement ---> 
[Leetcode source](https://leetcode.com/problems/alien-dictionary)

[My solution](https://github.com/troublerocket/leetcode/blob/main/Premium/269.%20Alien%20Dictionary.java)

There is a new alien language that uses the English alphabet. However, the order among the letters is unknown to you.

You are given a list of strings `words` from the alien language's dictionary, where the strings in `words` are 
**sorted lexicographically** by the rules of this new language.

Return a string of the unique letters in the new alien language sorted in lexicographically increasing order by the new language's rules. If there is no solution, return `""`. If there are multiple solutions, return any of them.

### Example 1:
> **Input**: words = ["wrt","wrf","er","ett","rftt"]
> 
>**Output**: "wertf"

### Example 2:
> **Input**: ["z","x"]
> 
>**Output**: "zx"

### Example 3:
> **Input**: ["z","x","z"]
> 
>**Output**: ""
> 
>**Explanation**: The order is invalid, so return "".
 
### Constraints:
 <!--- Conditions and constraints ---> 

- `1 <= words.length <= 100`
- `1 <= words[i].length <= 100`
- `words[i]` consists of only lowercase English letters.


## Minimum Window Subsequence
[Leetcode source](https://leetcode.com/problems/minimum-window-subsequence/)

[My solution](https://github.com/troublerocket/leetcode/blob/main/Premium/727.%20Minimum%20Window%20Subsequence.java)

Given strings `s1` and `s2`, return the minimum _contiguous substring part_ of `s1`, so that `s2` is a subsequence of the part.

If there is no such window in `s1` that covers all characters in `s2`, return the empty string `""`. If there are multiple such minimum-length windows, return the one with the **left-most starting index**.

### Example 1:
> **Input**: s1 = "abcdebdde", s2 = "bde"
> 
> **Output**: "bcde"
> 
> **Explanation**: 
"bcde" is the answer because it occurs before "bdde" which has the same length.
"deb" is not a smaller window because the elements of s2 in the window must occur in order.
### Example 2:
> **Input**: s1 = "jmeqksfrsdcmsiwvaovztaqenprpvnbstl", s2 = "u"
> 
> **Output**: ""
 

### Constraints:
- `1 <= s1.length <= 2 * 104`
- `1 <= s2.length <= 100`
- `s1` and `s2` consist of lowercase English letters.

## Number of Valid Subarrays
 <!--- Problem statement ---> 
[Leetcode source](https://leetcode.com/problems/number-of-valid-subarrays/)

[My solution](https://github.com/troublerocket/leetcode/blob/main/Premium/1063.%20Number%20of%20Valid%20Subarrays.java)

Given an integer array nums, return the number of non-empty subarrays with the leftmost element of the subarray not larger than other elements in the subarray.

A subarray is a contiguous part of an array.
### Example 1:
> **Input**:  nums = [1,4,2,5,3]
> 
>**Output**: 11
> 
>**Explanation**:  There are 11 valid subarrays: [1],[4],[2],[5],[3],[1,4],[2,5],[1,4,2],[2,5,3],[1,4,2,5],[1,4,2,5,3].

### Example 2:
> **Input**: nums = [3,2,1]
> 
>**Output**: 3
> 
>**Explanation**: The 3 valid subarrays are: [3],[2],[1].

### Example 3:
> **Input**: [2,2,2]
> 
>**Output**: 6
> 
>**Explanation**: There are 6 valid subarrays: [2],[2],[2],[2,2],[2,2],[2,2,2].
 
### Constraints:
 <!--- Conditions and constraints ---> 
- ` 1 <= nums.length <= 5 * 104`
- `0 <= nums[i] <= 105`

## The Most Similar Path in a Graph
[Leetcode source](https://leetcode.com/problems/the-most-similar-path-in-a-graph/)

[My solution](https://github.com/troublerocket/leetcode/blob/main/Premium/1548.%20The%20Most%20Similar%20Path%20in%20a%20Graph.java)

We have `n` cities and `m` bi-directional `roads` where <code>roads[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> connects city <code>a<sub>i</sub></code> with city <code>b<sub>i</sub></code>. Each city has a name consisting of exactly three upper-case English letters given in the string array `names`. Starting at any city `x`, you can reach any city `y` where `y != x` (i.e., the cities and the roads are forming an undirected connected graph).

You will be given a string array `targetPath`. You should find a path in the graph of the **same length** and with the **minimum edit distance** to `targetPath`.

You need to return the order of the nodes in the path with the minimum edit distance. The path should be of the same length of `targetPath` and should be valid (i.e., there should be a direct road between `ans[i]` and `ans[i + 1]`). If there are multiple answers return any one of them.

The edit distance is defined as follows:

![image](https://github.com/troublerocket/leetcode/assets/43049572/c2dca1c3-e295-43b0-8c2d-00da7799d78b)

### Example 1:
![image](https://github.com/troublerocket/leetcode/assets/43049572/b14de740-ece6-45ce-95c4-ec65a7105206)
> **Input**: n = 5, roads = [[0,2],[0,3],[1,2],[1,3],[1,4],[2,4]], names = ["ATL","PEK","LAX","DXB","HND"], targetPath = ["ATL","DXB","HND","LAX"]
> 
>**Output**: [0,2,4,2]
> 
>**Explanation**: [0,2,4,2], [0,3,0,2] and [0,3,1,2] are accepted answers.
[0,2,4,2] is equivalent to ["ATL","LAX","HND","LAX"] which has edit distance = 1 with targetPath.
[0,3,0,2] is equivalent to ["ATL","DXB","ATL","LAX"] which has edit distance = 1 with targetPath.
[0,3,1,2] is equivalent to ["ATL","DXB","PEK","LAX"] which has edit distance = 1 with targetPath.

### Example 2:
![image](https://github.com/troublerocket/leetcode/assets/43049572/0f34f8a1-8eb0-40c3-9466-17cfcf56b77c)
> **Input**: n = 4, roads = [[1,0],[2,0],[3,0],[2,1],[3,1],[3,2]], names = ["ATL","PEK","LAX","DXB"], targetPath = ["ABC","DEF","GHI","JKL","MNO","PQR","STU","VWX"]
> 
>**Output**: [0,1,0,1,0,1,0,1]
> 
>**Explanation**: Any path in this graph has edit distance = 8 with targetPath.

### Example 3:
![image](https://github.com/troublerocket/leetcode/assets/43049572/b98a3ebe-aba1-4d99-9e37-ecd2d83fb0ef)

> **Input**: n = 6, roads = [[0,1],[1,2],[2,3],[3,4],[4,5]], names = ["ATL","PEK","LAX","ATL","DXB","HND"], targetPath = ["ATL","DXB","HND","DXB","ATL","LAX","PEK"]
> 
>**Output**: [3,4,5,4,3,2,1]
> 
>**Explanation**: [3,4,5,4,3,2,1] is the only path with edit distance = 0 with targetPath.
It's equivalent to ["ATL","DXB","HND","DXB","ATL","LAX","PEK"]
 
### Constraints:
 <!--- Conditions and constraints ---> 

- `2 <= n <= 100`
- `m == roads.length`
- `n - 1 <= m <= (n * (n - 1) / 2)`
- <code>0 <= a<sub>i</sub>, b<sub>i</sub> <= n - 1</code>
- <code>a<sub>i</sub> != b<sub>i</sub></code>
- The graph is guaranteed to be connected and each pair of nodes may have at most one direct road.
- `names.length == n`
- `names[i].length == 3`
- `names[i]` consists of upper-case English letters.
- There can be two cities with the same name.
- `1 <= targetPath.length <= 100`
- `targetPath[i].length == 3`
- `targetPath[i]` consists of upper-case English letters.

### Follow up: 
If each node can be visited only once in the path, What should you change in your solution?
