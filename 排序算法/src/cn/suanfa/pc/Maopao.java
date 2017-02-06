package cn.suanfa.pc;

public class Maopao {
	
	//冒泡排序的具体实现
	public static void method(int[] arr){
		//冒泡排序
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
	
	//选择排序的具体实现
	public static void Select(int[] arr){
		/**
		 * 	1.找出最小值的索引,但是不交换值
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
