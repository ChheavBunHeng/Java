public class e1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        SummingThread summingThread = new SummingThread(numbers);
        summingThread.start();
    }

    public static class SummingThread extends Thread {
        private final int[] numbers;

        public SummingThread(int[] numbers) {
            this.numbers = numbers;
        }

        public void run() {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("The sum is: " + sum);
        }
    }

}
