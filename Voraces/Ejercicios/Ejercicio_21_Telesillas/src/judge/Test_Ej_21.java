package judge;

public class Test_Ej_21 extends JudgeSolver {
	public Test_Ej_21() {
		super(SENTINEL);
	}
	@Override
	public boolean caseSolver() {
		try {
			ColaSillas m= new ColaSillas();
			System.out.println(m.lectura(sc));
			return false;
		}
		catch(Exception e) {
			return true;
		}
	}
	public static void main(String[] args) {
		JudgeSolver mitest = new Test_Ej_21();
		mitest.run();
	}

}
