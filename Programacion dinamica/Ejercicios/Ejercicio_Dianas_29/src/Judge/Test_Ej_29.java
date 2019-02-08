package Judge;

public class Test_Ej_29 extends JudgeSolver {
	public Test_Ej_29() {
		super(SENTINEL);
	}

	@Override
	public boolean caseSolver() {
		try {
			Diana d= new Diana();
			d.read(sc);
			return false;
		}
		catch(Exception e) {
			return true;
		}
	}
	public static void main(String[] args)  {
		JudgeSolver miTest = new Test_Ej_29();
		miTest.run();
	}

}
