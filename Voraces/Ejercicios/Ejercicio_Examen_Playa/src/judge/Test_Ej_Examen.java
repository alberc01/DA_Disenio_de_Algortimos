package judge;

public class Test_Ej_Examen extends JudgeSolver {
	public Test_Ej_Examen() {
		super(SENTINEL,"case.txt");
	}
	@Override
	public boolean caseSolver() {
		try {
			Playa m= new Playa();
			System.out.println(m.lectura(sc));
			return false;
		}
		catch(Exception e) {
			return true;
		}
	}
	public static void main(String[] args) {
		JudgeSolver mitest = new Test_Ej_Examen();
		mitest.run();
	}

}
