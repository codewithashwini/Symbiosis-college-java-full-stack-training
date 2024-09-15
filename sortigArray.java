package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sortigArray {
	public static void method1() {
		int array[]=new int[5];
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements: ");
		for(int i=0;i < array.length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("elements of original array:");
		for(int i=0;i < array.length;i++) {
			System.out.println(array[i]+ " ");
		}
		//sort array ascending order
		for(int i=0;i < array.length;i++) {
			for(int j=i+1 ;j < array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}

		}
		System.out.println("--------------------------------");
		System.out.println("element of array sorted in ascending order:");
		for(int i=0;i < array.length;i++) {
			System.out.println(array[i]+ " ");
		}


	}
public static void method2() {
	int []array=new int[]
			{90,50,40,60,8};
	Arrays.sort(array);
	System.out.println("element of array sorted in asending:");
	for(int i=0;i < array.length;i++) {
		System.out.println(array[i]);

		
	}
}
public static void method3() {
	Integer[] array= {20,80,-50,90,-50};
	Arrays.sort(array,Collections.reverseOrder());
	System.out.println("elements in descending order:"+Arrays.toString(array));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		method2();
		System.out.println("-------------------");
		method3();
	}

}
