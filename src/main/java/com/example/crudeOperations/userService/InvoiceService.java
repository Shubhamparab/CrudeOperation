package com.example.crudeOperations.userService;
import com.example.crudeOperations.userModel.Invoice;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface InvoiceService {
    Page<Invoice> getAllInvoices(Pageable pageable);
    Optional<Invoice> getInvoiceById(Long id);
    Invoice createInvoice(Invoice invoice);
    Invoice updateInvoice(Long id, Invoice invoiceDetails);
    void deleteInvoice(Long id);
}

