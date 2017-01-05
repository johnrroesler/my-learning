package src.Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Z001W4M on 1/4/2017.
 */
public class FileCabinet implements IDataStore {

    private ArrayList<String> files = new ArrayList<String>();

    @Override
    public void storeValues(List<String> values) {
        for(String i:values){
            this.files.add(i);
        }
        System.out.println("Stored files in cabinet");
    }

    @Override
    public ArrayList<String> returnValues() {
        System.out.println("Returning cabinet of files");
        return this.files;
    }

    @Override
    public String toString() {
        String listOfFiles = "";
        for (int i = 0; i < this.files.size(); i++){
            String file = this.files.get(i);
            listOfFiles += file;
            System.out.println("File #" + (i+1) + ": " + file);
            if (i != this.files.size()-1){
                listOfFiles += ", ";
            }
        }
        return listOfFiles;
    }
}
