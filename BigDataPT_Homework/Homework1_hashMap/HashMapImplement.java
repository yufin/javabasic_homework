public class HashMapImplement<K, V> {

    private class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    private final int SIZE = 50;

    private Entry<K, V> table[];

    public HashMapImplement() {
        table = new Entry[SIZE];
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];

        if (e == null) {
            table[hash] = new Entry<K, V>(key, value);
        } else {
            while (e.next != null) {
                if (e.getKey() == key) {
                    e.setValue(value);
                    return;
                }
                e = e.next;
            }
            if (e.getKey() == key) {
                e.setValue(value);
                return;
            }
            e.next = new Entry<K, V>(key, value);
        }
    }

    public V get(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];

        if (e == null){
            return null;
        }

        while (e != null) {
            if (e.getKey() == key) {
                return e.getValue();
            }
            e = e.next;
        }
        return null;
    }

    public Entry<K, V> remove(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];

        if (e == null) {
            return null;
        }

        if (e.getKey() == key) {
            table[hash] = e.next;
            e.next = null;
            return e;
        }

        Entry<K, V> prev = e;
        e = e.next;

        while (e != null) {
            if (e.getKey() == key) {
                prev.next = e.next;
                e.next = null;
                return e;
            }
            prev = e;
            e = e.next;
        }
        return null;
    }

}