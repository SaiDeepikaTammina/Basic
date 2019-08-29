package demo;

import java.util.*;

public class Arraydemo {

	public void compare() {
		int i, j, del;
		int[] temp = new int[6];
		Scanner sc = new Scanner(System.in);

		int arr1[] = { 1, 2, 3, 6, 4, 8 };
		int arr2[] = { 3, 4, 1, 9, 6, 22, 33 };

		int k = 0;
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {

					temp[k] = arr1[i];
					k++;

				}
			}
		}
		System.out.println("common elements in both the arraysL:");
		for (i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}

	public void sort() {
		int i, j;
		int[] temp = new int[7];

		int arr1[] = { 1, 2, 3, 6, 4, 8 };
		int arr2[] = { 3, 4, 1, 9, 6, 22, 33 };

		int k = 0;
		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {

					temp[k] = arr1[i];
					k++;

				}
			}
		}
		System.out.println("after sorting the common elements:");
		Arrays.sort(temp);
		for (i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

	public void delete() {
		int arg[] = { 5, 6, 9, 8, 10 };

		int pos = 3;
		System.out.println("hii continues:");
		for (int k = 0; k < arg.length; k++) {
			System.out.println(arg[k]);
		}
		for (int i = 0; i < arg.length; i++) {

			if (pos == i) {
				for (int j = i + 1; i < arg.length - 1; j++) {
					arg[i] = arg[j];
					i++;
				}
			}
		}

		System.out.println("The output of Array After Delete");
		for (int i = 0; i < arg.length - 1; i++) {
			System.out.println(arg[i]);
		}
	}

	public void add() {

		int n, pos, x;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n + 1];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Enter the position where you want to insert element:");
		pos = s.nextInt();
		System.out.print("Enter the element you want to insert:");
		x = s.nextInt();
		for (int i = (n - 1); i >= (pos - 1); i--) {
			a[i + 1] = a[i];
		}
		a[pos - 1] = x;
		System.out.print("After inserting:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[n]);

	}

	public static void main(String args[]) {
		Arraydemo d = new Arraydemo();
		d.compare();
		d.sort();
		d.delete();
		d.add();
	}
}

kghhhhhhhuhi
