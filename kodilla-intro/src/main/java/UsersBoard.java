public class UsersBoard {
    public static void main(String[] args) {

        User asia = new User("Asia", 20);
        User romek = new User("Romek", 31);
        User ola = new User("Ola", 26);
        User natalia = new User("Natalia", 55);
        User[] users =  {asia, romek, ola, natalia};
        System.out.println(asia.name);
    }
}