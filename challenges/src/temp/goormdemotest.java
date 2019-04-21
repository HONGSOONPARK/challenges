package temp;

import java.io.IOException;


class Calculator {
	public int evaluate(String expression) {
		int sum = 0;


		String[] num = expression.split("\\+");

		for(int i=0; i<num.length; i++){

			sum += Integer.parseInt(num[i]);

		}

		return sum;
	}
}

public class goormdemotest {




	public static void main (String arg[]) throws IOException {





		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");

		System.out.println("1+2+3 = " + sum);

//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
//		System.out.println("Hello Goorm! Your input is " + input);
//
//		int num = Integer.parseInt(input);
//
//
//		do{
//
//			String result = "";
//			for(int i=1; i<=num; i++){
//
//				if(num%i==0){
//
//					if(i==num){
//						result += i+"";
//					}else{
//						result += i+" ";
//					}
//
//				}
//
//
//			}
//
//			System.out.println(result);
//
//		}while(num < 0);
//


	}
}
