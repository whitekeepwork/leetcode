#
# @lc app=leetcode id=3 lang=python3
#
# [3] Longest Substring Without Repeating Characters
#
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        b, m, d = 0, 0, {}
        # When get() is called, Python checks if the specified key exists in the dict. 
        # If it does, then get() returns the value of that key. If the key does not exist, 
        # then get() returns the value specified in the second argument to get().
        for i, l in enumerate(s): 
            #b(keft index need ++) when find again, but first one b need keep as 0 so use get(,-1)+1 
            b, m, d[l] = max(b, d.get(l, -1) + 1), max(m, i - b), i

        return max(m, len(s) - b)

