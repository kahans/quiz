package com.zeroday.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest {
	static String fileName = "test.txt";
	static FileInputStream fis = null;
	//text.txt 내용중 문자열 135의 출력값은 15이다.
	//do while문에서 do에서 파일을 읽어온다. 출력하면 15가 나온다
	//while에서는 읽지 못한 3은 출력되지 않는다.
	public static void main(String[] args) {
	  try {
	   fis=new FileInputStream(fileName);
	   do{
	    System.out.print((char)fis.read());
	   }while(fis.read() != -1);
	  } catch (FileNotFoundException e){
	   System.out.println("FileNotFoundException 발생");
	  } catch (IOException e) {
	   System.out.println("IOException 발생");
	  } finally{
	   try {
	    fis.close();
	   } catch (IOException e) {
	    System.out.println("file.close():예외발생");
	   }
	  }
	 }


}
