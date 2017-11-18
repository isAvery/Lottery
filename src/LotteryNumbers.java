import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private int lotNumber;
    
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int i = 0;
        while (i < 7) {
            this.lotNumber = this.random.nextInt(39);
            if (this.containsNumber(this.lotNumber) == true){
                this.numbers.add(this.lotNumber);//add picked number into numbers array
                System.out.println("jj");
                i++;
        } else {
                i += 0;
            }
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
        
    }
}
