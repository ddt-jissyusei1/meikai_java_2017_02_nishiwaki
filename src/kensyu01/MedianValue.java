package kensyu01;

// 入力された値を取得する為の機能の読み込み
import java.util.Scanner;

// 読み込んだ3つの整数値の中央値を表示する為のクラス
public class MedianValue {

	// 3つの整数値の入力を読み込み、中央値を出力する為の処理
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成
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
						
						// 最大値取得のためにmaxをaの値で期化する
						int max = a;
						// maxよりbの値が大きければその値で置き換える
						max = ( b > max ) ? b : max;
						// maxよりcの値が大きければその値で置き換える
						max = ( c > max ) ? c : max;
						
						// 最小値取得のためにminをあの値で初期化する
						int min = a;
						// minよりbの値が小さければその値で置き換える
						min = ( b < min ) ? b : min;
						// minよりcの値が小さければその値で置き換える
						min = ( c < min ) ? c : min;
						
						// a,b,cが同じ(max == min)場合の処理
						if( max == min ){
							// 何れも中央値なので a を出力する
							System.out.println(a);
						
						// a,b,cが全てことなる場合の処理
						} else if (a != b && a != c && b != c ) {
 
							// 	a == min の場合 b,cのうち小さい方を中央値として出力する
							if ( a == min ) System.out.println( b < c ? b : c );
							
							// 	b == min の場合 a,cのうち小さい方を中央値として出力する
							if ( b == min ) System.out.println( a < c ? a : c );
							
							// 	c == min の場合 a,bのうち小さい方を中央値として出力する
							if ( c == min ) System.out.println( a < b ? a : b );
							
						// 何れかは同じ値の場合
						} else {
						
							// a,bが同じ場合 aを中央値として出力する
							if ( a == b ) System.out.println(a);
							
							// a,cが同じ場合 aを中央値として出力する
							if ( a == c ) System.out.println(a);
							
							// b,cが同じ場合 bを中央値として出力する
							if ( b == c ) System.out.println(b);
							
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
				
		} else {
			// 入力用のストリームを閉じる
			stdIn.close();
			// 入力が不正であることをメッセージで出力する
			System.out.println("入力された値が不正です。");
		}
		
	}
}
