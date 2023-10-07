# Two Sum
## Easy
Given an array of integers **nums** and an integer **target**, return _indices of the two numbers such that they add up to **target**_.

We can assume that each input would have _**exactly**_ **one solution**, and we may not use the same element twice.

We can return the answer in any order! ☕

**Example 1:**
> **Input:** nums = [2, 7, 11, 15], target = 9
> **Output:** [0, 1]
> **Explanation:** Because nums[0] + nums[1] == 9, it will return [0, 1]

**Example 2:**
> **Input:** nums = [3, 2, 4], target = 6
> **Output:** [1, 2]

**Example 3:**
> **Input:** nums = [3, 3], target = 6
> **Output:** [0, 1]

**Constraints:**
```math
2 <= nums.length <= 10^4
```
```math
-10^9 <= nums[i] <= 10^9
```
```math
-10^9 <= target <= 10^9
```
<div align="center">
  <b> Only one valid answer exists. </b>
</div>

**Follow-up:** Can the solution come up with an algorithm that is less than O(n2) time complexity?

