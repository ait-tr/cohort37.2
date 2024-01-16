public class Box4<K,V>  {
    private K key;
    private V value;

    public Box4(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box4{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
