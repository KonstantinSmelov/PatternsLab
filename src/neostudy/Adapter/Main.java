package neostudy.Adapter;

public class Main {

    public static void main(String[] args) {
        UsbFlash usbFlash = new UsbFlash();
        SdFlash sdFlash = new SdFlash("музыка");
        Computer computer = new Computer();
        SdToUsbAdapter adapter = new SdToUsbAdapter(sdFlash);

        computer.readInfo(usbFlash);
        computer.readInfo(adapter);
    }

}
