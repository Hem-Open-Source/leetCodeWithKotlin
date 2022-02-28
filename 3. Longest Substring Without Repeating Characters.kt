//Sliding Window Problem

fun lengthOfLongestSubstring(s: String): Int {
    var maxLength = Integer.MIN_VALUE
    var str = ""
    if(s.length == 0){
        return 0
    }
    
    for(i in 0 until s.length){
        if(str.contains(s.get(i))){
            str = str.substring(str.indexOf(s.get(i))+1,str.length)
        }
        str = str + s.get(i)
        maxLength = Math.max(maxLength, str.length)
    }
    return maxLength
}

// ""
// "cdd"
// "dvdf"
// "bbbbb"
// "abcabcbb"

// Points to observe
// 1. If the char exists then the new sub string will form from the next char of the initial position.
// 2. If the char exists in the new string then that position will act as pivot to slide window.

// pwwkew
// |p|wwkew
// |pw|wkew
// pw|w|kew
// pw|wk|ew
// pw|wke|w
// pwwke|w|
