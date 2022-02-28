fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {    
    var m = nums1.size
    var n = nums2.size
    var midPosition = ((m+n)/2)+1  
    println("Mid $midPosition")
    var firstPos = 0
    var secPos = 0
    var arr = IntArray(m+n)
    for(i in 0..midPosition){
        if(firstPos < nums1.size && secPos < nums2.size){
            if(nums1[firstPos] < nums2[secPos]){
                arr[i] = nums1[firstPos]
                firstPos = firstPos+1
          }else{
                arr[i] = nums2[secPos]
                secPos = secPos+1
          }   
        }else if(firstPos < nums1.size){
            arr[i] = nums1[firstPos]
            firstPos = firstPos+1
        }else if(secPos < nums2.size){
            arr[i] = nums2[secPos]
            secPos = secPos+1
        }  
        // print("${arr[i]} ")
    }
    var finSize = m+n
    var piv = finSize/2
    return if(finSize%2 == 0){
            // Two Position
        println("Piv ${piv}")
      (      (arr[piv].toDouble())+(arr[piv-1].toDouble()))/2  
    }else{
            // One Position
            (arr[piv].toDouble())
    }
}