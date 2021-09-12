def longestSubstring(string):
    dictionary = {}
    startindex = 0
    longest =""
    for i in range(len(string)):
        if string[i] in dictionary:
            startindex = max(startindex, dictionary[string[i]]+1)
        dictionary[string[i]]= i
        longest = max(longest, string[startindex:i+1], key=len)

    print(longest)
    
longestSubstring("bbbbb")
longestSubstring("abcabcbb")
longestSubstring("clementisacap")    
    
