<br><p align="center">
<img src="https://1000logos.net/wp-content/uploads/2020/09/Java-Logo.png" alt="Java" width=300></p>

<p align="center"> 
 <a href="https://www.w3.org/html/" target="_blank"> 
     <img src="./websockets.png" alt="WebSocket" height="100"/></a> 
    &nbsp &nbsp
 <a href="https://www.w3schools.com/css/" target="_blank"> 
 <img src="https://miro.medium.com/v2/resize:fit:1100/0*5FEJ7emIEAxZRCQF" alt="spring-boot"  height="100"/></a> 
</p>

---

# Spring Boot WebSocket Server

Este proyecto es un servidor WebSocket básico desarrollado en **Spring Boot**, diseñado para demostrar cómo establecer conexiones WebSocket en tiempo real. Incluye soporte para manejar mensajes entre clientes y el servidor.

## 📋 Requisitos

Asegúrate de tener lo siguiente instalado:

- **Java 17** o superior
- **Maven** (o cualquier otra herramienta para construir proyectos Java)
- **Postman** o una herramienta para probar WebSockets (como WebSocket Tester)

## 🚀 Instalación y ejecución

1. **Clona el repositorio:**

   ```bash
   git clone https://github.com/Drako01/websocket-java.git
   cd websocket-java
   ```

2. **Construye el proyecto:**

   ```bash
   mvn clean install
   ```

3. **Ejecuta la aplicación:**

   ```bash
   mvn spring-boot:run
   ```

   El servidor estará disponible en: `ws://localhost:8080/chat`.

## 🛠️ Configuración

### Endpoint principal

- **WebSocket URL:**  
  `ws://localhost:8080/chat`

### Estructura del servidor

1. **Configuración del WebSocket:**
   La clase `WebSocketConfig` configura el endpoint `/chat` como el punto de entrada para las conexiones WebSocket.

2. **Manejador de mensajes:**
   La clase `ChatWebSocketHandler` es responsable de manejar los eventos de conexión, mensajes enviados por los clientes y desconexiones.

### Comportamiento del servidor

- Cuando un cliente se conecta, el servidor registra la conexión.
- Los mensajes enviados por un cliente se retransmiten a todos los demás clientes conectados.
- Cuando un cliente se desconecta, su sesión se elimina del registro.

## 🔗 Probando la conexión

### Usando Postman

1. Abre Postman y selecciona **WebSocket Request**.
2. Introduce la URL del servidor WebSocket:  
   `ws://localhost:8080/chat`.
3. Haz clic en **Connect**.
4. Envía un mensaje desde el campo de texto, por ejemplo:  
   ```plaintext
   Hola servidor WebSocket!
   ```
5. Observa la respuesta del servidor y verifica que otros clientes conectados reciben el mensaje.

### Usando WebSocket Tester (opcional)

1. Accede a [WebSocket Tester](https://www.websocket.org/echo.html).
2. Introduce la URL del servidor:  
   `ws://localhost:8080/chat`.
3. Conéctate y envía un mensaje.

## 📂 Estructura del proyecto

```plaintext
src/main/java/
└── com.armotusitio/
    ├── config/
    │   └── WebSocketConfig.java   # Configuración de WebSocket
    ├── handler/
    │   └── ChatWebSocketHandler.java   # Lógica principal del WebSocket
    ├── client/
    │   └── ChatClient.java   # Endpoint del Cliente
    └── WebSocketApplication.java   # Clase principal
```

## 💡 Funcionalidades futuras

- Soporte para salas de chat privadas.
- Persistencia de mensajes en una base de datos.
- Integración con un cliente frontend (Angular, React, etc.).

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, realiza un fork y envía un Pull Request.

## 📝 Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.



--------



## Profesor: Alejandro Daniel Di Stefano
[GitHub](https://github.com/Drako01) 

