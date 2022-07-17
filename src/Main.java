public class Main {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        User user = new User(box);
        box.setName("BOX");
        user.setName("User");
        box.start();
        user.start();
        user.join();
        box.interrupt();
    }
}
