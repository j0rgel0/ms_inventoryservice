// src/main/java/com/lox/inventoryservice/api/kafka/events/InventoryAddedEvent.java

package com.lox.inventoryservice.api.kafka.events;

import com.lox.inventoryservice.api.models.Inventory;
import java.time.Instant;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryAddedEvent implements Event {

    private String eventType;
    private UUID inventoryId;
    private UUID productId;
    private Integer availableQuantity;
    private Integer reservedQuantity;
    private Instant timestamp;

    @Override
    public String getEventType() {
        return eventType;
    }

    @Override
    public UUID getProductId() {
        return productId;
    }

    @Override
    public Instant getTimestamp() {
        return timestamp;
    }

    public static InventoryAddedEvent fromInventory(Inventory inventory) {
        return InventoryAddedEvent.builder()
                .eventType(EventType.INVENTORY_ADDED.name())
                .inventoryId(inventory.getInventoryId())
                .productId(inventory.getProductId())
                .availableQuantity(inventory.getAvailableQuantity())
                .reservedQuantity(inventory.getReservedQuantity())
                .timestamp(Instant.now())
                .build();
    }
}
