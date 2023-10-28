package CC30.lib.src.main.java.cc30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<K, V> {
    ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;  // using ArrayList instead of array so we can instantiate with a parameterized type
    int size;

    public HashMap(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("HashMap size must be 1 or greater!");
        }

        this.size = size;
        this.bucketArrayList = new ArrayList<>(size);

        // Next part is not required, and is a little inefficient, but it makes writing HashMap operations easier
        for (int i = 0; i < this.size; i++) {
            bucketArrayList.add(i, new LinkedList<>());
        }
    }

    public void set(K key, V value) {
        int bucket = hash(key);
        for (HashMapPair<K, V> pair : bucketArrayList.get(bucket)) {
            if (pair.getKey().equals(key)) {
                pair.setValue(value);
                size++;
                return;
            }
        }
        bucketArrayList.get(bucket).add(new HashMapPair<>(key, value));
        size++;
    }

    public V get(K key) {
        int bucket = hash(key);
        for (HashMapPair<K, V> pair : bucketArrayList.get(bucket)) {
            if (pair.getKey().equals(key)) {
                return (V) pair.getValue();
            }
        }
        return null;
    }

    public boolean contains(K key) {
        int bucket = hash(key);
        for (HashMapPair<K, V> pair : bucketArrayList.get(bucket)) {
            if (pair.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public List<K> keys() {
        List<K> keys = new ArrayList<>();
        for (int i = 0; i < bucketArrayList.size(); i++) {
            for (HashMapPair<K, V> pair : bucketArrayList.get(i)) {
                keys.add((K) pair.getKey());
            }
        }
        return keys;
    }

    public int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }

}
