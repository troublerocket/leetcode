# Topics
[Monotonic Stack](#monotonic-stack)

[Trie](#trie)

[Union Find](#union-find)

[Priority Queue](#priority-queue)

[Kadane's Algorithm](#kadanes-algorithm)

[Binary Search](#binary-search)

[Greedy](#greedy)

[Sliding Window](#sliding-window)

[Dynamic Programming](#dynamic-programming)

[Sweep Line](#sweep-line)

[Two Pointers](#two-pointers)

[Prefix Sum](#prefix-sum)

[Cycle](#cycle)

[Tree](#tree)

[Tree Map](#tree-map)

[Graph](#graph)

[Simulation](#simulation)

[Design](#design)

[Bit Manipulation](#bit-manipulation)

[Out of Category](#out-of-category)



## Monotonic Stack
[1063. Number of Valid Subarrays](https://leetcode.com/problems/number-of-valid-subarrays/) **💸premium💸**

[456. 132 Pattern](https://leetcode.com/problems/132-pattern/)

[1081. Smallest Subsequence of Distinct Characters](https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/)

[2866. Beautiful Towers II](https://leetcode.com/problems/beautiful-towers-ii/)

[2355. Maximum Number of Books You Can Take](https://leetcode.com/problems/maximum-number-of-books-you-can-take/) **💸premium💸**

[1425. Constrained Subsequence Sum](https://leetcode.com/problems/constrained-subsequence-sum/) mono stack + DP

[85. Maximal Rectangle](https://leetcode.com/problems/maximal-rectangle/) DP + mono stack

[255. Verify Preorder Sequence in Binary Search Tree](https://leetcode.com/problems/verify-preorder-sequence-in-binary-search-tree/) **💸premium💸** 

Use mono stack to emulate & verify pre-order traversal
- Emulate:
  - Node at the top of the stack is the root of the subtree we're visiting rn.
  - Push nodes when we're visiting deep down (go to the left subtree) & pop nodes when we need to backtrack up the tree (go back to the right subtree)
- Verify:
  -  When we return from a node (pop from the stack), every value we encounter from now on must be greater than node.

[402. Remove K Digits](https://leetcode.com/problems/remove-k-digits/)

[85. Maximal Rectangle](https://leetcode.com/problems/maximal-rectangle/) Mono stack + DP


## Trie

[2707. Extra Characters in a String](https://leetcode.com/problems/extra-characters-in-a-string/) Trie + DP

[421. Maximum XOR of Two Numbers in an Array](https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/) Bitwise Trie

## Union Find

[2092. Find All People With Secret](https://leetcode.com/problems/find-all-people-with-secret/) UF with reset

[2709. Greatest Common Divisor Traversal](https://leetcode.com/problems/greatest-common-divisor-traversal/) Prime factor

## Priority Queue

[2542. Maximum Subsequence Score](https://leetcode.com/problems/maximum-subsequence-score/)

[1235. Maximum Profit in Job Scheduling](https://leetcode.com/problems/maximum-profit-in-job-scheduling/)

[1199. Minimum Time to Build Blocks](https://leetcode.com/problems/minimum-time-to-build-blocks/) **💸premium💸**

[2402. Meeting Rooms III](https://leetcode.com/problems/meeting-rooms-iii/) **💸premium💸** Use 2 PQs

[857. Minimum Cost to Hire K Workers](https://leetcode.com/problems/minimum-cost-to-hire-k-workers/)


## Kadane's Algorithm

[2393. Count Strictly Increasing Subarrays](https://leetcode.com/problems/count-strictly-increasing-subarrays/) **💸premium💸**

## Binary Search

[1539. Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/)


## Greedy

[1326. Minimum Number of Taps to Open to Water a Garden](https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/)

[646. Maximum Length of Pair Chain](https://leetcode.com/problems/maximum-length-of-pair-chain/) Non-optimal solution: dp

[1057. Campus Bikes](https://leetcode.com/problems/campus-bikes/) **💸premium💸** PriorityQueue + Greedy

[1980. Find Unique Binary String](https://leetcode.com/problems/find-unique-binary-string/) Very Elegant!

[2939. Maximum Xor Product](https://leetcode.com/problems/maximum-xor-product/) Bit manipulation + Greedy

[1642. Furthest Building You Can Reach](https://leetcode.com/problems/furthest-building-you-can-reach/) PriorityQueue

[948. Bag of Tokens](https://leetcode.com/problems/bag-of-tokens/)

[452. Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/) Intervals - we only care about the right bound

[621. Task Scheduler](https://leetcode.com/problems/task-scheduler/)


## Sliding Window

[2875. Minimum Size Subarray in Infinite Array](https://leetcode.com/problems/minimum-size-subarray-in-infinite-array/)

[2009. Minimum Number of Operations to Make Array Continuous](https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/)

[2024. Maximize the Confusion of an Exam](https://leetcode.com/problems/maximize-the-confusion-of-an-exam/)

[2537. Count the Number of Good Subarrays](https://leetcode.com/problems/count-the-number-of-good-subarrays/)

[1838. Frequency of the Most Frequent Element](https://leetcode.com/problems/frequency-of-the-most-frequent-element/)

[930. Binary Subarrays With Sum](https://leetcode.com/problems/binary-subarrays-with-sum/) A variant

[2962. Count Subarrays Where Max Element Appears at Least K Times](https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/)

[992. Subarrays with K Different Integers](https://leetcode.com/problems/subarrays-with-k-different-integers/) & [1248. Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/description/) 

Two passes: `exact(k) = atMost(k) - atMost(k - 1)` & One pass: keep a count of valid left bounds

[2444. Count Subarrays With Fixed Bounds](https://leetcode.com/problems/count-subarrays-with-fixed-bounds/) HARD T_T


## Dynamic Programming

[2742. Painting the Walls](https://leetcode.com/problems/painting-the-walls/)

[446. Arithmetic Slices II - Subsequence](https://leetcode.com/problems/arithmetic-slices-ii-subsequence/)

[629. K Inverse Pairs Array](https://leetcode.com/problems/k-inverse-pairs-array/)

[276. Paint Fence](https://leetcode.com/problems/paint-fence/) **💸premium💸**

[741. Cherry Pickup](https://leetcode.com/problems/cherry-pickup/)

[1463. Cherry Pickup II](https://leetcode.com/problems/cherry-pickup-ii/)

[514. Freedom Trail](https://leetcode.com/problems/freedom-trail/)

[834. Sum of Distances in Tree](https://leetcode.com/problems/sum-of-distances-in-tree/) DFS + DP


## Sweep Line

[2251. Number of Flowers in Full Bloom](https://leetcode.com/problems/number-of-flowers-in-full-bloom/) Binary Search + Sweep Line

[253. Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/) **💸premium💸**

[1272. Remove Interval](https://leetcode.com/problems/remove-interval/) **💸premium💸**

## Two Pointers

*Two pointers is a kind of *Greedy* problems*

[1793. Maximum Score of a Good Subarray](https://leetcode.com/problems/maximum-score-of-a-good-subarray/) Non-optimal solution: monotonic stack

[11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

## Prefix Sum

[1171. Remove Zero Sum Consecutive Nodes from Linked List](https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/) Prefix Sum + Linked List

[1915. Number of Wonderful Substrings](https://leetcode.com/problems/number-of-wonderful-substrings/) Prefix Sum + Bit Manipulation

XOR function is equivalent to subtraction under modulo 2


## Cycle

*Cycle sort can be used when finding duplicates or missing numbers when the given nums are in range \[1, n\]. But it modifies the input.*

[287. Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) 1. Cycle Sort 2. Cycle Detection - Tortoise🐢 and Hare🐇

[41. First Missing Positive](https://leetcode.com/problems/first-missing-positive/) Cycle Sort

## Tree

[1660. Correct a Binary Tree](https://leetcode.com/problems/correct-a-binary-tree/) **💸premium💸** Straightforward BFS or DFS

[2385. Amount of Time for Binary Tree to Be Infected](https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/) One-pass DFS

## Tree Map

[2926. Maximum Balanced Subsequence Sum](https://leetcode.com/problems/maximum-balanced-subsequence-sum/)

## Graph

[787. Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/)


## Simulation

[1441. Build an Array With Stack Operations](https://leetcode.com/problems/build-an-array-with-stack-operations/)

[1503. Last Moment Before All Ants Fall Out of a Plank](https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/) Brain teaser :\

[950. Reveal Cards In Increasing Order](https://leetcode.com/problems/reveal-cards-in-increasing-order/)


## Design

[1845. Seat Reservation Manager](https://leetcode.com/problems/seat-reservation-manager/) PriorityQueue w/o pre-initialization

## Bit Manipulation

[201. Bitwise AND of Numbers Range](https://leetcode.com/problems/bitwise-and-of-numbers-range/) Key: Find common prefix

## Out of Category

[1291. Sequential Digits](https://leetcode.com/problems/sequential-digits/)

[2812. Find the Safest Path in a Grid]()



