package com.example.BackEndSpringBoot.Response;

import lombok.Data;
import lombok.NonNull;

@Data
public class response {
    @NonNull
    private String message;

    public response(String message) {
        this.message = message;
    }
}
