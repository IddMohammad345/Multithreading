# Multithreading (Java)

Examples and utilities demonstrating Java concurrency: threads, synchronization, executors, and common concurrency patterns.

This repository contains sample programs and exercises to help understand and practice multithreading concepts in Java.

*Threads Life Cycle:-*
 * New: A thread is in this state when it is created but not yet started
 * Runnable: After start method is called, the thread becomes runnable. It's ready to run and is waiting for CPU time
 * Running: The thread is in this state when it is executing.
 * Blocked/Waiting: A thread is in this state when it is waiting for resource of for another thread to perform an action.
 * Terminated: A thread is in this state when it has finished executing.

Demon Thread :- a low-priority background thread that provides supporting services to user (non-daemon) threads

For Example- Garbage Collector (GC): The JVM runs GC as a daemon thread to free up memory while your main application code runs.Housekeeping Tasks: Internal JVM operations like finalizers, signal dispatchers, and background image readers.

User Thread:- a high-priority thread designed to execute the core application logic of a Java program.
      For Example - main thread 