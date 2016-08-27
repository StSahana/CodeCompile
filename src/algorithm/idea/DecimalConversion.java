package algorithm.idea;

/**
 * 进制转换,递归实现
 * @author Administrator
 *
 */
public class DecimalConversion {
	/**
	 * 十进制转换成其他进制
	 * @param m 原数据
	 * @param n 进制数
	 * @return
	 */
	public String decToOther(int m,int n){
		if(m/n==0){
			return m+"";
		}else{
			return decToOther(m/n, n)+""+m%n;
		}
	}
}
