package pro.sky.java.course5.homework54;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

/*
1 способ:
class AnotherTask extends Thread{
@Override
public void run () {
...
}

public class Thread1 {
public static void main(String[] args) {
AnotherTask thread = new AnotherTask();
thread.start();
}
}

2 способ:
class AnotherRun implements Runnable {
@Override
public void run () {
...
}

public class Thread2 {
public static void main(String[] args) {
AnotherRun anotherRun = new AnotherRun();
Thread childThread = new Thread (anotherRun);
childThread.start();
}
}


 */
