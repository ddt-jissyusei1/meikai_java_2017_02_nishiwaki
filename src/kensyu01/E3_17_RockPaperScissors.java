package kensyu01;

// 乱数を生成する為の機能を読み込む
import java.util.Random;

// 0,1,2 の何れかの乱数を生成し 値に応じてグーチョクパーを表示するクラス
public class E3_17_RockPaperScissors {

	// 乱数の書く値によって 0 → グー, 1 → チョキ, 2 → パー を表示する為の処理を行う
	public static void main (String[] arg) {
		
		// 乱数を生成するオブジェクトの作成する
		Random rand = new Random();
		
		// 0 ~ 2 まで乱数を生成し、保持する
		int result = rand.nextInt(3);
		
		// 乱数の値によって処理を振り分ける
		switch ( result ) {
		
			// 値が0の場合、「グー」を出力する
			case 0 : System.out.println("グー");
					 // 処理を終了する
					 break;
			
			// 値が1の場合、「チョキ」を出力する
			case 1 : System.out.println("チョキ");
					 // 処理を終了する
					 break;
			
			// 値が2の場合、「パー」を出力する
			case 2 : System.out.println("パー");
					 // 処理を終了する
					 break;
			
		}
		
		
	}
}
