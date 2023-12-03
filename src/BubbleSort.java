public class BubbleSort<T extends Comparable<T>> {

    public void bubbleSort(T[] array) {
        int n = array.length;
        boolean troca;
        
        do {
            troca = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    T temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    troca = true;
                }
            }
            n--;
        } while (troca);
    }

    public static void main(String[] args) {
        // Teste com Integer
        Integer[] arrayInteiros = {4, 2, 8, 1, 3};
        BubbleSort<Integer> bubbleInt = new BubbleSort<>();
        bubbleInt.bubbleSort(arrayInteiros);
        System.out.println("Bubble sort com inteiros:");
        imprimeArray(arrayInteiros);

        // Teste com Double
        Double[] arrayDouble = {4.2, 2.5, 8.1, 1.7, 3.3};
        BubbleSort<Double> bubbleDouble = new BubbleSort<>();
        bubbleDouble.bubbleSort(arrayDouble);
        System.out.println("Bubble sort com double");
        imprimeArray(arrayDouble);

        // Teste com Char
        Character[] arrayChar = {'d', 'b', 'h', 'a', 'c'};
        BubbleSort<Character> bubbleChar = new BubbleSort<>();
        bubbleChar.bubbleSort(arrayChar);
        System.out.println("Bubble sort com caracteres:");
        imprimeArray(arrayChar);
    }

    private static <T> void imprimeArray(T[] array) {
        for (T e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
