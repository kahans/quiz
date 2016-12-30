package com.zeroday.one;

public class IfForTest {
	static int[] arNum = { 7, 9, 1, 4, 5 };

	public static void main(String[] args) {
		int out, in;
		IfForTest t = new IfForTest();
		System.out.println("arNum 배열 갯수 : "+arNum.length);//arNum 배열에 5개의 수를 갖이고 있다.
		for (out = arNum.length - 1; out > 0; out--) {//out은 arNum.length의 같은수 이고; out은 0보다 크다;
			System.out.println("out에 배열 위치 : "+out);
			for (in = 0; in < arNum.length - 1; in++) { //
				if (arNum[in] > arNum[in + 1]) {
					t.swap(in, in + 1);
				}
			}
		}
		t.display();
	}

	void swap(int one, int two) {
		int temp = arNum[one];
		arNum[one] = arNum[two];
		arNum[two] = temp;
	}

	void display() {
		for (int index = 0; index < arNum.length; index++) {
			System.out.print(arNum[index]);
		}
	}

}
