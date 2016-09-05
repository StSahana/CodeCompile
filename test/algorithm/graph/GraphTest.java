package algorithm.graph;

import java.util.Arrays;

import org.junit.Test;

import algorithm.map.Dijkstra;
import algorithm.map.Floyd;

public class GraphTest {
	int MAX=0xFFFF;
	int graph[][] = {
			{MAX,7,MAX,MAX,MAX,MAX,MAX,MAX},
			{MAX,MAX,MAX,MAX,MAX,9,MAX,MAX},
			{MAX,4,MAX,MAX,MAX,MAX,1,MAX},
			{MAX,MAX,MAX,MAX,MAX,5,MAX,6},
			{MAX,MAX,MAX,MAX,MAX,MAX,4,MAX},
			{MAX,9,MAX,MAX,MAX,MAX,MAX,MAX},
			{MAX,MAX,8,MAX,MAX,MAX,MAX,MAX},
			{MAX,MAX,MAX,MAX,MAX,8,MAX,MAX}	
	};

	@Test
	public void testFloyd() {
		
		Floyd floyd=new Floyd();
		floyd.path(graph);
		System.out.println(Arrays.deepToString(floyd.path));
		System.out.println(Arrays.deepToString(floyd.distance));
		System.out.println(floyd.findPath(4,5));
		//floyd.printPath();

	}

	@Test
	public void testDijkstra(){
		Dijkstra dijkstra=new Dijkstra();
		dijkstra.path(graph,4);
		System.out.println(Arrays.toString(dijkstra.distance));
		System.out.println(Arrays.toString(dijkstra.pre));
		
	}
	
}
