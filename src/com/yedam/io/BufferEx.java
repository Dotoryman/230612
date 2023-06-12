package com.yedam.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferEx {
	public static void main(String[] args) {
		try {
			bufferStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
	
	
	public static void bufferStream() throws IOException {
		// 읽고 쓰는 버퍼의 성능을 향상 = 버퍼스트림
		FileInputStream fis = new FileInputStream("c:/temp/vscode.exe");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("c:/temp/copy2.exe");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		while(true) {
			int readBuf = bis.read();// 버퍼에 저장하겠다
			if(readBuf == -1) {
				break;
			}
			bos.write(readBuf);
			
		}
		bos.flush();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
	}
	
}
