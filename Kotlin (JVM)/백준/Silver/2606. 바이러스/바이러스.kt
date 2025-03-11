import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()  // 컴퓨터 수
    val m = scanner.nextInt()  // 연결된 쌍의 수

    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1) { false }
    
    repeat(m) {
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        graph[a].add(b)
        graph[b].add(a)
    }
    
    println(dfs(graph, visited, 1) - 1)  // 1번 컴퓨터 제외한 감염된 수 출력
}

fun dfs(graph: Array<MutableList<Int>>, visited: BooleanArray, node: Int): Int {
    visited[node] = true
    var count = 1
    
    for (next in graph[node]) {
        if (!visited[next]) {
            count += dfs(graph, visited, next)
        }
    }
    return count
}
