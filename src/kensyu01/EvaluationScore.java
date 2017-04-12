package kensyu01;

// 入力した値を取得する為の機能の読み込み
import java.util.Scanner;

// 点数に応じた評価を出力するクラス
public class EvaluationScore {

	// 点数に応じた評価を出力する処理
	public static void main(String[] arg){
	
		// 入力した値を取得する為のオブジェクトの生成
		Scanner stdIn = new Scanner(System.in);
		
		// 0 ~ 100 の点数入力を促すメッセージを出力する
		System.out.println("0 ~ 100 の点数を入力してください");
		
		int score; // 入力された値を格納する変数
		boolean isInt; // 入力された値が整数かどうかの判定結果を格納する変数
		
		// 正の整数が入力されている場合の処理
		if( stdIn.hasNextInt()){
			// 正の整数であることを示すフラグを設定
			isInt = true;
			// 入力された値を変数に保持
			score = stdIn.nextInt();
		// 正の整数でない値が入力されている場合の処理
		} else {
			// 正の整数でないことを示すフラグの設定
			isInt = false;
			score = 0;
		}
		
		// 入力用ストリームを閉じる
		stdIn.close();
		
		// 整数が入力されている場合
		if ( isInt ){
			// score が 0 ~ 59 だった場合の処理
			if ( score >= 0 && score <= 59 ){
				// 「不可」という評価を出力する
				System.out.println("不可");
			// score が 60 ~ 69 だった場合の処理
			} else if ( score >= 60 && score <= 69 ){
				// 「可」という評価を出力する
				System.out.println("可");
			// score が 70 ~ 79 だった場合の処理
			} else if ( score >= 70 && score <= 79 ){
				// 「良」という評価を出力する
				System.out.println("良");
			// score が 80 ~ 89 だった場合の処理
			} else if ( score >= 80 && score <= 100 ){
				// 「優」という評価を出力する
				System.out.println("優");
			// 0 ~ 100 以外の値が入った場合の処理
			} else if ( score < 0 || score > 100 ) {
				// 「正しい値を入力してください」
				System.out.println("正しい値を入力してください。");
			}
		// 整数でない入力があった場合の処理
		} else {
			System.out.println("入力された値が不正です。");
		}
		
	}
}
