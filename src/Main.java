public class Main {
    public static void main(String[] args) {
        String brand;
        String model;
        int year;

        public void startEngine() { System.out.println("Wroom-wroom, the engine has started."); }
        public void stopEngine() { System.out.println("The engine has stopped."); }



    NumberManipulator manipulator = new NumberManipulator();
        int number = 5;
        System.out.println("Initial number: " + number);

        int incrementedNumber = manipulator.incrementByOne(number);
        System.out.println("Number after increment: " + incrementedNumber);

        int decrementedNumber = manipulator.decrementByOne(number);
        System.out.println("Number after decrement: " + decrementedNumber);

    }
}