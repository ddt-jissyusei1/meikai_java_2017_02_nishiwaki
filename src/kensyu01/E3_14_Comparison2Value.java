package kensyu01;

// 入力された値を取得する為の機能の読み込みを行う
import java.util.Scanner;

// 読み込んだ2つの整数値を比較し、大きい方の値と、小さい方の値を出力する為のクラス
public class E3_14_Comparison2Value {

	// 2つの整数値の入力を読み込み、大きい方の値と、小さい方の値を出力する為の処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成
		Scanner stdIn = new Scanner(System.in);
		
		int a; //入力された値aを保持する為の変数
		int b; //入力された値bを保持する為の変数
		boolean isIntA; // 入力された値aが整数かどうかの判定結果を保持する変数
		boolean isIntB; // 入力された値bが整数かどうかの判定結果を保持する変数
		boolean isInt; // 入力された両方の値が整数かどうかの判定結果を保持する変数
		
		// 整数値aの入力を促すメッセージを出力
		System.out.print("整数値aを入力してください。");
		// 入力された値aが整数かどうかの判定結果を保持する
		isIntA = stdIn.hasNextInt();
		
		// aの値が整数だった場合の処理
		if ( isIntA ){
			
			// 入力されたaの値を保持する
			a = stdIn.nextInt();
			
			// 整数値bの入力を促すメッセージを出力
			System.out.print("整数値bを入力してください。");
			// 入力された値bが整数かどうかの判定結果を保持する
			isIntB = stdIn.hasNextInt();
			
			// Bの値が整数だった場合の処理
			if( isIntB ){
				
				// 入力されたbの値を保持する
				b = stdIn.nextInt();
					
				// 2つの入力が正しいことをフラグに設定する
				isInt = true;
				
				// 2つの入力が正しかった場合の処理
				if ( isInt ){
					
					// 入力用のストリームを閉じる
					stdIn.close();
					
					// a,bの値が同じ場合の処理
					if ( a == b ){
						
						// a,bの値が同じであることを表示する
						System.out.println("2つの値は同じです");
					
					// a,bの値と異なる場合の処理
					} else if (a != b ) {
						
						// a,bの値を大きい順にソートし表示する
						if ( a < b ) {
							// 変数tにaの値を保持する
							int t = a;
							// aの値をbの値に変更する
							a = b;
							// bの値を tに保持していたaの値 に変更する
							b = t;
						}
						
						// 小さい方の値を出力する
						System.out.println("小さい方の値は : " + b + "です。");
						// 大きい方の値を出力する
						System.out.println("大きい方の値は : " + a + "です。");
						
						
					}
				}
					
			} else {
				// 入力用のストリームを閉じる
				stdIn.close();
				// 入力が不正であることをメッセージで出力する
				System.out.println("入力された値が不正です。");
			}
				
		} else {
			// 入力用のストリームを閉じる
			stdIn.close();
			// 入力が不正であることをメッセージで出力する
			System.out.println("入力された値が不正です。");
		}
		
	}
}
