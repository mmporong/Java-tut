package dfs;

import java.util.Scanner;

public class dfs2 {
	static final int Max_N = 5;
	static int N, E;
	static int[][] Graph = new int[Max_N][Max_N];
	static boolean[] Visited = new boolean[Max_N];

	static void dfs(int node) {
		Visited[node] = true;
		System.out.println(node + " ");
		
		for(int next = 0; next < N; next++) {
			if(!Visited[next] && Graph[node][next] != 0) {
				dfs(next);
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
