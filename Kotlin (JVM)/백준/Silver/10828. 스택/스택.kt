import java.util.*
 
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
 
    val num = br.readLine().toInt()
 
    val stack = IntArray(num)
    var ptr = -1
 
    fun push(n: Int) {
      stack[++ptr] = n //정수 x 를  순서대로 스택에 넣는다. 0번쨰부터
    }
    fun pop(): Int {
        return if(ptr==-1) -1 // ptr 이 비어있으면 -1 이기떄문에 -1 를 봔한하고 가장위에있는 정수 인 stack[ptr]을 빼고 후위연사자 이기때문에 결과적으로 stack[--ptr] 가 남는다 
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