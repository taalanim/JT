import java.io.File;
import java.util.ArrayList;

public class Hub {
	private ArrayList<WordList> lists = new ArrayList<WordList>();
	
	public Hub() {
	LoadFiles();	
	PrintOnScreen();
	}
	
	
	public void PrintOnScreen(){
		for(WordList wl : lists){
			System.out.println(wl.toSting());
		}
		
	}
	
	
	private void LoadFiles() {
		
		File dir = new File("./files");
		File[] fileNameList = dir.listFiles();

		if (fileNameList != null)
			for (File fil : fileNameList) {
				
				lists.add(new WordList(fil.getName()));
				
			}
	}

}
