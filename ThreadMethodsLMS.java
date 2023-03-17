package javaprogram;
// ThreadMethodsLMS

//Code example of inter-thread communication -
class User{
int amount=15000;
synchronized void withdrawal(int amount){
System.out.println("will withdraw");
if(this.amount<amount){
System.out.println("Low balance; waiting for deposit");
try{wait();}catch(Exception e){}
}
this.amount-=amount;
System.out.println("withdrawal completed");
}
synchronized void deposit(int amount){
System.out.println("to be deposited");
this.amount+=amount;
System.out.println("depositing completed");
notify();
}
}
class ThreadMethodsLMS{
public static void main(String args[]){
final User U=new User();
new Thread(){
public void run(){U.withdrawal(20000);}
}.start();
new Thread(){
public void run(){U.deposit(15000);}
}.start();
}}

/**
// Example code of thread synchronization -
class Table{
synchronized void printTable(int n){
for(int i=1;i<=5;i++){
System.out.println(n*i);
try{
Thread.sleep(400);
}catch(Exception e){System.out.println(e);}
}
}
}
public class ThreadMethodsLMS{
public static void main(String args[]){
final Table obj = new Table();
Thread t1=new Thread(){
public void run(){
obj.printTable(5);
}
};
Thread t2=new Thread(){
public void run(){
obj.printTable(100);
}
};
t1.start();
t2.start();
}
}
**/
/**
// Code example of Java deadlock -
public class ThreadMethodsLMS {
public static void main(String[] args) {
final String resource1 = "karan kumar";
final String resource2 = "ratan kumar";
Thread t1 = new Thread() {
public void run() {
synchronized (resource1) {
System.out.println("Thread 1: resource 1 locked");
try { Thread.sleep(200);} catch (Exception e) {}
synchronized (resource2) {
System.out.println("Thread 1: resource 1 locked");
}
}
}
};
Thread t2 = new Thread() {
public void run() {
synchronized (resource2) {
System.out.println("Thread 2: resource 2 locked ");
try { Thread.sleep(100);} catch (Exception e) {}
synchronized (resource1) {
System.out.println("Thread 2: resource 1 locked ");
}
}
}
};
t1.start();
t2.start();
}
}
**/
/**
// Example
class Table{
synchronized void printTable(int n){
for(int i=3;i<=9;i++){  //int i=2;i<=6,i++. && int=3;i<=9,i++.
System.out.println(n*i);
try{
Thread.sleep(400);
}catch(Exception e){System.out.println(e);}
}
}
}
public class ThreadMethodsLMS{
public static void main(String args[]){
final Table obj = new Table();
Thread t1=new Thread(){
public void run(){
obj.printTable(5);
}
};
Thread t2=new Thread(){
public void run(){
obj.printTable(100);
}
};
t1.start();
t2.start();
}
}
**/