public class Box extends Thread {
    private volatile boolean io = false;

    public boolean isIo() {
        return io;
    }

    public synchronized void setOpen() {
        io = true;
        System.out.println(currentThread().getName() + "  opened ");
    }

    public synchronized void setClose() {
        io = false;
        System.out.println(currentThread().getName() + "  closed");
    }

    @Override
    public void run() {

        while (!isInterrupted()) {
            if (isIo()) {
                setClose();
            }
        }
    }
}
