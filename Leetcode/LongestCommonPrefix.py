# Write a function to find the longest common prefix string amongst an array of strings.
# If there is no common prefix, return an empty string "".

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = strs[0]
        
        for i in range(1, len(strs)):
            prefix = self.getCommonPrefix(prefix, strs[i])
        
        return prefix
        
    def getCommonPrefix(self, prefix, word):
        lim = len(prefix) if len(prefix) < len(word) else len(word)
        updated = ""

        for i in range(0, lim):
            if (prefix[i] == word[i]):
                updated += prefix[i]
            else:
                break
        return updated
