package problem04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	int answer = 0;
	int matchcnt = 1;
	boolean endgame = true;
	FileWriter writer = null;
	String Filepath ="result.txt";
	
	public static void main(String[] args) {

		Main o = new Main();
		
		File file = new File(o.Filepath);
        


		
		double num = Math.random() * 1000;
		o.answer = (int) (num % 1000);

		while (o.answer < 100) {
			num = Math.random() * 1000;
			o.answer = (int) (num % 1000);
		}
		
		System.out.println("숫자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		while(o.endgame) {
			o.Judgement(sc.nextInt());
		}
		
	}
	
	public void Writer(String input) {
		  try {
	            writer = new FileWriter(Filepath, true);
	            writer.write(input);
	            writer.flush();
	        } catch(IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if(writer != null) writer.close();
	            } catch(IOException e) {
	                e.printStackTrace();
	            }
	        }
	}

	public void Judgement(int num) {
		String answer = Integer.toString(this.answer);
		String input = Integer.toString(num);
		int strike = 0;
		int ball = 0;
		int out = 0;
		
		if(input.length()!=3) {
			System.out.println("입력값이 잘못되었습니다. 3자리 숫자를 입력해주세요");
			return;
		}
		for (int i = 0; i < 3; i++) {
			if (answer.substring(i,i+1).equals(input.substring(i,i+1))) {
				strike++;				
			} else if (answer.substring(i,i+1).equals(input.substring(1,2))) {
				ball++;
			} else if (answer.substring(i,i+1).equals(input.substring(2,3))){
				ball++;
			} else {
				out++;
			}
		}
		System.out.println(matchcnt++ +" - S:"+strike+", B:"+ball+", O:"+out);
		if(strike == 3) {
			System.out.println("종료");
			this.endgame = false;
		}
	}
}