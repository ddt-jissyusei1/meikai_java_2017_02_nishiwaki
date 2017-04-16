package kensyu01;

// 入力された値を取得する為の機能の読み込み 
import java.util.Scanner;

// 入力された正の整数値が10の倍数かどうかを判定し、結果を出力するクラス
public class E3_6_IO_CheckMultipleOf10 {

	// 入力された正の整数値が10の倍数かどうかを判定し、結果を出力する処理
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトを作成
		Scanner stdIn = new Scanner(System.in);
		// 正の整数の入力を促すメッセージを出力する
		System.out.print("正の整数値を入力してください。");
		// 入力された値を変数に保持する
		int n = stdIn.nextInt();
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
		// nが正の整数でない場合の処理
		if ( n < 1 ) {			
			// nが正の整数でないことをメッセージで出力する
			System.out.println("正でない値が入力されました。");
		// nが10で割り切れる場合の処理
		} else if ( n % 10 == 0 ) {
			// nが10の倍数であることをメッセージで出力
			System.out.println("その値は10の倍数です。");
		// nが10で割り切れない場合の処理
		} else {
			// nが10の倍数でないことをメッセージで出力する
			System.out.println("その値は10の倍数ではありません。");
		}
		
	}
}
