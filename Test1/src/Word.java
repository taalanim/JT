
public class Word {
	private String jap;
	private String eng;

	public Word(String s) {
		int spaceIndex = s.indexOf(" ");
		jap = s.substring(0, spaceIndex);
		eng = s.substring(spaceIndex);
	}

	public String GetJap() {
		return jap;
	}

	public String GetEng() {
		return eng;
	}

}
