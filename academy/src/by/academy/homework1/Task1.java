package by.academy.homework1;

import java.util.Scanner;

/*������:
	1) ����� �� 100 ������ -> 5%
	2) ����� �� 100 ������ ������� �� 200 ������ �� ������� -> 7%
	3) ����� �� 200 ������ ������� �� 300 ������ �� ������� -> 12%
	4) ����� �� 300 ������ ������� �� 400 ������ �� ������� -> 15%
	5) ����� ������� ������ 400 ������ ������� -> 20%
� ������, ���� ����� ������� ��������� � 3 ��������� (����� �� 200 ������ ������� �� 300 ������ �� �������) 
� ������� ���������� ������, ��� 18 ��� -> �������� 4% � ������ (12 + 4), ����� -> ������ 3%. */


public class Task1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������� ����� �������: ");
		double summa = scan.nextLong();
		
		System.out.print("������� �������: ");
		int old = scan.nextInt();
		scan.close();
		
		if (summa < 100) { //����� �� 100 ������ -> 5%
			double skidka = (5*summa)/100;
			System.out.println ("����� = " + (summa-skidka));
		}else{
			if (summa >= 100 && summa < 200) { //����� �� 100 ������ ������� �� 200 ������ �� ������� -> 7%
				double skidka = (7*summa)/100;
				System.out.println ("����� = " + (summa-skidka));
			}else{
				
				
				if (summa >= 200 && summa < 300) { //�� 200 ������ ������� �� 300 ������ �� ������� -> 12%
					int a = 1;
					//double skidkaSp = (12*summa)/100;
					//System.out.println ("����� = " + (summa-skidka));
				
				
				}else {
					if (summa >= 300 && summa < 400) { //4) ����� �� 300 ������ ������� �� 400 ������ �� ������� -> 15%
						double skidka = (15*summa)/100;
						System.out.println ("����� = " + (summa-skidka));
					}else {
						double skidka = (20*summa)/100; //5) ����� ������� ������ 400 ������ ������� -> 20%
						System.out.println ("����� = " + (summa-skidka));
					}
				}
			}
		}
		
if (a = 1 && old >=18) {
	
}else 
	}
}