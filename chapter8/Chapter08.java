// 1「while」文
// ・1以上5未満の数の2乗を出力
// 2 通常「for」文
// 　・要素数が4の「int」配列を初期化
// 　・配列のサイズ分ループして、要素を出力
// 　　※ 配列のサイズは「変数名.length」で取得が可能
// 3 拡張「for」文
// 　・「2.」の配列をループ
// 　・要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力

public class Chapter08{
    public static void main(String[] args){
      int num = 1;
      int number = 0;
      while (num < 5){
        number = num++;
        System.out.println(number * number);
      }

      int array[] = {1, 2, 3, 4};
      for (int i = 0; i < array.length; i++){
         System.out.println(array[i]);
      }

      for(int number2 : array){
        if(number2 % 2 == 0){
          continue;
        }
        System.out.println(number2);
      }
    }
}