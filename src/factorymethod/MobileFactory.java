package factorymethod;

/**
 *
 */
public class MobileFactory {

    public static Mobile getMobile(MobileType mobileType) {
        switch (mobileType) {
            case TYPE_ANDROID:
                return new AndroidMobile();
            case TYPE_IOS:
                return new IOSMobile();
            case TYPE_WINDOWS:
                return new WindowsMobile();
            case  TYPE_SYMBIAN:
                return new SymbianMobile();
                default:
                    throw new RuntimeException("Mobile type not supported");
        }
    }
}

abstract class Mobile {

    MobileType mMobileType;

    public Mobile(MobileType mMobileType) {
        this.mMobileType = mMobileType;
    }

    /**
     *   Print mobile type
     */
    abstract public void printMobile();
}

enum MobileType {
    TYPE_ANDROID, TYPE_IOS, TYPE_WINDOWS, TYPE_SYMBIAN
}

class AndroidMobile extends Mobile {

    public AndroidMobile() {
        super(MobileType.TYPE_ANDROID);
    }

    @Override
    public void printMobile() {
        System.out.println("Android Mobile");
    }
}


class IOSMobile extends Mobile {

    public IOSMobile() {
        super(MobileType.TYPE_IOS);
    }

    @Override
    public void printMobile() {
        System.out.println("IOS Mobile");
    }
}

class WindowsMobile extends Mobile {

    public WindowsMobile() {
        super(MobileType.TYPE_WINDOWS);
    }

    @Override
    public void printMobile() {
        System.out.println("Windows Mobile");
    }
}

class SymbianMobile extends Mobile {

    public SymbianMobile() {
        super(MobileType.TYPE_SYMBIAN);
    }

    @Override
    public void printMobile() {
        System.out.println("Symbian Mobile");
    }
}
