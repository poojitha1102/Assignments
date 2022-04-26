package program.jav.test;
import java.io.File;
import java.util.*;


public class Project_Phase1 {
		public static void main(String args[]){
			String folderPath="D:\\RK PRINT AND PACK";
			File folder=new File(folderPath);
			File[] files=folder.listFiles();
			for(File file:files){
				if(file.isFile()){
				System.out.println("File-->"+file.getName());
			}else
				if(file.isDirectory()){
					System.out.println("Folder"+file.getName());
				}
			
		}
}
}