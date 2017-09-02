import java.io.File;
import java.util.ArrayList;

public class FileLoader {
private ArrayList<WordList> lists;
	public FileLoader(){
		
	}
	
	private void readDivisionFiles() {
		
		File dir = new File("./files");
		File[] fileList = dir.listFiles();

		if (fileList != null)
			for (File fil : fileList) {
				StringBuilder sb = new StringBuilder("./files/");
				sb.append(fil.getName());
				
				lists.add(new WordList(sb.toString()));
			}
	}
}
