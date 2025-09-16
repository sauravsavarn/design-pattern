package in.designpattern.behavioural.command.eg1;

public class UnixFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file in unix-os");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in unix-os");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in unix-os");
    }
}
