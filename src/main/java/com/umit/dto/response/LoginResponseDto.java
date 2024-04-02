package com.umit.dto.response;

import com.umit.utility.EStatus;
import com.umit.utility.EUserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginResponseDto {
    String email;
    String password;
    EStatus status;
    EUserType userType;
}
