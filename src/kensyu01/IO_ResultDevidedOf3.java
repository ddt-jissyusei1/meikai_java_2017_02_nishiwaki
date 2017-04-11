package kensyu01;

// 入力された値を取得する為の機能を読み込み
import java.util.Scanner;

//  入力された値を3で割った結果をメッセージで出力するクラス
public class IO_ResultDevidedOf3 {

	// 入力された値を3で割った結果をメッセージで出力する処理
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成
		Scanner stdIn = new Scanner(System.in);
		
		// 正の整数の入力を促すメッセージを出力
		System.out.print("正の整数を入力してください : ");
		// 入力された値を変数に保持する
		int n = stdIn.nextInt();
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
		// nが正の整数でない場合の処理
		if ( n < 1 ) {
			// 入力された値が正の制すでないことをメッセージで出力
			System.out.println("正ではない値が入力されました。");
		// nが3で割り切れる場合の処理
		} else if ( n % 3 == 0 ) {
			// 入力された値が3で割り切れることをメッセージで出力
			System.out.println("その値は3で割り切れます。");
		// nを3で割った余りが1の場合の処理
		} else if ( n % 3 == 1 ) {
			System.out.println("その値を3で割った余りは1です。");
		// nを3で割った余りが2の場合の処理
		} else {
			System.out.println("その値を3で割った余りは2です。");
		}
		
	}
}
