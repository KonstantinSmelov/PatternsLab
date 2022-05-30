package neostudy.Adapter;

public class SdToUsbAdapter extends UsbFlash {

    private final String string;

    public SdToUsbAdapter(SdFlash sdFlash) {
        this.string = sdFlash.getInfo();
    }

    @Override
    public String data() {
        return string;
    }
}
