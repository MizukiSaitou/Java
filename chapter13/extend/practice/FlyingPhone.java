package extend.practice;

import extend.phone.Phone02;
import extend.practice.Flying;

public class FlyingPhone implements Phone02, Flying{
  private int minute;

  public FlyingPhone(int minute){
    this.minute = minute;
  }

  public void call(String number){
    System.out.println(number + "に電話をします。通話できるのは飛んでいる間だけです。");
  }

  public void fly() {
        System.out.println(minute + " 分間、飛びます。 ");
    }

    public void powerOff() {
        Flying.super.powerOff();
    }
}