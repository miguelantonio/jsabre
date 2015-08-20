package cl.bithaus.sabre.cache;

import cl.bithaus.sabre.exceptions.SabreException;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Miguel A. Fuentes Buchholtz
 * @param <K>
 * @param <V>
 * @email miguel@variacode.com
 */
public class SabreTimeCache<K, V> implements SabreCacheInterface<K, V> {

    private final Cache<K, V> cache;
    // si no está hace el trabajo "duro" esto podría cambiar la verdad
    private final Callable<V> callable;

    /**
     *
     * @param readExpireMiliseconds
     * @param size
     */
    public SabreTimeCache(long readExpireMiliseconds, long size) {
        this(readExpireMiliseconds, size, null);
    }

    /**
     *
     * @param readExpireMiliseconds
     * @param size
     * @param callable
     */
    public SabreTimeCache(long readExpireMiliseconds, long size, Callable<V> callable) {
        cache = CacheBuilder.newBuilder()
                // eliminará los menos usados si lleg al límite
                .maximumSize(size)
                //Para que se eliminen después de X milisegundos desde su última lectura
                .expireAfterAccess(readExpireMiliseconds, TimeUnit.MILLISECONDS)
                .build();
        this.callable = callable;
    }

    /**
     *
     * @param key
     * @return
     */
    @Override
    public V get(K key) {
        return cache.getIfPresent(key);
    }

    /**
     *
     * @param key
     * @return
     * @throws ExecutionException
     */
    @Override
    public V getIfNullUseCallable(K key) throws ExecutionException {
        if (callable == null) {
            throw new ExecutionException(new SabreException("Callable no configurado"));
        }
        return cache.get(key, callable);
    }

    /**
     *
     * @param key
     * @param value
     */
    @Override
    public void put(K key, V value) {
        cache.put(key, value);
    }

}
