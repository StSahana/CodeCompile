package algorithm.idea;

/**
 * 比赛赛程安排,分治法
 * 
 * @author Administrator
 *
 */
public class Assign {
	int[][] a;

	public Assign(int MAX) {
		a = new int[MAX + 1][MAX + 1];// 参赛人数
	}

	public void assign(int k, int n) {// 处理编号k开始的n个选手的日程
		int i, j;
		if (n == 2) {
			a[k][1] = k; // 参赛选手编号
			a[k][2] = k + 1; // 对阵选手编号
			a[k + 1][1] = k + 1; // 参赛选手编号
			a[k + 1][2] = k; // 对阵选手编号
		} else {
			assign(k, n / 2);
			assign(k + n / 2, n / 2);
			for (i = k; i < k + n / 2; i++) // 填充右上角
			{
				for (j = n / 2 + 1; j <= n; j++) {
					a[i][j] = a[i + n / 2][j - n / 2];
				}
			}
			for (i = k + n / 2; i < k + n; i++) // 填充左下角
			{
				for (j = n / 2 + 1; j <= n; j++) {
					a[i][j] = a[i - n / 2][j - n / 2];
				}
			}
		}
	}

}
