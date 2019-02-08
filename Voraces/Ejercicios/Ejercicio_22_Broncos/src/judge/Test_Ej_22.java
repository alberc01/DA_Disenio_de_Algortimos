package judge;

public class Test_Ej_22 extends JudgeSolver {
	public Test_Ej_22() {
		super(SENTINEL,"case.txt");
	}
	@Override
	public boolean caseSolver() {
		try {
			Broncos m= new Broncos();
			System.out.println(m.lectura(sc));
			return false;
		}
		catch(Exception e) {
			return true;
		}
	}
	public static void main(String[] args) {
		JudgeSolver mitest = new Test_Ej_22();
		mitest.run();
	}

}
