class Solution {
    
    var list = mutableListOf<Char>()    
    
    fun isValid(s: String): Boolean {
        if(s.length == 0){
            return true
        }
        
        list.add(s.get(0))
        for(i in 1 until s.length){
            var current = getLastOrNull()
            if(current == null || current == s.get(i)){
                list.add(s.get(i))
            }else{
                // addOrRemove(s.get(i))  
                if(current == '(' && s.get(i) == ')'){
                    removeLast()
                } else if(current == '{' && s.get(i) == '}'){
                    removeLast()
                } else if(current == '[' && s.get(i) == ']'){
                    removeLast()
                } else {
                    list.add(s.get(i))
                }
            } 
        }
        return !(list.size > 0)
    }
    
    fun getLastOrNull() : Char? {
        if(list.size > 0){
            return list.get(list.size -1)
        }
        return null
    }
    
    fun removeLast(){
        if(list.size > 0){
            list.removeAt(list.size -1)
        }
    }
    
}