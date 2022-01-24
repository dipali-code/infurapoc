package com.infurapoc.service;

public interface BlockchainService {

    public String deployContract() throws Exception;

    public String loadContract(String contractAddress);

    public void subscriptionToEvent(String contractAddress);

    public String getLastDeployedContract();
}
