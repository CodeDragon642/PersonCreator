public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("James Peterson",34, 180, 73.5);
        Person person2 = new Person("Bob Thornley",25, 171, 68.2);

        System.out.print("Name: " + person1.getName()+ " ");
        System.out.print("Age: " + person1.getAge() + "yrs ");
        System.out.print("Height: " + person1.getHeight() + "cm ");
        System.out.println("Weight: " + person1.getWeight() + "lbs ");

        //System.out.print("Name: " + person2.getName() + " ");
        //System.out.print("Age: " + person2.getAge() + "yrs ");
        //System.out.print("Height: " + person2.getHeight() + "cm ");
        //System.out.println("Weight: " + person2.getWeight() + "lbs ");

        System.out.println("A year has passed, James has grown older.");
        person1.growOlder();
        System.out.print("Name: " + person1.getName()+ " ");
        System.out.print("Age: " + person1.getAge() + "yrs ");
        System.out.print("Height: " + person1.getHeight() + "cm ");
        System.out.println("Weight: " + person1.getWeight() + "lbs ");
    }
}