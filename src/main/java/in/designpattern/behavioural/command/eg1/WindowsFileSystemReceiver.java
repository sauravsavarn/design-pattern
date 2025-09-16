package in.designpattern.behavioural.command.eg1;

public class WindowsFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file in windows-os");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in windows-os");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in windows-os");
    }
}
