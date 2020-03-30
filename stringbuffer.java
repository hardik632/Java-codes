
public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s=new StringBuffer("java code");
		System.out.println(s.reverse());
		StringBuffer s1=new StringBuffer("this is my java code");
		System.out.println(s1.insert(11,"first "));
		StringBuffer s2=new StringBuffer("java is easy");
		System.out.println(s2.append(" to learn"));
		StringBuffer s3=new StringBuffer("This is my code");
		System.out.println(s3.replace(8, 10, "java"));
		StringBuffer s4=new StringBuffer("java");
		System.out.println(s4.deleteCharAt(3));
		StringBuffer s5=new StringBuffer("java is easy to learn");
		s5.delete(8, 13);
		System.out.println(s5);
		StringBuffer s6=new StringBuffer("java");
		String str=s6.toString();
		System.out.println(str);
		System.out.println(str.concat(" code"));
	}

}
