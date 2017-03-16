/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * JavaPractice
 *   └ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author : 강선구
 * @version : 1.0
 */
public class Operator {

	public static void main(String[] args) {

		int pay = 1700000;
		int emp = 3;
		int store = 1500;
		long yearCost = (long) pay * 12 * emp * store;

		System.out.println("<< 디미베네 연간 인건비 >>");

		System.out.println("월 평균 급여 : " + String.format("%,d", pay) + "원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", emp) + "명");
		System.out.println("점포 수 : " + String.format("%,d", store) + "개");
		System.out.println();
		System.out.println("연간 인건비 : " + String.format("%,d", yearCost) + "원");
	}
}
