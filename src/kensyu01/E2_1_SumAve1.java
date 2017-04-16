package kensyu01;

//2つの変数xとyの合計と平均を表示
public class E2_1_SumAve1 {
	
	//数値を計算する為の処理
	public static void main(String[] arg){
		
		int x;		// xはint型の変数
		int y;		// yはint型の変数
		
		/* 
		 * 少数部をもつ値でint型の変数を初期化しているため
		 * エラーが発生している 
		 */
		//　xに63を代入
		x = 63.01;
		//　yに18を代入
		y = 18.02;
		
		// xの値を出力する処理
		System.out.println("xの値は" + x + "です。");
		// yの値を出力する処理
		System.out.println("yの値は" + y + "です。");
		// xとyの値の合計を出力する処理
		System.out.println("合計は" + (x + y) + "です。");
		// xとyの値の平均を表示する処理
		System.out.println("平均は" + (x + y) / 2 + "です。");
		
	}
}
