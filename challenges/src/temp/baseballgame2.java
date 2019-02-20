package temp;
import java.util.Scanner;

public class baseballgame2 {

	// 숫자 야규게임


	public static void main (String arg[]) throws Exception{

		// 숫자 야구 게임


		int[] baseball = new int[3];

		for(int i = 0; i < baseball.length; i++){
			baseball[i] =(int)((Math.random() * 9)+1);
			for(int l = 0; l < i; l++){
				if(baseball[i] == baseball[l]){
					i--;
					break;
				}
			}
		}

		System.out.println("랜덤 숫자 생성 : "+baseball[0]+","+baseball[1]+","+baseball[2]);

		int ball = 0;
		int strike = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		while(!flag){


		int[] input = new int[3];
		System.out.println("0 ~ 9 숫자 입력하세요(중복불가)");

			for(int n = 0; n < input.length; n++){
				input[n] = sc.nextInt();
				if(input[n] < 0 || input[n] > 9){
					System.out.println("0 ~ 9 숫자 입력하세요.");
					n--;
					continue;
				}
				for(int m = 0; m < n; m++){
					if(input[n] == input[m]){
						System.err.println("중복 불가");
						n--;
						break;
					}
				}
			}
		System.out.println("입력한 숫자 :"+input[0]+","+input[1]+","+input[2]);

			for(int i=0; i<baseball.length; i++){
				for(int l=0; l<input.length; l++){
					if(baseball[i]==input[l]){
						if(i==l){
							strike ++;
						}else{
							ball++;
						}
					}
				}
			}

			if(strike == 3){
				System.out.println("스트라이크!!!!!!!! 게임 끝");
				flag = true;
			}else{
				System.out.println("스트라이크 :"+strike+"|볼:"+ball);
				strike = 0;
				ball = 0;
			}

		}

		sc.close();


//		br.close();
//		in.close();
	}

	public static void inputNum(){

	}


}






