package com.patterns.behavioral.iterator;

/**
 * Created by Artemie on 14.01.2017.
 */
public class Repository implements Container {

    public String names[] = {"a", "s", "d"};

    @Override
    public Iterator getIterator() {
        return new RepositoryIterator();
    }

    class RepositoryIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            return this.hasNext() ? names[index++] : null;
        }
    }
}
