package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("The thread is starting ...");
            }
        };

        new Thread(runnable).start();
        // lambda
        Runnable runnable2 = () -> System.out.println("Thread running via lambda");
        new Thread(runnable2).start();
        new Thread(()->System.out.println("Thread running with lambda as method argument")).start();
    }



}
