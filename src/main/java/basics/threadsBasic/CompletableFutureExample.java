package basics.threadsBasic;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    public static void main(String[] args){
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, ";
                }
        );
        CompletableFuture<String> futureWithMessage = completableFuture.thenApply(result -> result +" world"
            );
        futureWithMessage.thenAccept(message -> System.out.println(message));

        try {
            System.out.println(futureWithMessage.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
