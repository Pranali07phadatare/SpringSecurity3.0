package com.neosoft.repository;



import com.neosoft.model.Customer;
import com.neosoft.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

//    @Transactional
//    @Modifying
//    @Query("UPDATE Customer c SET c.name = :name, c.orders = :orders WHERE c.id = :id")
//    void updateCustomer(@Param("name") String name, @Param("orders") int orders, @Param("id") int id);

}