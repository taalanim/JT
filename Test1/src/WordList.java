import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;

public class WordList {
	private ArrayList<Word> list= new ArrayList<Word>() ;
	private String adress;
	private String name;

	public WordList(String fileName) {
		this.name = fileName.replaceAll(".txt", "");
		StringBuilder sb = new StringBuilder("./files/");
		sb.append(fileName);
		this.adress = sb.toString();
		loadFile();
	}

	public void loadFile() {
		try (BufferedReader br = new BufferedReader(new FileReader(adress))) {
			String currentLine;
			while((currentLine = br.readLine()) != null) {
				list.add(new Word(currentLine));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void MergeLists(WordList wl2) {
	}

	public String toSting() {
		StringBuilder sb = new StringBuilder("----------" + name + "----------\n");
		
		for (Word w : list) {
			sb.append(w.toString() + "\n");
		}
		return sb.toString();
	}

}
