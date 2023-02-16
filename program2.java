// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class program2 {
    public static List<Integer> getRandomList(int size) {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100));
        }
        System.out.println(randomList.toString());
        return randomList;
    }

    public static void getResult(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        int count = list.size();
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        double result = sum / count;
        System.out.printf("Минимальное: %d \nМаксимальное: %d \nСреднее арифметичское: %.2f", min, max, result);
    }

    public static void main(String[] args) {
        getResult(getRandomList(10));
    }
}