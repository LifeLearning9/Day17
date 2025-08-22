# Day17 :Longest Common Prefix  :We are given an array of strings.
We need to find the longest string prefix that is common to all strings.
**Testcases**
1. Input: flower,flow,flight       Output: fl
2. Input:  dog,racecar,car         Output:""

**Intuition** 
1.If there is a common prefix, it must be a prefix of the first word.
2.So, start with the first word (res = first string).
3.Compare it with the second word character by character.
    Keep only the part that matches.
4. Update res with this new prefix.
5. Continue with the next word.
6.If at any time res becomes empty → no prefix exists, stop early.

**Algorithm Flow** 
1.Take the first string as initial res.
2.For each string in the array from the second onward:
a. Create an empty string ans.
b. Compare characters of res and the current string one by one until:
3.A mismatch occurs OR
One string ends.
c. Build the matching part (ans).
d. Update res = ans.
e. If res becomes empty, stop immediately.
4.Print res → this is the longest common prefix.

**Complexity Analysis**
Time Complexity:O(N × M)
Space Complexity:O(M)
