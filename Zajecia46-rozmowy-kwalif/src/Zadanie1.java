import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Zadanie1 {
	public static void main(String[] args) throws IOException {
		Set<String> imiona = new HashSet<>(Arrays.asList("Jan","Ban","Sram","Jan","Ban"));
		System.out.println(imiona);
		
		Set<Osoba> osoby = new HashSet<>(Arrays.asList(new Osoba("Jan", 20), new Osoba("Jan", 20), new Osoba("Jan", 30)));
		
		Osoba tajna = new Osoba("Waldek", 31);
		osoby.add(tajna);
		
		System.out.println(osoby);
		
		Osoba tajnaZmieoniona =tajna.setWiek(32);
		
		System.out.println(osoby);
		
		System.out.println(osoby.contains(new Osoba("Waldek", 31)));
		
		//Stworz klase Miasto (nazwe, kraj, liczba mieszkancow)
		//stworz liste miast a nastepnie:
		// wypisz sume liczby mieszkancow
		//wypisz ile jest roznych krajow (posrotuj je alfabetycznie)
		
		
		//* dla kazdego kraju stworz plik o nazwe [KRAJ].txt i w nim zapisz wszystkie miasta z danego kraju
		Miasto m1 = new Miasto("Poznan", "Polska", 24900);
		Miasto m2 = new Miasto("Warszawa", "Polska", 34900);
		Miasto m3 = new Miasto("Berlin", "Niemcy", 50000);
		Miasto m4 = new Miasto("Dortmund", "Niemcy", 203573);
		Miasto m5 = new Miasto("Mediolan", "Wlochy", 48382);
		Miasto m6 = new Miasto("Rzym", "Wlochy", 131312);
		
		List<Miasto> miasta = Arrays.asList(m1, m2, m3, m4, m5, m6);
		
		long sumaMieszkancow = miasta.stream().collect(Collectors.summingInt(Miasto::getLiczbaMieszkancow));
		
		System.out.println("Laczna suma mieszkancow: "+sumaMieszkancow);
		List<String> kraje = miasta.stream().map(Miasto::getKraj).distinct().collect(Collectors.toList());
		kraje.sort(null);
		System.out.println(kraje);
		for(String kraj : kraje) {
			//kraj = Polska
			FileWriter fw = new FileWriter(kraj+".txt");
			for(Miasto m : miasta) {
				if(m.getKraj().equals(kraj)) {
					fw.write(m.getNazwa());
					
					fw.write("\n");
				}
			}
			long sumaWkraju = miasta.stream().filter(m -> m.getKraj().equals(kraj)).collect(Collectors.summingInt(Miasto::getLiczbaMieszkancow));
			fw.write(String.valueOf(sumaWkraju));
			fw.close();
		}
		
	}
	
	public static final class Osoba {
		private final String imie;
		private final int wiek;
		public Osoba(String imie, int wiek) {
			super();
			this.imie = imie;
			this.wiek = wiek;
		}
		public String getImie() {
			return imie;
		}
		public Osoba setImie(String imie) {
			return new Osoba(imie, this.wiek);
		}
		public int getWiek() {
			return wiek;
		}
		public Osoba setWiek(int wiek) {
			return new Osoba(this.imie, wiek);
		}
		@Override
		public String toString() {
			return "Osoba [imie=" + imie + ", wiek=" + wiek + "]";
		}
		@Override
		public int hashCode() {
			return 1;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Osoba other = (Osoba) obj;
			if (imie == null) {
				if (other.imie != null)
					return false;
			} else if (!imie.equals(other.imie))
				return false;
			if (wiek != other.wiek)
				return false;
			return true;
		}
		
		
		
		
	}
}
