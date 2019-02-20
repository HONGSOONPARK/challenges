package sort;

public class sort {

	public static void main (String arg[]) {

		// 정렬 연습
		int[] select = {10,3,4,1,7,2,5,9,6,8};
		int[] bubble = {10,3,4,1,7,2,5,9,6,8};
		int[] insert = {10,3,4,1,7,2,5,9,6,8};

		int temp = 0;

		for(int i = 0; i < select.length -1 ; i++){
			int min = i;
			for(int l = i+1; l < select.length; l++){
				if(select[l] < select[min]){
					min = l;
				}
			}
			temp = select[i];
			select[i] = select[min];
			select[min] = temp;
		}


		for(int i = bubble.length - 1; i > 0; i--){
			for(int l = 0; l < i; l++){
				if(bubble[l] > bubble[i]){
					temp = bubble[l];
					bubble[l] = bubble[i];
					bubble[i] = temp;
				}
			}
		}



		for(int i = 1; i < insert.length; i++){
			int min = insert[i];
			for(int l=i-1; l>=0 && insert[l] > min; l--){
				insert[l+1] = insert[l];
				insert[l] = min;
			}

		}





		for(int a : select){
			System.out.print(a + " ");
		}
		System.out.println("============선택");

		for(int a : bubble){
			System.out.print(a + " ");
		}
		System.out.println("============버블");

		for(int a : insert){
			System.out.print(a + " ");
		}
		System.out.println("============삽입");


		// 선택정렬
//		for(int i = 0; i < select.length - 1; i++){
//			int min = i;
//			for(int l = i+1; l < select.length; l++){
//
//				if(select[l] < select[min]){
//					min = l;
//				}
//			}
//			temp = select[min];
//			select[min] = select[i];
//			select[i] = temp;
//		}
//
//		for(int a : select){
//			System.out.print(a + " ");
//		}
//		System.out.println();
//
//		// 버블
//		for(int i = bubble.length - 1; i > 0; i--){
//			for(int l = 0; l < i; l++){
//				if(bubble[l] < bubble[i]){
//					temp = bubble[l];
//					bubble[l] = bubble[i];
//					bubble[i] = temp;
//				}
//			}
//		}
//		for(int a : bubble){
//			System.out.print(a + " ");
//		}
//		System.out.println();
//
//
//
//		for(int i = 1; i<insert.length; i++){
//			int key = insert[i];
//			for(int l = i-1;  l>=0 && insert[l] > key; l--){
//
//				insert[l+1] = insert[l];
//				insert[l] = key;
//			}
//
//		}
//		for(int a : insert){
//			System.out.print(a + " ");
//		}
//		System.out.println();

	}














}
