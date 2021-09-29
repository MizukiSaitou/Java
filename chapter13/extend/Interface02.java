package extend;

import extend.phone.MobilePhone02;

public class Interface02 {
    public static void main(String[] args) {
        MobilePhone02 mobilePhone = new MobilePhone02("000-1111-2222");
        // Phoneインターフェースのデフォルトメソッドの呼び出し
        mobilePhone.powerOff();
    }
}