package test;

import java.util.Random;


public class Salt {
	
	public String genSalt(int len){
		String string="0123456789abcdefghijklmnopqrstuvwxyz 0123456"
				+ "789ABCDEFGHIJKLMNOPQRSTUVWXYZ.���������������������D��������"
				+ "��'�����������ã��������������������������������������)�ۣݣ�������������������"
				+ "�������������������©éĩũƩǩ������Щѩҩөԩթ֩ש�������禦������������"
				+ "�������������������������¦æĦŦƦǦȦɦʦ˦̦ͦΦϦЦѦҦӦԦզЦצ�";
		Random random=new Random();
		char[] o=new char[len];
		for (int i = 0; i < len; i++) {
			o[i]=string.charAt(random.nextInt(206));
		}
		return String.valueOf(o);
	}
	
	
	
}
