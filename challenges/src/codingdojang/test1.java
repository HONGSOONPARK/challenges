package codingdojang;

/*
예로 10 ~ 15 까지의 각 숫자의 개수를 구해보자

10 = 1, 0
11 = 1, 1
12 = 1, 2
13 = 1, 3
14 = 1, 4
15 = 1, 5

그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개

*/
public class test1 {

	public static void main(String[] args)  {

		int[] result = new int[10];
		// 자리수 생성
		for(int i = 1; i <= 1000; i++){
			result[i%10]++;
			if(i>=10) result[i/10%10]++;
			if(i>=100) result[i/100%10]++;
			if(i==1000) result[i/1000%10]++;
		}

		for(int i = 0; i < result.length; i++){
			System.out.print("["+i+"]:"+result[i]+" ");
		}
		System.out.println();


		int arr[] = new int[10];
		for(int i = 1; i <= 1000; i++) {
		    int tmp = i;
		    do  {
		    	arr[tmp % 10]++;
		    	System.out.println(tmp % 10);
		    } while((tmp /= 10) != 0);
		    System.out.println("===========");
		}






	}
}
