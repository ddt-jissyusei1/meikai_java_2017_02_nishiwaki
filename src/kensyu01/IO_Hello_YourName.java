package kensyu01;

// 入力した値を取得する機能の読み込み
import java.util.Scanner;

// 入力した名前に挨拶のメッセージを出力するクラス
public class IO_Hello_YourName {

	// 入力した名前に挨拶のメッセージを出力する処理
	public static void main(String[] arg){
		
		// 入力した値を取得するオブジェクトの作成
		Scanner stdIn = new Scanner(System.in);
		
		// 苗字の入力を促すメッセージの表示
		System.out.println("姓 : ");
		// 入力された文字列を変数に保持する
		String lastName = stdIn.nextLine();
		
		// 名前の入力を促すメッセージを表示
		System.out.println("名 : ");
		// 入力された文字列を変数に保持する
		String fastName = stdIn.nextLine();
		
		// 入力用ストリームを閉じる
		stdIn.close();
		
		// 挨拶のメッセージを出力する
		System.out.println("こんにちは" + lastName + fastName + "さん。");
		
	}
}