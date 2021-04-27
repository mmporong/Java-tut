package dfs;

import java.util.*;

public class Stack1 {
	static final int Max_N = 5;
	static int N, E;
	static int Graph[][] = new int[Max_N][Max_N];

	static void dfs(int node) {
		boolean[] visited = new boolean[Max_N];

		Stack<Integer> mystack = new Stack<>();
		mystack.push(node);

		while (!mystack.empty()) {
			int curr = mystack.pop();

			if (visited[curr])
				continue;

			visited[curr] = true;
			System.out.println(curr + " ");

			for (int next = 0; next < N; next++) {
				if (!visited[next] && Graph[curr][next] != 0) {
					mystack.push(next);
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
		dfs(0);

	}

}
