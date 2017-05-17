/**
 * 
 */
package JavaPractice.abstractclass;

/**
 * <pre>
 * JavaPractice.abstractclass
 * 	 |_ Galaxy
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 17.
 * <pre>
 *
 * @author : 박명규(로컬계정)
 * @version : 1.0
 */
public class Galaxy extends SmartPhone {

	public Galaxy() {
		
	}
	
	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		System.out.println("삼성 페이로 결제합니다.");
	}
	
	public void useWirelessCharging() {
		System.out.println("무선 충전 기능을 사용합니다.");
	}
}
