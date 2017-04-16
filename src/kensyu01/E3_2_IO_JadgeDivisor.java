package kensyu01;

//入力した値を読み込む為の機能の読み込み
import java.util.Scanner;

// 2つの整数A,B入力を受け取りBがAの約数かどうかを判定する為のクラス
public class E3_2_IO_JadgeDivisor {

	// 2つの整数A,B入力を受け取りBがAの約数かどうかを判定する為の処理
	public static void main (String[] arg){

		// 入力した値を読み込む為のオブジェクトを作成
		Scanner stdIn = new Scanner(System.in);

		// 整数Aの入力を促すメッセージを出力する為の処理
		System.out.print("整数A : ");
		// 入力された値を変数Aに保持する
		int A = stdIn.nextInt();

		// 整数Bの入力を促すメッセージを出力する為の処理
		System.out.print("整数B : ");
		// 入力された値を変数Bに保持する
		int B = stdIn.nextInt();
		
		// 入力用ストリームを閉じる
		stdIn.close();

		// 変数Bの値が変数Aの値の約数になっているかの判定結果を格納する為の変数
		boolean isDivisor = false;
		// 変数Bの値が変数Aの値の約数になっているかを判定する為の処理
		if( A % B == 0 ) {
			isDivisor = true;
		}

		// isDivisorの値を元に BがAの約数かどうか を出力する為の処理
		if(isDivisor){
			System.out.println("BはAの約数です。");
		} else {
			System.out.println("BはAの約数ではありません。");
		}

	}
}
