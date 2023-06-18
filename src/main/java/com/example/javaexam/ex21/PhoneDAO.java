package com.example.javaexam.ex21;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PhoneDAO extends JpaRepository<Phone, Long> {

    Optional<Phone> findById(Long id);

    List<Phone> findAll();

    void deleteById(Long id);

    default void delete(Phone phone) {
        if (phone.getId() != 0) {
            deleteById(phone.getId());
        }
    }

    default boolean create(Phone phone) {
        if (phone != null) {
            save(phone);
            return true;
        }
        return false;
    }

    default Phone update(Phone phone) {
        if (phone != null && phone.getId() != 0) {
            return save(phone);
        }
        return null;
    }
}
