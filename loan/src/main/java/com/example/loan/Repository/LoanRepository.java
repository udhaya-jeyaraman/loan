package com.example.loan.Repository;

import com.sun.jdi.LongType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Long, Long> {
}
