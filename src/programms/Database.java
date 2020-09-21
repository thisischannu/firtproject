package programms;

public class Database {

	public static void main(String[] args) {
		
		String str="asbdTHIWN";
		
		String s="";
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)>=65 && str.charAt(i)<=90) {
			char ss=(char) (str.charAt(i)+32);
			s+=ss;
			}
			else if(str.charAt(i)>=92&&str.charAt(i)<=122) {
				char ss=(char) (str.charAt(i)-32);
				s+=ss;
			}
		}
		System.out.println(s);
	}
}
