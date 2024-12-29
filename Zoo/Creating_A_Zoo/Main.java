import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // Menu choice
        Animal selectedAnimal = null;

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    selectedAnimal = new Tiger("Tiger", 40, 60, 80);
                    break;

                case 2:
                    selectedAnimal = new Dolphin("Dolphin", "Gray", 40);
                    break;

                case 3:
                    selectedAnimal = new Penguin("Penguin", 5, "Black and White", 15);
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
                    continue;
            }

            do {
                int menuChoice = animalDetailsManipulationMenu(keyboard, selectedAnimal);

                switch (menuChoice) {
                    case 1:
                        System.out.println("Setting properties is currently not supported.");
                        break;

                    case 2:
                        if (selectedAnimal instanceof Walk) {
                            ((Walk) selectedAnimal).walking();
                        } else {
                            System.out.println("This animal cannot walk.");
                        }
                        break;

                    case 3:
                        if (selectedAnimal instanceof Eat) {
                            ((Eat) selectedAnimal).eatingFood();
                            ((Eat) selectedAnimal).eatingCompleted();
                        } else {
                            System.out.println("This animal cannot eat.");
                        }
                        break;

                    case 4:
                        if (selectedAnimal instanceof Swim) {
                            ((Swim) selectedAnimal).swimming();
                        } else {
                            System.out.println("This animal cannot swim.");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

                System.out.println("Continue with this animal? (Enter 1 for yes/ 2 for no):");
                continueInnerLoop = keyboard.nextInt();
            } while (continueInnerLoop == 1);

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();
        } while (continueOuterLoop == 1);

        keyboard.close();
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");
        System.out.println("Enter choice of animal:");
        return keyboard.nextInt();
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");
        System.out.println("5. Display swimming");
        System.out.println("Enter choice (1-5):");
        return keyboard.nextInt();
    }
}


