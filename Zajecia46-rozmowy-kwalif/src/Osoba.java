
public  class Osoba {
	
	private int wiek;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + wiek;
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
		Osoba other = (Osoba) obj;
		if (wiek != other.wiek)
			return false;
		return true;
	}

	public String getImie() {
		return "Rafal";
	}
	
	
}
