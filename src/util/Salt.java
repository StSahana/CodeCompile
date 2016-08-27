package util;

import java.util.Random;


public class Salt {
	
	public String genSalt(int len){
		String string="0123456789abcdefghijklmnopqrstuvwxyz 0123456"
				+ "789ABCDEFGHIJKLMNOPQRSTUVWXYZ.、；。，、；：？！…―ˉˇ〃‘"
				+ "　'“”々～‖∶＂＇｀｜〔〕〈〉《》「」『』．〖〗【】（)［］｛｝“”’‘┌┍┎┏"
				+ "┐┑┒┓─┄┈├┝┞┟┠┡┢┣│┆┊┬┭┮┯┰┱┲┳┼┽┾┿╀╂╁╃ΖΗΙΚΛΜΝ"
				+ "ΞΟΠΡΣΤΥΦΧΨΩαβγδεζηθικλμνξοπρστυφπψω";
		Random random=new Random();
		char[] o=new char[len];
		for (int i = 0; i < len; i++) {
			o[i]=string.charAt(random.nextInt(206));
		}
		return String.valueOf(o);
	}
	
	
	
}