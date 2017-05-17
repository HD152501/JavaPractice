/**
 * 
 */
package JavaPractice.abstractclass;

/**
 * <pre>
 * JavaPractice.abstractclass
 * 	 |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 17.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
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
			sps.useSpecialFunction();
			sps.turnOff();
			System.out.println();
		}
	}
}
