package com.lox.inventoryservice.api.models.page;

import com.lox.inventoryservice.api.models.Inventory;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryPage {

    private List<Inventory> inventories;
    private long totalElements;
    private int totalPages;
    private int currentPage;
    private int pageSize;
}