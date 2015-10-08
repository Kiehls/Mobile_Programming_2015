package kr.ac.embedded.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
   public static void main(String[] args)
   {
       String path = AddLineNumber.class.getResource("").getPath();
       System.out.println(path);

      try
      {
         BufferedReader inputStream = 
               new BufferedReader(new FileReader("C:\\original.txt"));
         PrintWriter outputStream = 
               new PrintWriter(new FileOutputStream( "C:\\numbered.txt"));
        String data = null;
        int i = 1;
         while((data = inputStream.readLine()) != null) {
        	 outputStream.write(i + data);
        	 outputStream.println();
        	 i++;
         }
         inputStream.close();
         outputStream.close();
      }
      catch (FileNotFoundException e) {
    	  e.printStackTrace();
      }
      catch (IOException e) {
    	  e.printStackTrace();
      }

   }
}