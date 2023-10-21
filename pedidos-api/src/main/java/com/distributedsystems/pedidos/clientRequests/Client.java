package com.distributedsystems.pedidos.clientRequests;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.Random;

public class Client {

    public static void main(String[] args) {
        int i = 0;
        while (i<1000) {
            Thread requestThread = new Thread(() -> {
                createRequestSaveItemPedido();
            });
            requestThread.start();
            i++;
        }
    }

    public static void createRequestSaveItemPedido() {
        Random random = new Random();
        int qtdItem = random.nextInt(20) +1;
        long codProduto = (long) (random.nextInt(10) + 1);

        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            String url = "http://localhost:8080/api/v1/itempedido";
            HttpPost  postRequest = new HttpPost(url);
            String jsonRequest = "{" +
                    "\"qtdItem\":\""+qtdItem+
                    "\",\"codProduto\":\""+codProduto+"\"}";

            StringEntity entity = new StringEntity(jsonRequest);
            postRequest.setEntity(entity);
            postRequest.setHeader("Content-type", "application/json");

            CloseableHttpResponse response = httpClient.execute(postRequest);
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Resposta: " + responseBody + "\nJson enviado: "+jsonRequest);

            httpClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
