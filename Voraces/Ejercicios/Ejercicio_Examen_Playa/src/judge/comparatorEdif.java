package judge;

import java.util.Comparator;

public class comparatorEdif implements Comparator<Edificios> {
	@Override
	public int compare(Edificios e1, Edificios e2) {
		// TODO Auto-generated method stub
		return (e2.getFin()-e1.getFin());
	}
}
