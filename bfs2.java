package bfs;

import java.util.*;

public class bfs2 {
	static final int Max_N = 5;
	static int N, E;
	static int[][] Graph = new int[Max_N][Max_N];

	static void bfs(int node) {
		boolean[] visited = new boolean[Max_N];

		Queue<Integer> myqueue = new LinkedList<>();
		visited[node] = true;
		myqueue.add(node);

		while (!myqueue.isEmpty()) {
			int curr = myqueue.remove();

			System.out.println(curr + " ");

			for (int next = 0; next < N; next++) {
				if (!visited[next] && Graph[curr][next] != 0) {
					visited[next] = true;
					myqueue.add(next);
				}
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		E = sc.nextInt();

		for (int i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			Graph[u][v] = Graph[v][u] = 1;
		}
		sc.close();
		bfs(0);

	}

}
