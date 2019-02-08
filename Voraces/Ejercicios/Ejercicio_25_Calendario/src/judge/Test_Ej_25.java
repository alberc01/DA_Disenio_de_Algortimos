package judge;

public class Test_Ej_25 extends JudgeSolver {
	public Test_Ej_25() {
		super(SENTINEL);
//		,"case.txt"
	}
	@Override
	public boolean caseSolver() {
		try {
			Calendarios m= new Calendarios();
			m.lectura(sc);
			return false;
		}
		catch(Exception e) {
			return true;
		}
	}
	public static void main(String[] args) {
		JudgeSolver mitest = new Test_Ej_25();
		mitest.run();
	}

}
