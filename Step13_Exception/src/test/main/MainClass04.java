package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *		현재 존재하거나 존재하지 않는 파일이나 상관없이
		 *		폴더를 제어할수 있는 File 객체를 생성하여
		 *		참조값을 f 라는 지역변수에 담기
		 *
		 */
		File f=new File("C:\\acorn202210\\myFolder\\memo.txt");
			
		try {
			if(!f.exists()) {
				f.createNewFile();
			}else {
				f.delete();
			}
		}catch (IOException e) {
				e.printStackTrace();
			}
			
		// 실제 memo.txt 파일이 존재하지 않으면 파일을 만들고
		// 존재하면 memo.txt 파일을 삭제하도록 프로그래밍 해보세요.
	}
}
