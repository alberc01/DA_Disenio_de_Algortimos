package judge;

import java.util.Comparator;

public class ComparatorCalendarios implements Comparator<Conferencias> {
	@Override
	public int compare(Conferencias e1, Conferencias e2) {
		// TODO Auto-generated method stub
		return (int) (e1.getInicio()-e2.getInicio());
	}
}
