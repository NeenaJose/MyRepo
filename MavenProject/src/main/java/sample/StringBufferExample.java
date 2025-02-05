package sample;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		//StringBuilder sb1=new StringBuilder("Hai");
		//System.out.println("sb1");
		
		//Append
		sb.append("World");
		System.out.println(sb);
		
		//Insert
		sb.insert(5, "My");
		System.out.println(sb);
		
		//replace
		sb.replace(5, 7, "New");
		System.out.println(sb);

		//reverse
		sb.reverse();
		System.out.println(sb);
		
		//delete
		sb.delete(5, 8);
		System.out.println(sb);
	}
	

}
