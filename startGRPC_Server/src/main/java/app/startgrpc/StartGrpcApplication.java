package app.startgrpc;

import app.startgrpc.service.GreetingServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

//@SpringBootApplication
public class StartGrpcApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
//        SpringApplication.run(StartGrpcApplication.class, args);

        Server server = ServerBuilder.forPort(8080)
                .addService(new GreetingServiceImpl())
                .build();

        server.start();
        System.out.println("Server started, listening on " + server.getPort());
        server.awaitTermination();

    }

}
