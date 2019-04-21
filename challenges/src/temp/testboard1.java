package temp;

import java.io.IOException;
import java.util.Scanner;



public class testboard1 {


	public static void main (String arg[]) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자입력 : ");

		String input ;

//		do{

			input = sc.next();
			int num = Integer.parseInt(input);
			int cnt = 0;

			 while(num > 0) {
				cnt++;
				if(Integer.toString(cnt).contains("666")){
					num--;
				}

			}

			System.out.println(cnt);

//		}while(num < 0 || num > 10000);
//


		sc.close();


	}
}
