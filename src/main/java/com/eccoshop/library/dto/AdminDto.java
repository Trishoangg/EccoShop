package com.eccoshop.library.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto  {
    @Size(min = 3, max = 10, message = "Tên phải có ít nhất 3-10 ký tự")
    private String firstName;
    @Size(min = 3, max = 10, message = "Họ phải có ít nhất 3-10 ký tự")
    private String lastName;
    private String username;
    @Size(min = 5, max = 10, message = "Mật khẩu chứa từ 5-10 ký tự.7")
    private String password;
    private String repeatPassword;
}
