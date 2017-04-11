package kensyu01;

// 入力された値を取得する機能の読み込み
import java.util.Scanner;

// 入力された正の整数値が5の倍数であるかどうか判定し、結果を出力するクラス
public class IO_CheckMultipleOf5 {
	
	// 入力された正の整数値が5の倍数であるかどうか判定し、結果を出力する処理
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成
		Scanner stdIn = new Scanner(System.in);
		
		// 正の整数値の入力を促すメッセージの出力
		System.out.print("正の整数値を入力してください : ");
		// 入力された値を変数に保持する
		int n = stdIn.nextInt();
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
		// nの値が正の値でない場合の処理
		if ( n < 1 ) {
			// 正の値ではないことをメッセージで出力する
			System.out.println("正でない値が入力されました。");
		// nの値が5で割り切れる場合の処理
		} else if ( n % 5 == 0 ){
			// 5で割り切れることをメッセージで出力する
			System.out.println("その値は5で割り切れます。");
		// nの値が5で割り切れない場合の処理
		} else {
			// 5で割り切れないことをメッセージで出力する
			System.out.println("その値は5で割り切れません。");
		}
		
	}
}
