package com.infurapoc.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.websocket.WebSocketService;

import java.net.ConnectException;

@Configuration
public class BlockchainConfig {

    @Value("${chain.addresses.rpc}")
    private String rpcPortAddress;

    @Value("${chain.addresses.ws}")
    private String webSocketUrl;

    @Value("${chain.account.private-key}")
    private String privateKey;

    @Value("${chain.gas-price}")
    private long gasPrice;

    @Value("${chain.gas-limit}")
    private long gasLimit;

    @Bean
    public Web3j web3j() throws ConnectException {
        WebSocketService webSocketService=new WebSocketService(webSocketUrl,true);
        webSocketService.connect();
        return Web3j.build(webSocketService);
    }





}
