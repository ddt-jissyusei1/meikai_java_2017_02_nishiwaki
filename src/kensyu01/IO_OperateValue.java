package kensyu01;

//入力した値を読み込む為の機能の読み込み
import java.util.Scanner;

// 入力した値から演算結果を表示する為のクラス
public class IO_OperateValue {

	// 入力した値から演算結果を表示する為の処理
	public static void main(String[] arg){

		// 入力した値を読み込む為のオブジェクトを作成
		Scanner stdIn = new Scanner(System.in);

		// 整数値の入力を促すメッセージを出力する処理
		System.out.print("整数値 : ");
		// 変数xに入力した値を保持する
		int x = stdIn.nextInt();
		// 入力用ストリームを閉じる
		stdIn.close();

		// 入力した値に10を足した値を保持
		int result_of_addition = x + 10;
		// 加算結果を出力する為の処理
		System.out.println("10を加えた値は" + result_of_addition + "です。");
		
		// 入力した値から10を引いた値を保持
		int result_of_subtraction = x - 10;
		// 加算結果を出力する為の処理
		System.out.println("10を減じた値は" + result_of_subtraction + "です。");

	}
}
