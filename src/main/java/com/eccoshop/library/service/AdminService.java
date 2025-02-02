package com.eccoshop.library.service;

import com.eccoshop.library.dto.AdminDto;
import com.eccoshop.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
