package iostreams;

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
		File inputFile = new File("C:\\Users\\DELL\\Desktop\\code\\source.txt");
		File outputFile = new File("C:\\Users\\DELL\\Desktop\\code\\target.txt");
		FileReader in = new FileReader(inputFile);
		BufferedReader reader = new BufferedReader(in);
		FileWriter out = new FileWriter(outputFile,true);
		BufferedWriter writer = new BufferedWriter(out);
		Map<String,Integer> record = new HashMap<String,Integer>();
		
		String line = reader.readLine();
		while(line!=null){
			System.out.println("Processing line:"+line);
			if(!(line.trim().equals(""))){
				String[] words = line.split(" ");
			
				for(String word:words){
					if(word==null || word.trim().equals("")){
						continue;
					}
					
					String processed = word.toLowerCase();
					
					if(record.containsKey(processed)){
						record.put(processed,record.get(processed)+1);
					}
					else{
						record.put(processed,1);
					}
				}
			}
			
			line = reader.readLine();
		}
		System.out.println(record);
		
		
		Iterator<Entry<String, Integer>> it = record.entrySet().iterator(); 

		while (it.hasNext() ) { 
		Map.Entry<String, Integer> pairs = it.next(); 
		System.out.println("Value is " + pairs.getValue()); 

		out.write(pairs.getValue() + "\n"); 

		} 
	
	    
 	}

}
