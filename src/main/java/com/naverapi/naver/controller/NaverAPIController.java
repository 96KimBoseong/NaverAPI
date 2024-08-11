package com.naverapi.naver.controller;

import com.naverapi.naver.dto.ItemDto;
import com.naverapi.naver.service.NaverApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NaverAPIController {

    private final NaverApiService naverApiService;

    public NaverAPIController(NaverApiService naverApiService) {
        this.naverApiService = naverApiService;
    }


    @GetMapping("/search")
    public List<ItemDto> searchItems(@RequestParam String query)  {
        return naverApiService.searchItems(query);
    }
}
