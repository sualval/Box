public class User extends Thread {

    private Box box;
private int switchingFrequency =1000;
private int countAmount =5;
    public User(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
       while (countAmount>0) {
           try {box.setOpen();
               Thread.sleep(switchingFrequency);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           } countAmount--;
       }
        currentThread().interrupt();
    }
}
