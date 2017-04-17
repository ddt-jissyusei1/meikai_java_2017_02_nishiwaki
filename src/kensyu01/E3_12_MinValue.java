package kensyu01;

// 入力された値を取得する為の機能の読み込みを行う
import java.util.Scanner;

// 読み込んだ3つの整数値の最小値を表示する為のクラス
public class E3_12_MinValue {

	// 3つの整数値の入力を読み込み、最小値を出力する為の処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成を行う
		Scanner stdIn = new Scanner(System.in);
		
		int a; //入力された値aを保持する為の変数
		int b; //入力された値bを保持する為の変数
		int c; //入力された値cを保持する為の変数
		boolean isIntA; // 入力された値Aが整数かどうかの判定結果を保持する変数
		boolean isIntB; // 入力された値Bが整数かどうかの判定結果を保持する変数
		boolean isIntC; // 入力された値Cが整数かどうかの判定結果を保持する変数
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
				
				// 整数値Cの入力を促すメッセージを出力
				System.out.print("整数値cを入力してください。");
				// 入力された値cが整数かどうかの判定結果を保持する
				isIntC = stdIn.hasNextInt();
				
				
				// Cの値が整数だった場合の処理
				if( isIntC ){
					
					// 入力されたCの値を保持する
					c = stdIn.nextInt();
					// 3つの入力が正しいことをフラグに設定する
					isInt = true;
					
					// 3つの入力が正しかった場合の処理
					if ( isInt ){
						
						// 入力用のストリームを閉じる
						stdIn.close();
						
						// 変数minにaを保持
						int min = a;
						// minより b が小さい場合はminの値をbに置き換える
						if( b < min ) min = b;
						// minより c が小さい場合はminの値をcに置き換える
						if( c < min ) min = c;
						
						// minの値を出力する
						System.out.println(min);

						
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
