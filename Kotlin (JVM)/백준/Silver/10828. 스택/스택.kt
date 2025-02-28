import java.util.*
 
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
 
    val num = br.readLine().toInt()
 
    val stack = IntArray(num)
    var ptr = -1
 
    fun push(n: Int) {
      stack[++ptr] = n
    }
    fun pop(): Int {
        return if(ptr==-1) -1
        else stack[ptr--]
    }
    fun size(): Int = ptr + 1
    fun empty(): Int {
        return if(ptr == -1) 1
        else 0
    }
    fun top(): Int {
        return if(ptr == -1) -1
        else stack[ptr]
    }
 
    for(i in 0 until num) {
        val line = StringTokenizer(br.readLine())
        when(line.nextToken()){
            "push" -> push(line.nextToken().toInt())
            "pop" -> bw.append("${pop()}\n")
            "size" -> bw.append("${size()}\n")
            "empty" -> bw.append("${empty()}\n")
            "top" -> bw.append("${top()}\n")
        }
    }
 
    bw.write("")
    bw.flush()
    bw.close()
    br.close()
}