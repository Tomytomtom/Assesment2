/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.pkg2.pkg2d.arrys;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 *
 * This is the Class that will read and wright in a fixed file format 
 */
public class FileService {
    	static final String FILE = "SeatingData.txt";
	//will print where the file is reading and wirghting from to the user
	public void PrintDataFromFile() {
		try 
                {
			System.out.println(new String(ReadDataFromFile(FILE, 10, 15)));
		}
                catch (IOException e) 
                {
			
		}
	}
        //this wrights the data to the file in fixed length format
	public void WriteDataToFile(String file, String data, int pos) throws IOException 
        {
                // declaration of random access wrighter
		RandomAccessFile writeFile = new RandomAccessFile(file, "rw");
                // looks for this point in the file 
		writeFile.seek(pos);
                // wright to the file that has bean pointed at
		writeFile.write(data.getBytes());
                // close the wright
		writeFile.close();
	}
	 //this reads the data to the file in fixed length format
	public byte[] ReadDataFromFile(String file, int pos, int size) throws IOException {
                //declaration of random access reader
		RandomAccessFile readFile = new RandomAccessFile(file, "rw");
                // looks for this point in the file 
		readFile.seek(pos);
                //New byte arry to store data from file  
		byte[] bytesToRead = new byte[size];
                // read the file that has bean pointed at
		readFile.read(bytesToRead);
                // close the reader 
		readFile.close();
                // return a arry of bites
		return bytesToRead;
	}
}
