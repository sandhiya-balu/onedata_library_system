package demo.library_management.repository;

import demo.library_management.entity.Borrow;

import java.util.ArrayList;
import java.util.List;

public class BorrowRepository {
    private final List<Borrow> borrows = new ArrayList<>();

    public void save(Borrow borrow) {
        borrows.add(borrow);
    }

    public List<Borrow> findAll() {
        return new ArrayList<>(borrows);
    }

    public Borrow findById(int id) {
        return borrows.stream().filter(borrow -> borrow.getId() == id).findFirst().orElse(null);
    }

    public void update(int id, Borrow borrow) {
        Borrow existingBorrow = findById(id);
        if (existingBorrow != null) {
            borrows.remove(existingBorrow);
            borrows.add(borrow);
        }
    }

    public void deleteById(int id) {
        borrows.removeIf(borrow -> borrow.getId() == id);
    }
}
