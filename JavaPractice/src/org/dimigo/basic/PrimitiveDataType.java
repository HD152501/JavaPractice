/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * JavaPractice
 *   └ PrimitiveDataType
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author : 강선구
 * @version : 1.0
 */
public class PrimitiveDataType {

	public static void main(String[] args) {

		System.out.println("<< 아이유 프로필 >>");

		String name = "아이유";
		System.out.println("이름 : " + name);

		boolean isMale = false;
		System.out.print("성별 : ");
		System.out.println(isMale ? "남자" : "여자");

		int age = 25;
		System.out.println("나이 : " + age + "세");

		double height = 161.8;
		System.out.println("키 : " + height + "cm");

		float weight = 44.3F;
		System.out.println("키 : " + weight + "kg");

		char bloodType = 'A';
		System.out.println("혈액형 : " + bloodType + "형");
	}
}
