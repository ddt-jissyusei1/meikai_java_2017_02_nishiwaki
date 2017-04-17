package kensyu01;

// 入力された値を取得する為の機能を読み込む
import java.util.Scanner;

// 読み込んだ3つの整数値を比較し、大きい方の値と、小さい方の値を出力する為のクラス
public class E3_16_AscendingSortValue {

	// 3つの整数値の入力を読み込み、大きい方の値と、小さい方の値を出力する為の処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトを作成する
		Scanner stdIn = new Scanner(System.in);
		
		int a; //入力された値aを保持する為の変数
		int b; //入力された値bを保持する為の変数
		int c; //入力された値cを保持する為の変数
		boolean isIntA; // 入力された値aが整数かどうかの判定結果を保持する変数
		boolean isIntB; // 入力された値bが整数かどうかの判定結果を保持する変数
		boolean isIntC; // 入力された値cが整数かどうかの判定結果を保持する変数
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
			
			
			if ( isIntB ){
				
				// 入力されたbの値を保持する
				b = stdIn.nextInt();
				
				// 整数値cの入力を促すメッセージを出力
				System.out.print("整数値cを入力してください。");
				// 入力された値cが整数かどうかの判定結果を保持する
				isIntC = stdIn.hasNextInt();
			
				// cの値が整数だった場合の処理
				if( isIntC ){
				
					// 入力されたcの値を保持する
					c = stdIn.nextInt();
						
					// 2つの入力が正しいことをフラグに設定する
					isInt = true;
				
					// 2つの入力が正しかった場合の処理
					if ( isInt ){
					
						// 入力用のストリームを閉じる
						stdIn.close();
						
						// a,bを比較して aがbより小さければ値を入れ替える
						if ( a < b ) {
							
							// aの値を変数tに保持する
							int t = a;
							// aの値をbの値に変更する
							a = b;
							// bの値をtに保持したaの値に変更する
							b = t;
							
						}
						
						// a,cを比較して aがbより小さければ値を入れ替える
						if ( a < c ) {
							
							// aの値を変数tに保持する
							int t = a;
							// aの値をcの値に変更する
							a = c;
							// cの値を変数tに保持したaの値に変更する
							c = t;
						}
						
						// aには最大値が入っているはずなので b,cを比較して bがcより小さければ値を入れ替える
						if( b < c ) {
							
							// bの値を変数tに保持する
							int t = b;
							// bの値をcの値に変更する
							b = c;
							// cの値を変数tに保持したbの値に変更する
							c = t;
							
						}
						
						// aの値を出力する
						System.out.println(a);
						// bの値を出力する
						System.out.println(b);
						// cの値を出力する
						System.out.println(c);

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
