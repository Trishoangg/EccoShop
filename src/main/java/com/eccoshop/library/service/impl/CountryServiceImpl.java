package com.eccoshop.library.service.impl;

import com.eccoshop.library.model.Country;
import com.eccoshop.library.repository.CountryRepository;
import com.eccoshop.library.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
