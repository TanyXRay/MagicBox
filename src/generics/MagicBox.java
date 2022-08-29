package generics;

import java.util.Random;

/**
 * Класс, который умеет выбирать случайным образом один из сохранённых в него объектов.
 */
public class MagicBox<T> {

    private Random random = new Random();
    private T[] items;

    public MagicBox(int size) {
        this.items = (T[]) new Object[size];
    }

    /**
     * Метод добавляет в коробку объекты.
     *
     * @param item - объект.
     * @return true, если массив не заполнен, false, если массив заполнен.
     */
    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    /**
     * Метод рандомно вытаскивает из коробки объект.
     *
     * @return item - объект.
     * @throws RuntimeException
     */
    public T pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                int result = items.length - i;
                throw new RuntimeException("Коробка не полная, осталось ещё " + result + " ячеек заполнить");
            }
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}
