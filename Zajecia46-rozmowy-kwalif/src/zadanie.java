
public class zadanie {
	public static void main(String[] args) {
		Osoba os1 = new Osoba() {
			@Override
			public String getImie() {
				return "xxx";
			}
		};
		System.out.println(os1.getImie());
	}
}
