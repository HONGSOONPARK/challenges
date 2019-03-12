package temp;

public class game369 {


	// 369 게임

	public static void main (String arg[]) throws Exception{


//		Scanner sc = new Scanner(System.in);

//		int num = sc.nextInt();

		int num = 100;

//		System.out.println((int) Math.log10(100) + 1);

//		System.out.println( Math.round(Math.pow(10,(int) Math.log10(100))));

		for(int i = 1; i<=num; i++){

			String a = String.valueOf(i);

			for(int b = 0; b < a.length(); b++){
				System.out.println(Character.getNumericValue(a.charAt(b)));
			}

		}




	}


}






