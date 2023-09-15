import java.util.ArrayList;
import java.util.List;

public class SelectionShort {
    public void performSelectionShortAndFindBiggestNumber() {
        // Finding Largest number from set of number
        // 43,23,54,7,63,56,98,64,33,90,23,58
        List<Integer> inputNumber = new ArrayList<>();
        inputNumber.add(43);
        inputNumber.add(23);
        inputNumber.add(54);
        inputNumber.add(7);
        inputNumber.add(63);
        inputNumber.add(56);

        System.out.println("Unsorted Number: " + inputNumber);

        for (int i = 1; i < inputNumber.size(); i++) {
            int x = inputNumber.get(i); // Store the current element
            int j = i - 1;
            while (j >= 0 && inputNumber.get(j) > x) {
                inputNumber.set(j + 1, inputNumber.get(j)); // shift element to the right
                j--;
            }
            // place the current element in the correct position
            inputNumber.set(j + 1, x);
        }
        System.out.println("Sorted Number:" + inputNumber);
        System.out.println("Largest Number: " + inputNumber.get(inputNumber.size() - 1));
    }
}
