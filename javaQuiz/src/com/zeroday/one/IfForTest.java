package com.zeroday.one;

public class IfForTest {
	static int[] arNum = { 7, 9, 1, 4, 5 };

	public static void main(String[] args) {
		int out, in;
		IfForTest t = new IfForTest();
		System.out.println("arNum �迭 ���� : "+arNum.length);//arNum �迭�� 5���� ���� ���̰� �ִ�.
		for (out = arNum.length - 1; out > 0; out--) {//out�� arNum.length�� ������ �̰�; out�� 0���� ũ��;
			System.out.println("out�� �迭 ��ġ : "+out);
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
