package com.infurapoc.controller;


import com.infurapoc.service.BlockchainService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/blockchain")
public class BlockchainController {


    private final BlockchainService blockChainService;

    @GetMapping("/deployContract")
    @ApiOperation(value = "This API use to Deploy the Contract")
    public String deployContract() throws Exception {
        return blockChainService.deployContract();
    }
}
