package com.zeroday.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest {
	static String fileName = "test.txt";
	static FileInputStream fis = null;
	//text.txt ������ ���ڿ� 135�� ��°��� 15�̴�.
	//do while������ do���� ������ �о�´�. ����ϸ� 15�� ���´�
	//while������ ���� ���� 3�� ��µ��� �ʴ´�.
	public static void main(String[] args) {
	  try {
	   fis=new FileInputStream(fileName);
	   do{
	    System.out.print((char)fis.read());
	   }while(fis.read() != -1);
	  } catch (FileNotFoundException e){
	   System.out.println("FileNotFoundException �߻�");
	  } catch (IOException e) {
	   System.out.println("IOException �߻�");
	  } finally{
	   try {
	    fis.close();
	   } catch (IOException e) {
	    System.out.println("file.close():���ܹ߻�");
	   }
	  }
	 }


}
