/*-< 演習：Ex1_15_1 >---------------------------------
BigDecimalの扱いについてAPIドキュメントなどで調べながら
以下の結果が表示されるプログラムを作ってみましょう！
----------------------------------------------------*/
import java.math.BigDecimal;

class Ex1_15_1{
	public static void main (String[] args) {

		//(1) 0.2 * 83 - 10.6
		BigDecimal b1 = new BigDecimal("0.2");
		BigDecimal b2 = new BigDecimal("83");
		BigDecimal b3 = new BigDecimal("10.6");

		BigDecimal all4 = (b1.multiply(b2)).subtract(b3);

		System.out.println(all4);





		//(2) 0.2 * 83 - 10.6 / 3　※小数第4位までで表示（小数第5位以下は四捨五入）
		//<補足>
		// BigDecimalによる割り算は丸めの指定が必要です！
		// XXX ÷ YYYをして小数第2位で表示（小数第3位以下は切り捨て）
		// XXX.divide(YYY, 2, RoundingMode.DOWN);
		BigDecimal a1 = new BigDecimal("0.2");
		BigDecimal a2 = new BigDecimal("83");
		BigDecimal a3 = new BigDecimal("10.6");
		BigDecimal a4 = new BigDecimal("3");

		BigDecimal all5 = (a1.multiply(a2)).subtract(a3.divide(a4,4,BigDecimal.ROUND_HALF_UP));
		System.out.println(all5);






	}
}
