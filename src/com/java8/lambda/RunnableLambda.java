package com.java8.lambda;

public class RunnableLambda {

	
	public static void main(String[] args) {
		
		//usingAnonymousClass();
		//usingRunnable();
		//traditionalThreading();
		//usingRunnableWithLambda();
		//usingLambdaConcise();
	}

	private static void usingLambdaConcise() {
		new Thread(()->System.out.println("anonymous clas used here with lambda expression"));
	}

	private static void usingRunnableWithLambda() {
		Runnable runnableLambda = () -> System.out.println("anonymous clas used here with lambda expression");
		Thread thread = new Thread(runnableLambda);
		thread.start();
	}

	private static void usingAnonymousClass() {
		new Thread() {
			@Override
			public void run() {
				System.out.println("AnonymousClass used here");
			}
		};
	}

	private static void usingRunnable() {
		TestThreadRunnable testThreadRunnable = new TestThreadRunnable();
		Thread thread = new Thread(testThreadRunnable);
		thread.start();
	}

	private static void traditionalThreading() {
		String threadNameString = Thread.currentThread().getName();
		System.out.println("Default Thread"+ threadNameString);
		System.out.println("Default Thread"+ Thread.currentThread().getId());
		TestThread testThread = new TestThread();
		testThread.start();
	}
	
}

class TestThread extends Thread{
	public void run() {
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		Thread.currentThread().setName("Child Thread Renamed");
		System.out.println(Thread.currentThread().getId());
		System.out.println("Child Thread : Test Thread Run()");
		System.out.println(Thread.currentThread().getName());
	}
	
	
}

class TestThreadRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Implementing Runnable");
	}
	
	
}