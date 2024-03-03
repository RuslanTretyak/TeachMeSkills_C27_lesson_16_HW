package order;

import client.Client;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CurrentOrder {
    private static final Map<String, Client> clientWithOrder = new TreeMap<>();

    public static void addClientWithOrder(Client client) {
        clientWithOrder.put(client.getPassNumber(), client);
    }

    public static void printPairWithMapEntry() {
        System.out.println("___ключ-значение, используя Map.Entry<K, V> entry : map.entrySet()___\n");
        for (Map.Entry<String, Client> entry : clientWithOrder.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();

    }

    public static void printPairWithIterator() {
        System.out.println("___ключ-значение, используя итератор___\n");
        Iterator<Map.Entry<String, Client>> iterator = clientWithOrder.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public static void printKeys() {
        System.out.println("все ключи: " + clientWithOrder.keySet());
        System.out.println();
    }

    public static void printValues() {
        System.out.println("все значения: " + clientWithOrder.values());
        System.out.println();

    }
}
