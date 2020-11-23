package JavaCore.les7213;

import java.util.AbstractMap;

import java.util.*;
import java.util.List;

public class Map<K, V> extends HashMap<K, V> {

    @Override
    public V get(Object key) {
        return super.get(key) == null ? (V) Collections.EMPTY_LIST : super.get(key);
    }
}
