
public class Miasto {
	private String nazwa;
	private String kraj;
	private int liczbaMieszkancow;
	public Miasto(String nazwa, String kraj, int liczbaMieszkancow) {
		super();
		this.nazwa = nazwa;
		this.kraj = kraj;
		this.liczbaMieszkancow = liczbaMieszkancow;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getKraj() {
		return kraj;
	}
	public void setKraj(String kraj) {
		this.kraj = kraj;
	}
	public int getLiczbaMieszkancow() {
		return liczbaMieszkancow;
	}
	public void setLiczbaMieszkancow(int liczbaMieszkancow) {
		this.liczbaMieszkancow = liczbaMieszkancow;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kraj == null) ? 0 : kraj.hashCode());
		result = prime * result + liczbaMieszkancow;
		result = prime * result + ((nazwa == null) ? 0 : nazwa.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Miasto other = (Miasto) obj;
		if (kraj == null) {
			if (other.kraj != null)
				return false;
		} else if (!kraj.equals(other.kraj))
			return false;
		if (liczbaMieszkancow != other.liczbaMieszkancow)
			return false;
		if (nazwa == null) {
			if (other.nazwa != null)
				return false;
		} else if (!nazwa.equals(other.nazwa))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Miasto [nazwa=" + nazwa + ", kraj=" + kraj + ", liczbaMieszkancow=" + liczbaMieszkancow + "]";
	}
	
	
}
