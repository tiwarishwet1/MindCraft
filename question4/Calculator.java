package question4;

public class Calculator {
    int add(int... numbers) {

        int sum = 0;

        for (int n : numbers) {
            sum = sum + n;
        }

        return sum;
    }
}
