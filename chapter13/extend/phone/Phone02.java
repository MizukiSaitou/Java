package extend.phone;

public interface Phone02 {
    final int MAX_NUMBER_DIGITS = 11;

    void call(String number);

    // defaultメソッドの宣言
    default void powerOff() {
        System.out.println("電源を切ります。");
    }
}