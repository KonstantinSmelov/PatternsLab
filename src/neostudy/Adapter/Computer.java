package neostudy.Adapter;

public class Computer {

    public void readInfo(UsbFlash usbFlash) {
        System.out.println("Компьютер прочитал с флешки: " + usbFlash.data());
    }
}
