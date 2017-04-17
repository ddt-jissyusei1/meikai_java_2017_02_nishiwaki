package kensyu01;

//入力した値を読み込む為の機能の読み込みを行う
import java.util.Scanner;

//読み込んだ整数値の符号（正/負/０）を判定して表示するクラス
public class E3_3_Sign {

	// 読み込んだ整数値の符号（正/負/０）を判定して表示する処理を行う
	public static void main (String[] arg) {
		
		// 入力した値を読み込む為のオブジェクトを作成する
		Scanner stdIn = new Scanner(System.in);
		
		// 整数値の入力を促すメッセージを出力する為の処理を行う
		System.out.print("整数値 : ");
		// 変数nに入力された値を保持する
		int n = stdIn.nextInt();
		
		// 入力用ストリームを閉じる
		stdIn.close();
		
		// nの値の符号（正/負/０）を判定して出力を出し分ける為の処理
		if( n > 0 )
			// nが正の整数であることを出力する為の処理
			System.out.println("その整数は正です。");
		else if ( n < 0 )
			// nが負の整数であることを出力する為の処理
			System.out.println("その整数は負です。");
		else
			// nが0であることを出力する為の処理
			System.out.println("その整数は0です。");
		
		/*
		 * else だけの場合は 0以下でも0以上でもない int型の数値が判定される = 0だけが判定される
		 * else if ( n == 0 ) の場合は 0だけが判定される
		 * よって結果は同じになる
		 */

	}
}
