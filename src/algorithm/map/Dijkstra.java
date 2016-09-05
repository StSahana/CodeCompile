package algorithm.map;

public class Dijkstra {
	public int[] distance;
	public int[] pre;
	int MAX=0xFFFF;
	
	public void path(int [][] graph,int start){
		//接受一个有向图的权重矩阵，和一个起点编号start（从0编号，顶点存在数组中）     
		int  n=graph.length;
		boolean[] visited = new boolean[n];
		distance = graph[start];  //保存start到其他各点的最短路径 
		pre=new int[n];//前驱
		//init
		for (int i = 0; i < n; i++) {
			visited[i]=false;
			if(graph[start][i]==MAX){
				pre[i]=-1;
			}else{
				pre[i]=start;
			}
		}
//		//初始化，第一个顶点已经求出   
//		visited[start] = true; 
//		distance[start]=0;
//		
		
		for (int i = 1; i<n; i++) {//逐步加入剩下的n-1个顶点
			int min=MAX;
			int k=start;
			for(int j=0;j<n;j++){
				if(!visited[j]&&distance[j]<min){
					min=graph[start][j];
					k=j;
				}
			}
			visited[k]=true;
			
			// 修正当前最短路径和前驱顶点
	        // 即，当已经"顶点k的最短路径"之后，更新"未获取最短路径的顶点的最短路径和前驱顶点"。
	        for (int m = 0; m < n; m++) {
	           if(!visited[m]&&graph[k][m]<MAX){
	        	   if(distance[m]>distance[k]+graph[k][m]){
	        		   distance[m]=distance[k]+graph[k][m];
	        		   pre[m]=k;
	        	   }
	           }
	        }	
			
		}
	}
}
