import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;
import java.util.Map.Entry;

public class FileIO {
	public static void main(String[] args) throws IOException{
		File inputFile = new File("E:\\java\\workspace\\java\\iostreams\\source.txt");
		File outputFile = new File("E:\\java\\workspace\\java\\iostreams\\target.txt");
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		Map<String,Integer> record = new HashMap<String,Integer>();
		int i;
		String line="";
		while ((i=in.read()) !=-1) {
		     line += (char)i;
		}
		    String[] words = line.split(" ");

		    
		    for (String word : words) {
		        if (!record.containsKey(word)) {
		            record.put(word, 1);
		        }
		        else {
		            record.put(word, record.get(word) + 1);
		        }
		    }
		
		for(Map.Entry<String, Integer> entry : record.entrySet()){
			out.write(entry.getKey()+" : "+ entry.getValue());
		}

	    
 	}

}

