class Solution {
    fun reverse(x: Int): Int {
        var num = x
        var isNeg = false
        if(x < 0){
            isNeg = true
            num *= -1
        }
        var rev = 0L
        while(num>0){
            rev = (rev*10)+(num%10)
            if(rev > Int.MAX_VALUE){
                return 0
            }
            num /= 10
        }
        if(isNeg){
            rev *= -1
        }
        return rev.toInt()
    }
}