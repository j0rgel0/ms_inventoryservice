// src/main/java/com/lox/inventoryservice/api/models/responses/ErrorResponse.java

package com.lox.inventoryservice.api.models.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
    private String message;
    private String details;
}