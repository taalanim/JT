
public class Word {
	private String jap;
	private String eng;

	public Word(String s) {
		System.out.println("building word with "+s);
		int spaceIndex = s.indexOf(" ");
		jap = s.substring(0, spaceIndex);
		eng = s.substring(spaceIndex + 1);
	}

	public String GetJap() {
		return jap;
	}

	public String GetEng() {
		return eng;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder(jap+" ");
		sb.append(eng);
		return sb.toString();
	}

}
