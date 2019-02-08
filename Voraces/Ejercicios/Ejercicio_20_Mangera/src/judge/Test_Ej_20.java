package judge;

public class Test_Ej_20 extends JudgeSolver {
	public Test_Ej_20() {
		super(SENTINEL,"case.txt");
	}
	@Override
	public boolean caseSolver() {
		try {
			Manguera m= new Manguera();
			System.out.println(m.lectura(sc));
			return false;
		}
		catch(Exception e) {
			return true;
		}
	}
	public static void main(String[] args) {
		JudgeSolver mitest = new Test_Ej_20();
		mitest.run();
	}

}
