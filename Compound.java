package begain;

public class Compound {
	public static void main(String[] args) {
		int x = 20;
		{
			int y = 40;
			System.out.println(y);
			int z = 245;
			boolean b;
			{
				b = y > 4;
				System.out.println(b);
				
			}
		}
		String word = "hello world";
		System.out.println(word);
	}

}
