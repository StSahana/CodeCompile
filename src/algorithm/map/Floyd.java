package algorithm.map;

/**
 * O(n^3) 多源最短路径
 * 
 * @author Administrator
 *
 */
public class Floyd {
	public int[][] distance;// 最短路径矩阵
	public int[][] path;// 前驱节点
	int MAX = 0xFFFF;

	public void path(int[][] graph) {
		int n = graph[0].length;
		distance = graph;
		path = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (distance[i][j] == MAX) {
					path[i][j] = -1;
				} else {
					path[i][j] = i;
				}
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (distance[i][j] > distance[i][k] + distance[k][j]) {
						distance[i][j] = distance[i][k] + distance[k][j];
						path[i][j] = path[k][j];
					}
				}
			}
		}
	}

	public String findPath(int start, int end) {
		if (path[start][end] == -1) {
			return "无路可走";
		} else if (start == path[start][end]) {
			return start + "=>" + end;
		} else {
			return findPath(start, path[start][end])+"=>"+end;
		}
	}
	
	public void printPath(){
		for (int i = 0; i < distance.length; i++) {
			for (int j = 0; j < distance.length; j++) {
				System.out.println(i+" to "+j+":    "+findPath(i, j));
			}
		}
	}
}
