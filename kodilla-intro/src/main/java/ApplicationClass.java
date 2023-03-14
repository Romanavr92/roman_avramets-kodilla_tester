public class ApplicationClass {
    public static void main(String[] args) {
        Application human= new Application("Romek",31.5,178.5);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.height);
        human.checkHuman();

    }
}
