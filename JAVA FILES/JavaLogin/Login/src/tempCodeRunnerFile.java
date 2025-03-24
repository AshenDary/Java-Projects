public class App {
    public static void main(String[] args) {
        IdAndPassword idAndPassword = new IdAndPassword();

        Login login = new Login(idAndPassword.getLoginInfo());




    }
}
