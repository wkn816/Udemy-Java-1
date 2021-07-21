class Ex1_1_1 {
	public static void main (String[] args) {

		int coinNum = args.length -1 ;          //投入された硬貨の枚数
		int coinChk = 0 ;                    //チェック対象の硬貨の金額
		int coinSum = 0 ;                    //投入された硬貨の合計金額 ※使用可能な硬貨のみで算出


	for(int i = 0 ; i < coinNum ; i++) {
		coinChk = Integer.parseInt(args[i]) ;

		if( coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500) {
			coinSum += coinChk;
		}else if(coinChk == 1 || coinChk == 5) {
			System.out.println("警告：" + coinChk + "円玉は使えません");
		}else {
			System.out.println("警告：" + coinChk + "は硬貨として適切な値ではありません");
		}
	}

	//お釣りの計算（合計金額ー商品の値段）
	int price = Integer.parseInt(args[args.length -1]);
	int change = coinSum - price ;
	System.out.println("ただいまの投入金額は" + coinSum + "円です");
	System.out.println("お釣りは" + change + "円ですりがとう");


	}
}

