package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

        public class FixedList<T> {
            private final int maxSize;
            private ArrayList <T> items;

            public FixedList(int maxSize) {
                this.maxSize = maxSize;
                this.items = new ArrayList<>();
            }

            public void add(T item) {
                if (items.size() == maxSize) {
                    System.out.println("cannot add item: maximum reached" + maxSize);
                    return;
                }
                items.add(item);
            }

            public List<T> getItems() {
                return items;
            }
        }

