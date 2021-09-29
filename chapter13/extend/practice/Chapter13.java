package extend.practice;

import extend.phone.MobilePhone02;
import extend.phone.Phone02;

public class Chapter13{
  public static void main(String[] args){
    MobilePhone02 mobilePhone = new MobilePhone02("000-1111-2222");
    mobilePhone.takePicture();
    Chapter13.staticCall(mobilePhone, "99-8888-7777");
    mobilePhone.powerOff();

    FlyingPhone flyingPhone = new FlyingPhone(5);
    flyingPhone.fly();
    Chapter13.staticCall(flyingPhone, "000-1111-2222");
    flyingPhone.powerOff();
  }

  public static void staticCall(Phone02 phone, String number){
    phone.call(number);
  }
}