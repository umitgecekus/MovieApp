package com.umit.dto.response;

import com.umit.utility.EStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterResponseDto {
    String name;
    String surname;
    String email;
    EStatus status;
}
