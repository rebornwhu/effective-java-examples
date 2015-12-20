package com.xiaolu.item29_heterogeneous_container;

import java.util.HashMap;

public class Favorites {

    HashMap<Object, Object> favorites = new HashMap<Object, Object>();

    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
        @SuppressWarnings("unchecked") T instance = (T) favorites.get(type);
        return instance;
    }

}
