package day5;

public class Sample501 {

	public static void main(String[] args) {
		double[] d = new double[3];
		double sum, avg;
		d[0] = 1.2;
		d[1] = 3.7;
		d[2] = 4.1;
		sum = 0.0;
		for(int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
			sum += d[i];
		}
		System.out.println();
		avg = sum/d.length;
		System.out.println("合計値" + sum);
		System.out.println("平均値" + avg);
		
		System.out.println("１〜６の間のランダムな６つの数字の平均の計算");
		int all = 0;
		for(int i = 0; i < 6; i++) {
			int dice = (int)(Math.random() * 6) + 1;
			System.out.println(dice);
			all += dice;
		}
		double one = all / 6;
		System.out.println("１〜６の間のランダムな６つの数字の平均は" + one );
	}

}
