class Solution {
        fun longestCommonPrefix(strs: Array<String>): String {

            if(strs.size==0)  {
                return "";
            }

            var ansStr = ""
            var canContinue = true
            var pos = 0
            while(canContinue){
                if(pos < strs[0].length){
                    var curr = strs[0].get(pos)
                    for(i in 1 until strs.size){
                    if(!(pos < strs[i].length && strs[i].get(pos) == curr)){
                        return ansStr
                    }
                }    
                ansStr += curr
                pos++
                }else{
                    return ansStr
                }
            }
            return ansStr
        }  
    }