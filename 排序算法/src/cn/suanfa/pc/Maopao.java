package cn.suanfa.pc;

public class Maopao {
	
	//ð������ľ���ʵ��
	public static void method(int[] arr){
		//ð������
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]){
					int temp = 0 ;
					temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
			}
		}
	}
	
	//ѡ������ľ���ʵ��
	public static void Select(int[] arr){
		/**
		 * 	1.�ҳ���Сֵ������,���ǲ�����ֵ
		 * 	
		 * 	2,... aaaa
		 */
		
		int index = 0 ;
		int temp = 0 ;
		
		for (int i = 0; i < arr.length-1; i++) {
			
			index = i ;
				
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j] < arr[index]){
					index = j ;
				}
			}
			if(index != i){
				temp = arr[i] ;
				arr[i] = arr[index] ;
				arr[index] = temp ;
			}
		}
	}
	
	public static void bianli(int[] arr){
		System.out.print("{") ;
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1){
				System.out.print(arr[arr.length-1]+"}");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] array = {2,4,1,5,8,0} ;
		
	//	Maopao.method(array) ;
		Maopao.Select(array) ;
		Maopao.bianli(array) ;
	}
}	
