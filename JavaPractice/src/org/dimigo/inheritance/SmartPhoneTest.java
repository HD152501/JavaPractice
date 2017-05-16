/**
 * 
 */
package prac11;

/**
* <pre>
* prac11
*	|_ SmartPhoneTest
* 
* 1. 개요 : 
* 2. 작성일 : 2017. 5. 16.
*<pre>
*
*@author         : USER
*@version        : 1.0
*/
public class SmartPhoneTest {
	
	public static void main(String[] args) {
		
		SmartPhone[] sp = {
			new IPhone("iPhone 7", "애플", 900000),
			new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(SmartPhone sps : sp) {
			System.out.println(sps);
			sps.turnOn();
			sps.pay();
			sps.useSpecialFunction(sps);
			sps.turnOff();
			System.out.println();
		}
	}
}
