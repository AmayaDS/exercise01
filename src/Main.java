public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Amaya", 22);
        Person person2 = new Person("Sam", 22);
        System.out.println("Name is" +person1.getName() + "Age is" + person1.getAge());
        System.out.println("Name is" +person2.getName() + "Age is" + person2.getAge());
    }
}