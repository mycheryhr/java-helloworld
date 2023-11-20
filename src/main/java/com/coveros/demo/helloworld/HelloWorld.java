package com.coveros.demo.helloworld;  
  
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import java.util.concurrent.Executors;  
import java.util.concurrent.ScheduledExecutorService;  
import java.util.concurrent.TimeUnit;  
  
public class HelloWorld {  
  
  public static void main(final String[] args) {  
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");  
    final LocalDateTime now = LocalDateTime.now();  
    final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);  
  
    // 定义一个周期任务，每10秒执行一次  
    scheduler.scheduleAtFixedRate(() -> {  
        LocalDateTime currentTime = LocalDateTime.now();  
        System.out.println("Hello, World! The current time is " + dtf.format(currentTime));  
    }, 0, 10, TimeUnit.SECONDS);  
  }  
}
