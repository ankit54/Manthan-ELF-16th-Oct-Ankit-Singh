import java.util.ArrayList;
import java.util.Iterator;

public class Progm_GenericIterator {

	public static void main(String[] args) {
		ArrayList<Double> al=new ArrayList<Double>();
		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);

		Iterator<Double> i=al.iterator();
		while (i.hasNext()) {
			Double num = (Double) i.next();
			System.out.println(num);

		}
	}

}
