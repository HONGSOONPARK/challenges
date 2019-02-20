package temp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baseballgame1 {

	// 숫자 야규게임

	public static void main (String arg[]) throws Exception{


		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		// 숫자 야구 게임

		System.out.println("3자리 수 입력하세요");

		int num = 0;


		System.out.println("랜덤 숫자 생성");

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

		System.out.println(baseball[0]+","+baseball[1]+","+baseball[2]);

		int ball = 0;
		int strike = 0;


		boolean flag = false;

		do{
			while(!flag){
				num = Integer.parseInt(br.readLine());

				System.out.println(num % 10);   // 1자리
				System.out.println(num / 10 % 10); // 2자리
				System.out.println(num / 100 % 10); // 3자리

				for(int a = 0; a < baseball.length; a++){
					if(a==0){
						if(num / 100 % 10 == baseball[a]){
							strike ++;
						}else if((num / 10 % 10) == baseball[a] || (num % 10) == baseball[a]) {
							ball ++;
						}
					}
					if(a==1){
						if(num / 10 % 10 == baseball[a]){
							strike ++;
						}else if((num / 100 % 10) == baseball[a] || (num % 10) == baseball[a]) {
							ball ++;
						}
					}
					if(a==2){
						if(num % 10 == baseball[a]){
							strike ++;
						}else if((num / 100 % 10) == baseball[a] || (num / 10 % 10) == baseball[a]) {
							ball ++;
						}
					}
				}
				System.out.println("strike : "+strike + "// ball :"+ball);
				if(strike == 3){
					flag = true;
				}else{
					ball = 0;
					strike = 0;
				}
			}
		}while(num > 1000 || num < 100);

		System.out.println("승리~");

		br.close();
		in.close();




	}


}






