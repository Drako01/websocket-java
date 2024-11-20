package com.armotusitio.cliente;



import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.CloseReason;
import jakarta.websocket.ContainerProvider;
import jakarta.websocket.OnClose;
import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.WebSocketContainer;

import java.net.URI;

@ClientEndpoint
public class ChatClient {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Conexión establecida con el servidor WebSocket.");
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println("Mensaje del servidor: " + message);
    }

    @OnClose
    public void onClose(Session session, CloseReason reason) {
        System.out.println("Conexión cerrada: " + reason);
    }

    public static void main(String[] args) throws Exception {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        URI uri = new URI("ws://localhost:8080/chat");

        Session session = container.connectToServer(ChatClient.class, uri);
        session.getBasicRemote().sendText("¡Hola desde el cliente WebSocket!");
        Thread.sleep(5000);
        session.close();
    }
}

