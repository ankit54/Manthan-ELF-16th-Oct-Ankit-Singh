import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test_Consumer {

	public static void main(String[] args) {
		Student s1=new Student(1,"Ankit",35.0);
		Consumer<Student> c= s -> {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.percent);
	};
	c.accept(s1);
}
}