package mw_templates;

public interface IMyList<T> {
    void add(T value);
    T get(int index);
    int size();
}
