package Ejercicio_28;

public class Test_Ej_28 extends JudgeSolver {
	public Test_Ej_28() {
		super(SENTINEL);
	}

	@Override
	public boolean caseSolver() {
		try {
			ListaTesoros list= new ListaTesoros();
			list.read(sc);
			return false;
		}
		catch(Exception e) {
			return true;
		}
	}
	public static void main(String[] args)  {
		JudgeSolver miTest = new Test_Ej_28();
		miTest.run();
	}

}
