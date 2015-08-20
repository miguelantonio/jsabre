package cl.bithaus.sabre.cache;

import java.util.concurrent.ExecutionException;

public interface SabreCacheInterface<K, V> {

    /**
     *
     * @param key
     * @return
     */
    public V get(K key);

    /**
     *
     * @param key
     * @return
     * @throws ExecutionException
     */
    public V getIfNullUseCallable(K key) throws ExecutionException;

    /**
     *
     * @param key
     * @param value
     */
    public void put(K key, V value);

}
