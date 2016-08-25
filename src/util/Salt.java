package test;

import java.util.Random;


public class Salt {
	
	public String genSalt(int len){
		String string="0123456789abcdefghijklmnopqrstuvwxyz 0123456"
				+ "789ABCDEFGHIJKLMNOPQRSTUVWXYZ.¡¢£»¡££¬¡¢£»£º£¿£¡¡­¨D¡¥¡¦¡¨¡®"
				+ "¡¡'¡°¡±¡©¡«¡¬¡Ã£¢£§£à£ü¡²¡³¡´¡µ¡¶¡·¡¸¡¹¡º¡»£®¡¼¡½¡¾¡¿£¨)£Û£Ý£û£ý¡°¡±¡¯¡®©°©±©²©³"
				+ "©´©µ©¶©·©¤©¨©¬©À©Á©Â©Ã©Ä©Å©Æ©Ç©¦©ª©®©Ð©Ñ©Ò©Ó©Ô©Õ©Ö©×©à©á©â©ã©ä©æ©å©ç¦¦¦§¦©¦ª¦«¦¬¦­"
				+ "¦®¦¯¦°¦±¦²¦³¦´¦µ¦¶¦·¦¸¦Á¦Â¦Ã¦Ä¦Å¦Æ¦Ç¦È¦É¦Ê¦Ë¦Ì¦Í¦Î¦Ï¦Ð¦Ñ¦Ò¦Ó¦Ô¦Õ¦Ð¦×¦Ø";
		Random random=new Random();
		char[] o=new char[len];
		for (int i = 0; i < len; i++) {
			o[i]=string.charAt(random.nextInt(206));
		}
		return String.valueOf(o);
	}
	
	
	
}
