package app.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Queue<String> products = getInitData();
        getOutput("Initial data:", products);
        updateData(products);
        getOutput("Updated data:", products);
    }

    public static Queue<String> getInitData() {
        return new LinkedList<>(List.of("apricot", "mango", "cherry", "rice"));
    }

    public static void updateData(Queue<String> products) {
        products.poll();
    }

    public static void getOutput(String title, Queue<String> products) {
        System.out.println(title);
        AtomicInteger counter = new AtomicInteger(1);
        products.forEach(product -> System.out.println(counter.getAndIncrement() + ") " + product));
        System.out.println();
    }
}
