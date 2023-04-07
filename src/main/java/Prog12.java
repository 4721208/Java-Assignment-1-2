/**
 * クラス Prog12
 * 
 * @author (4721208　佐藤友麻)
 * @version (2022/04/07)
 */
public class Prog12 {

	public static void main(String[] args) {
		final double PI = 3.14; //変更しない
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);

		System.out.println("パイの半径を倍にします");
		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
	}

}
