import java.io.BufferedReader


fun main(){
    var N = readLine()!!.toInt()
    var cnt:Int=0
    for(i in 1..N) {
        var j=i
        while(j>0 && j%5==0){
            cnt++
            j/=5
        }
    }
    println(cnt)
}