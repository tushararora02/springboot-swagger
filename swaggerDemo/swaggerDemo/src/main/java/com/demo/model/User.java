package com.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(name = "USER", description = "user model")
public class User {

    @Schema(name = "userId", description = "userId")
    private String userId;
    private String name;
    private String email;
    private String password;
}
