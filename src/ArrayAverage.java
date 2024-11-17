public class ArrayAverage {

    public static double calculateAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.err.println("Массив пуст или равен нулю");
            return Double.NaN;// Возвращаем NaN для пустого массива
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,5};
        double sum;

        try {
            sum = calculateAverage(arr);
            if (Double.isInfinite(sum)) { // Проверка на бесконечность
                System.err.println("Ошибка: деление на ноль.");
            } else {
                System.out.println("Среднее арифметическое " + sum);
            }
        } catch (Exception a) {
            System.err.println("Другая причина ошибки" + a.getMessage());
        }
    }
}