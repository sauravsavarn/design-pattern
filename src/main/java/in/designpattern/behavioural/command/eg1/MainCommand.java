package in.designpattern.behavioural.command.eg1;

public class MainCommand {
    public static void main(String[] args) {
        WindowsFileSystemReceiver windowsFileSystemReceiver = new WindowsFileSystemReceiver();

        /// ////// lets try to invoke FileSystemReceiver in Windows env.
        OpenFileCommand openFileCommand = new OpenFileCommand(windowsFileSystemReceiver);
        WriteFileCommand writeFileCommand = new WriteFileCommand(windowsFileSystemReceiver);
        CloseFileCommand closeFileCommand = new CloseFileCommand(windowsFileSystemReceiver);


        /// // oepn a file using command pattern
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();


        /// // write to file using command pattern
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        ///  // close file using command pattern
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();


    }
}
