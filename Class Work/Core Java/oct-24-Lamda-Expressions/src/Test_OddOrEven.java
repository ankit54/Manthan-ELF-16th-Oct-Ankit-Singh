import java.util.ArrayList;
import java.util.function.Predicate;

public class Test_OddOrEven {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(15);
		al.add(8);
		al.add(14);
		al.add(7);
		
		Predicate<Integer> fn=i->i%2!=0;
		
//		Predicate<Integer> fn=s->{
//			if(s%2==0) {
//				return true;
//			}else {
//				return false;
//			}
//		};
		boolean result=fn.test(al.get(0));
		System.out.println(result);
	}

}
