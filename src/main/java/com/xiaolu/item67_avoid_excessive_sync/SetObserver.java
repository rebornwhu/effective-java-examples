package com.xiaolu.item67_avoid_excessive_sync;

public interface SetObserver<E> {
    void added(ObservableSet<E> set, E element);
}