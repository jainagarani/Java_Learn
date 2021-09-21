package designpattern.creational.builder;

public class Computer {
    //required parameters
    private String HDD;
    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }
    private Computer(ComputerBuilder computerBuilder){
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class ComputerBuilder{
        //required parameters
        private String HDD;
        private String RAM;

        //optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
       public ComputerBuilder (String HDD, String RAM ){
           this.HDD = HDD;
           this.RAM = RAM;
       }
       public ComputerBuilder setGraphicsEnabled(boolean isGraphicsCardEnabled){
           this.isGraphicsCardEnabled = isGraphicsCardEnabled;
           return this;
       }
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        public Computer build(){
           return new Computer(this);
        }

    }
}
