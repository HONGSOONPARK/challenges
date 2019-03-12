package temp;

public class freeboard2 {

	public static void main (String arg[]) {



		System.out.println(fact(4));


	}


	public static int fact(int a){
			if( a <= 1){
				return a;
			}
		return	fact(a-1) * a;
	}

}




