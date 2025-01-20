package lecture.java.absstract;

// Practice
// 아래 Device 추상 클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

abstract class Device {
    /**
     *  추상 클래스는 반드시 오버라이딩 해야하는 메서드와 필드로 이루어짐 -> 하지만 제약을 걸기 어렵다는 단점이 있음
     */
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class UsbPort1 extends Device {

    public UsbPort1(int deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    void deviceInfo() {
        System.out.println("USB");
    }

    @Override
    void connect() {
        System.out.println("CONNECTBYUSB");
    }

    @Override
    void disconnect() {
        System.out.println("DISCONNECTBYUSB");
    }

    @Override
    void send() {
        System.out.println("SENDBYUSB");
    }

    @Override
    void receive() {
        System.out.println("RECEIVEBYUSB");
    }
}


// WiFi 클래스
class WiFi extends Device {

    int deviceId;

    public WiFi(int deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    void deviceInfo() {
        System.out.println("WIFI");
    }

    @Override
    void connect() {
        System.out.println("CONNECTBYWIFI");
    }

    @Override
    void disconnect() {
        System.out.println("DISCONNECTBYWIFI");
    }

    @Override
    void send() {
        System.out.println("SENDBYWIFI");
    }

    @Override
    void receive() {
        System.out.println("RECEIVEBYWIFI");
    }
}


public class Practice {

    public static void main(String[] args) {
        // Test code
        UsbPort1 usb1 = new UsbPort1(1);
        WiFi wifi = new WiFi(0);
    }

}
