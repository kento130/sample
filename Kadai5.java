import java.util.Random;

public class Kadai5 {
    public static void main(String args []){
	Random rand = new Random();
	int num;
	// int カウント変数(0で初期化)
	int cnt = 0;

	System.out.println("出た整数はこちら：");
	for (int i=0; i<10; i++){
	    num = (int)(Math.random() * 1000);
	    // でた数字をプリント
	    System.out.print(num + " ");
	    // もしnum %3(numを３で割った余りが0 なら)
	    if (num %3 == 0){
		// カウント変数を++ (インクリメント)する
		cnt++;
	    }
	}
	// 合計の個数をプリント
	System.out.println("\n3で割り切れる数は合計 " + cnt + " 個です");
    }
}
