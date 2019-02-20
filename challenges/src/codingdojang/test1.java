package codingdojang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println("Hello Goorm! Your input is " + input);



		int input_num = Integer.parseInt(input);

		if(input_num < 0){
			throw new IOException();
		}

		String result = "";
		for(int i = 1; i <= input_num; i++){
			if(input_num % i == 0 && i != input_num){
				result += i +"␣";
			}else if(input_num % i == 0 && i == input_num){
				result += i +"↵";
			}
		}

		System.out.println(result);

	}
}
