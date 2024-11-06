package Facade;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println();
        return new byte[size];
    }
}
