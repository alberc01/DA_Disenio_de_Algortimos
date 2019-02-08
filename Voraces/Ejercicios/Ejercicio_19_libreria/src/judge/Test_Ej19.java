package judge;

public class Test_Ej19 extends JudgeSolver{
	public Test_Ej19() {
		super(SENTINEL);
	}

	@Override

	public boolean caseSolver() {
		try {
		Compra c=new Compra();
	 	c.readlist(sc);
	 	return false;
		}
		catch(Exception e) {
			return true;
		}
	}

	public static void main(String[] args) {

		JudgeSolver miTest = new Test_Ej19();
		miTest.run();
	}
}
