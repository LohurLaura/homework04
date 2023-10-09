public class Main {
    public static void main(String[] args) {
        //Car
        Car firstCar = new Car();
        firstCar.brand = "Lexus";
        firstCar.model = "IS300H";
        firstCar.year = 2015;
        System.out.println(firstCar.brand);
        System.out.println(firstCar.model);
        System.out.println(firstCar.year);
        firstCar.startEngine();
        firstCar.stopEngine();

        //Calculator
        Calculator calculator = new Calculator();
        int calcSum = calculator.calcSum(2,3);
        System.out.println("Calculate the sum of 2 and 3: " + calcSum);

        boolean isGreater = calculator.isGreater(6,3);
        System.out.println("6 is bigger than 3: " + isGreater);

        //Number Manipulator
        NumberManipulator manipulator = new NumberManipulator();
        int number = 5;
        System.out.println("Initial number: " + number);

        int incrementedNumber = manipulator.incrementByOne(number);
        System.out.println("Number after increment: " + incrementedNumber);

        int decrementedNumber = manipulator.decrementByOne(number);
        System.out.println("Number after decrement: " + decrementedNumber);
    }
}