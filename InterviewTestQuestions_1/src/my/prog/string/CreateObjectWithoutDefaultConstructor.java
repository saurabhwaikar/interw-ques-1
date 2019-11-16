package my.prog.string;

public class CreateObjectWithoutDefaultConstructor {
	
	private int a;
	
	// removing argument of below constructor will run the program correctly
	public CreateObjectWithoutDefaultConstructor(int a) {
		this.a = a;
	}
	
	public void getValue() {
		System.out.println(" A : " + this.a);
	}

	public static void main(String[] args) {
		try {
			Class myCls = Class.forName("my.string.prog.CreateObjectWithoutDefaultConstructor");
			CreateObjectWithoutDefaultConstructor objWOConst = (CreateObjectWithoutDefaultConstructor) myCls.newInstance();
			objWOConst.getValue();
		} catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch(IllegalAccessException iae) {
			iae.printStackTrace();
		} catch(InstantiationException ie) {
			ie.printStackTrace();
		}
		
	}

}
