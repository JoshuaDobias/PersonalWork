package stringWork;

public class EssayTest {

	public static void main(String[] args) {
		Essay a=new Essay();
		a.setAuthor();
		System.out.println(a.getAuthor());
		System.out.println(a.getCharAuthor());
		a.setText();
		System.out.println(a.predicate());
	}

}
