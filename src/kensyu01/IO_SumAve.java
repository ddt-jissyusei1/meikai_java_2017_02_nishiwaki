package kensyu01;

// 入力した値を読み込む為の機能の読み込み
import java.util.Scanner;

// 入力した実数値を出力画面に出力するクラス
public class IO_SumAve {

	// 入力した値を変数xとyに保持して報告する為の処理
	public static void main (String[] args) {

		// 入力した値を読み込む為のオブジェクトを作成
		Scanner stdIn = new Scanner(System.in);

		// x の値の入力を促す文字列を表示させる処理
		System.out.print("xの値 : ");
		// 入力した値を変数xに保持する為の処理
		float x = stdIn.nextFloat();

		// y の値の入力を促す文字列を表示させる処理
		System.out.print("yの値 : ");
		// 入力した値を変数yに保持する為の処理
		float y = stdIn.nextFloat();

		// 変数x,yの合計値を保持する為の処理
		float sum = x + y;
		// 変数x,yの平均値を保持する為の処理
		float ave = sum / 2;

		// 変数x,yの合計値を出力する為の処理
		System.out.println("合計は" + sum + "です。");
		// 変数x,yの平均値を出力する為の処理
		System.out.println("平均は" + ave + "です。");

	}
}
