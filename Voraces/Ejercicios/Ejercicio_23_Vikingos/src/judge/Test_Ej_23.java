package judge;

public class Test_Ej_23 extends JudgeSolver {
	public Test_Ej_23() {
		super(SENTINEL,"case.txt");
	}
	@Override
	public boolean caseSolver() {
		try {
			Vikingos m= new Vikingos();
			System.out.println(m.lectura(sc));
			return false;
		}
		catch(Exception e) {
			return true;
		}
	}
	public static void main(String[] args) {
		JudgeSolver mitest = new Test_Ej_23();
		mitest.run();
	}

}
