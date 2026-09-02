import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Hvad skal din karakter hedde?");
    String name = input.nextLine();
    System.out.println("Hvor gammel er din karakter?");
    int age = input.nextInt();
    System.out.println("Vælg din karakters styrke");
    int strength = input.nextInt();
    System.out.println("Vælg din karakters intelligens");
    int intelligence = input.nextInt();
    System.out.println("Vælg din karakters level");
    int level = input.nextInt();

    double magicPower = (strength*0.25+intelligence)*level;
    int totalPower = (strength*2+intelligence) * level;
    boolean youngHero = age < 25;

    System.out.println("==============================");
    System.out.println("         Din Karakter         ");
    System.out.println("==============================");
    System.out.println("Name: " + name);
    System.out.println("Initial: " + name.charAt(0));
    System.out.println("Age: " +age);
    System.out.println("Strength: "+ strength);
    System.out.println("Intiligence: " + intelligence);
    System.out.println("Level: " + level);
    System.out.println();
    System.out.println("Magic power: " + magicPower);
    System.out.println("Total power:" + totalPower);
    System.out.println("Young hero: " + youngHero);
    System.out.println("==============================");
}