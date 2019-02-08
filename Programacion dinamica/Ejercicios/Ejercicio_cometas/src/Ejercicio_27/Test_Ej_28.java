package Ejercicio_27;

public class Test_Ej_28 extends JudgeSolver {
	public Test_Ej_28() {
		super(SENTINEL);
	}

	@Override
	public boolean caseSolver() {
		try {
			ListaCometas list= new ListaCometas();
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
