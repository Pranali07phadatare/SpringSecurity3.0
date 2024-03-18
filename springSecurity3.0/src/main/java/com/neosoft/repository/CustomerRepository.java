package com.neosoft.repository;



import com.neosoft.model.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE Customer c SET c.name = :name, c.orders = :orders WHERE c.id = :id")
    void updateCustomer(@Param("name") String name, @Param("orders") int orders, @Param("id") int id);

}