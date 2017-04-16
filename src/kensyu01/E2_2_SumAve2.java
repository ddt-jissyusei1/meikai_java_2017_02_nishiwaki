package kensyu01;

//2つの変数xとyの合計と平均を表示
public class E2_2_SumAve2 {

	//数値を計算する為の処理
	public static void main(String[] arg){

		int x;		// xはint型の変数
		int y;		// yはint型の変数
		int z;		// zはint型の変数
		

		//　xに63を代入
		x = 63;
		//　yに18を代入
		y = 18;
		// zに34を代入
		z = 34;

		//変数x, y, z の合計を保持する変数
		int sum = x + y + z;
		//変数x, y, z の平均を保持する変数
		int ave = sum / 3;

		// 変数x, y, z の合計を出力する処理
		System.out.println("変数x, y, z の合計値は" + sum + "です。");
		// 変数x, y, z の平均を出力する処理
		System.out.println("変数x, y, z の平均値は" + ave + "です。");

	}
}
