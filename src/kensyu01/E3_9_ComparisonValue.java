package kensyu01;

// 入力された値を取得する為の機能の読み込み
import java.util.Scanner;

// 入力された2つの実数を比較して大きい方の値を出力するクラス
public class E3_9_ComparisonValue {
	
	// 入力された2つの実数を比較して大きい方の値を出力する処理
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成
		Scanner stdIn = new Scanner(System.in);
		
		// 実数値の入力を促すメッセージを出力
		System.out.print("実数値 a を入力してください : ");
		// 入力された値を取得し変数aに保持する
		double a = stdIn.nextDouble();
		
		// 実数値の入力を促すメッセージを出力
		System.out.print("実数値 b を入力してください : ");
		// 入力された値を変数bに保持する
		double b = stdIn.nextDouble();
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
		// aとbを比較して大きい方の値を出力する
		System.out.println("大きい方の値は" + ( a > b ? a : b) + "です。");
		
	}
}
