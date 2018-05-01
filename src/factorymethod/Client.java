package factorymethod;

public class Client {
    public static void main(String str[]) {
       Mobile android, ios, windows, symbian;
       android = MobileFactory.getMobile(MobileType.TYPE_ANDROID);
       ios = MobileFactory.getMobile(MobileType.TYPE_IOS);
       windows = MobileFactory.getMobile(MobileType.TYPE_WINDOWS);
       symbian = MobileFactory.getMobile(MobileType.TYPE_SYMBIAN);

       android.printMobile();
       windows.printMobile();
       ios.printMobile();
       symbian.printMobile();
    }
}
