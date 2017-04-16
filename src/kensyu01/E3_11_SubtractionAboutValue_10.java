package kensyu01;

// 入力された値を取得する為の機能の読み込み
import java.util.Scanner;

// 入力された2つの整数値の差を計算して 10 超過か以下かを判定するクラス
public class E3_11_SubtractionAboutValue_10 {

	// 入力された2つの整数値の差を計算して 10 超過か以下かを判定する処理
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成
		Scanner stdIn = new Scanner(System.in);
		
		int a; //入力された値aを保持する為の変数
		int b; //入力された値bを保持する為の変数
		boolean isIntA; // 入力された値Aが整数かどうかの判定結果を保持する変数
		boolean isIntB; // 入力された値Bが整数かどうかの判定結果を保持する変数
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
			
			// bの値が整数だった場合の処理
			if( isIntB ){
				
				// 入力されたbの値を保持する
				b = stdIn.nextInt();
				// 2つの入力が正しいことをフラグに設定する
				isInt = true;
				
				// 2つの入力が正しかった場合の処理
				if ( isInt ){
					
					// 入力用のストリームを閉じる
					stdIn.close();
					
					// 二つの値の差を変数に保持する
					int result = a - b;
					// 計算結果を正の値に変換する
					result = result < 0 ? -result : result;
					
					// 計算結果が「11以上か10未満か」をメッセージに出力する
					System.out.println("それらの差は" + ( result > 10  ? "11以上です。" : "10以下です。" ) );


					
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
