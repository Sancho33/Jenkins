package ParsingTropCool;

public class Singleton {

	private Singleton() {
	}
		
		private static Singleton INSTANCE = null ;
		public static Singleton getInstance()
		{
			if(INSTANCE == null)
			{
				INSTANCE = new Singleton();
			}
			return INSTANCE;
		}
	
	public static void main(String[] args) {
		// TODO auto-generated method stub
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s);
		System.out.println(s2);
	}
}