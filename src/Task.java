public class Task {

    /**
     * Сортировка объектов простыми вставками в заданном диапазоне
     *
     * @param data Сортируемый массив типа T
     * @param from Индекс первого элемента диапазона
     * @param to Индекс элемента, следующего за последним элементом диапазона
     * @param <T> Сравнимый тип элементов массива
     * @throws Exception Неверный диапазон
     */
    public static <T extends Comparable<T>> void sort(T[] data, int from, int to) throws Exception {
        if (from >= 0 && to >= 0 && from != to) {
            if (from < to) {

                for (int i = from; i < to; i++) {
                    T value = data[i];
                    // поиск места элемента в готовой последовательности
                    int j;
                    for (j = i - 1; j >= from && data[j].compareTo(value) > 0; j--) {
                        data[j + 1] = data[j];     // сдвигаем элемент направо, пока не дошли
                    }
                    // место найдено, вставить элемент
                    data[j + 1] = value;
                }
            } else {
                for (int i = to; i < from; i++) {
                    T value = data[i];
                    int j;
                    for (j = i - 1; j >= to && data[j].compareTo(value) < 0; j--) {
                        data[j + 1] = data[j];
                    }
                    data[j + 1] = value;
                }
            }
        } else {
            throw new Exception("You entered the wrong range.");
        }
    }
}