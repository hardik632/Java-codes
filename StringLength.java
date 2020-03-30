
public class StringLength {

	public static void main(String[] args) {
		
		String s="welcome to java world";
		String s1=" HARDIK DHIMAN";
		System.out.println(s.length());
		System.out.println(s.compareTo("welcome to java world"));
		System.out.println(s.substring(2,20));
		System.out.println(s.substring(3));
		System.out.println(s.charAt(19));
		System.out.println(s.equals("welcome To java world"));
		System.out.println(s.equalsIgnoreCase("welcome To java world"));
		System.out.println(s.concat(" lets start............"));
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf('e',5));
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s.replace('w', 'W'));
	}

}
