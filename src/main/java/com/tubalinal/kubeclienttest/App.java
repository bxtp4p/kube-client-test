package com.tubalinal.kubeclienttest;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodList;
import io.kubernetes.client.util.Config;

import java.io.IOException;


public class App 
{
    public static void main(String[] args) throws IOException, ApiException{
        ApiClient client = Config.defaultClient();
        
        client.setDebugging(true);
        Configuration.setDefaultApiClient(client);

        CoreV1Api api = new CoreV1Api();
        V1PodList list = api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
        
        
        System.out.println("\nPODS");
        System.out.println("====\n");
        for (V1Pod item : list.getItems()) {
            System.out.println(item.getMetadata().getName());
        }

        
        while (true) {}
    }
}
