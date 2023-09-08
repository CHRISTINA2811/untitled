public class Lesson9_1 {
    public static void main(String[] args) {
        
        try {
            int[] array;
            array = new int[2];
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);

            }
        } catch (ArrayIndexOutOfBoundsException esx2) {
            System.out.println("ошибка,невозможно обратиться к элементу массива");

        }

    }

}