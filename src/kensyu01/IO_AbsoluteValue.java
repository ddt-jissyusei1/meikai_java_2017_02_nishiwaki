package kensyu01;

//入力した値を読み込む為の機能の読み込み
import java.util.Scanner;

// 入力した値の絶対値を出力するクラス
public class IO_AbsoluteValue {

	// 入力した値を絶対値で出力する為の処理
	public static void main (String[] arg){
		
		// 入力した値を読み込む為のオブジェクトを作成
		Scanner stdIn = new Scanner(System.in);
		
		// 整数値の入力を促すメッセージを出力する為の処理
		System.out.print("整数値 : ");
		// 入力された値を変数に保持する
		int n = stdIn.nextInt();
		
		// 入力用ストリームを閉じる
		stdIn.close();
		
		// 入力された値が0未満の場合 -1 を乗算して絶対値に変換する為の処理
		if( n < 0 ) {
			n = n * -1;
		}
		
		// 変数nを出力する為の処理
		System.out.println("その絶対値は" + n + "です。");
		
	}
		
}
