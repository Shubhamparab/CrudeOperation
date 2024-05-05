package com.example.crudeOperations.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crudeOperations.userModel.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}