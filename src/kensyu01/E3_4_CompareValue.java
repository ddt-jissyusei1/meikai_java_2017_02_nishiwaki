package kensyu01;

// 入力した値を取得する機能の読み込み
import java.util.Scanner;

// 入力した値の大小を比較し結果を表示する為のクラス
public class E3_4_CompareValue {

	// 入力した値を比較して結果を表示する為の処理
	public static void main(String[] arg){
		
		// 入力した値を取得するオブジェクトを作成
		Scanner stdIn = new Scanner(System.in);
		
		// a の値の入力を促すメッセージを出力
		System.out.print("整数値 a を入力してください : ");
		// 変数aに入力された値を保持する
		int a = stdIn.nextInt();
		
		// b の値の入力を促すメッセージを出力
		System.out.print("整数値 b を入力してください : ");
		// 変数bに入力された値を保持する
		int b = stdIn.nextInt();
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
		// aとbの値を比較した結果で出力するメッセージを振り分ける処理
		if( a > b ) {
			System.out.println("aのほうが大きいです。");
		} else if ( a < b ) {
			System.out.println("bのほうが大きいです。");
		} else {
			System.out.println("aとbは同じ値です。");
		}
	}
	
}
