// METHOD OVERLOAD

// class overload{
//     int a = 5;
//     int b = 6;

//     void add(){
//         int ans = a+b;
//         System.out.println("First method: a + b = " + ans);
//     }

//     void add(int x,int y){
//         a=x;
//         b=y;
//         int ans = a+b;
//         System.out.println("Second method: a + b = " + ans);

//     }
// }

// public class demo{
//     public static void main(String args[]){
//         overload m1 = new overload();
//         m1.add();
//         m1.add(4,5);
//     }
// }

//CONSTRUCTOR OVERLOAD

// class Coverload{
//     Coverload(){
//         int a = 5;
//         System.out.println("First constructor: a = " + a );
//     }

//     Coverload(int a){
//         System.out.println("Second constructor: a = "+ a);
//     }
// }

// class demo{
//     public static void main(String args[]){
//         Coverload m1 = new Coverload();
//         Coverload m2 = new Coverload(10);

//     }
// }

// PALINDROME CHECKER

// class Palindrome {
//     void checkPal(String s) {
//         int temp = s.length() - 1;
//         String reverse = "";
//         while (temp >= 0)
//             reverse = reverse + s.charAt(temp--);

//         System.out.println(reverse);

//         if(reverse.equals(s)){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not Palindrome");
//         }
//     }
// }

// class demo{
//     public static void main(String args[]){
//         Palindrome m1 = new Palindrome();

//         m1.checkPal("ama");
//     }
// }

//INNER CLASSES

// class Outer{
//     int x = 5;
//     class Inner{
//         int y = 10;
//         int z = x+y;
//         void display(){
//             System.out.println("Inner Class:  " + z);
//         }
//     }

//     void display(){
//         System.out.println("Outter Class:  " + x);
//     }
// }

// class demo{
//     public static void main(String args[]){
//         Outer m1 = new Outer();
//         m1.display();

//         Outer.Inner m2 = new Outer().new Inner();
//         m2.display();
//     }
// }

//ABSTRACT CLASS

// abstract class Shape{
//     final double PI = 3.14;
//     abstract void area();
// }

// class Sphere extends Shape{
//     double rad;

//     Sphere(double r){
//         rad = r;
//     }

//     void area(){
//         System.out.println("Area of Sphere: " + (4*PI*rad*rad));
//     }
// }

// class Rectangle extends Shape{

//     double len,wid;

//     Rectangle(double x, double y){
//         len = x;
//         wid =y;
//     }

//     void area(){
//         System.out.println("Area of Rectangle: " + (len*wid));
//     }
// }

// class demo{
//     public static void main(String args[]){
//         Sphere s1 = new Sphere(2);
//         s1.area();

//         Rectangle r1 = new Rectangle(5, 5);
//         r1.area();
//     }
// }

//EXCEPTION HANDLING

// class LessBalanceException extends Exception{
//     LessBalanceException(String s){
//         super(s);
//     }
// }

// class Account{

//     double minBal;

//     Account(){
//         minBal=1000;
//         System.out.println("Current Balance: " + minBal);
//     }

//     void deposit(double amt){
//         minBal += amt;
//         System.out.println("Current Balance: " + minBal);
//     }

//     void withdraw(double amt){

//         double temp = minBal - amt;

//         try{
//             if(temp < 1000){
//                 throw new LessBalanceException("Insufficient Funds");
//             }else{
//                 minBal -= amt;
//                 System.out.println("Current Balance: " + minBal);
//             }
//         }catch(Exception e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class demo{
//     public static void main(String args[]){
//         Account a1 = new Account();
//         a1.deposit(1000);
//         a1.deposit(1000);
//         a1.withdraw(2500);
//         a1.withdraw(1500);
//     }
// }

// Fibonnaci

// public class demo {

//     public static int fib(int x) {
//         if (x <= 1) {
//             return x;
//         } else {
//             return fib(x - 1) + fib(x - 2);
//         }
//     }

//     public static void main(String args[]) {
//         int num = fib(5);
//         System.out.println(num);

//         int maxNumber = 10;
//         System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");
//         for (int i = 0; i < maxNumber; i++) {
//             System.out.print(fib(i) + " ");
//         }
//     }
// }

// SORTING

// class demo{
//     public static void main(String args[]){
        
//         int arr[] = {5,4,1,3,2};
//         int length = arr.length;

//         for(int i = 0; i < length;i++){
//             for(int j = i+1;j<length;j++){
//                 int temp;

//                 if(arr[j] < arr[i]){
//                     temp = arr[j];
//                     arr[j] = arr[i];
//                     arr[i] = temp;

//                 }

//             }

//          System.out.println("Sorted element index of " + i + " : " + arr[i]);
//         }
//     }
// }


//LINEAR QUEUE

class LinearQueue{
    int front,rear;
    int size = 5;
    int q[] = new int[5];

    LinearQueue(){
        front=0;
        rear=-1;
    }

    void enqueue(int ele){
        if(rear == -1 || rear < size -1){
            q[++rear] = ele;
            System.out.println(q[rear] + " Added on position " + rear);
        }else{
            System.out.println("Queue is Full");
        }
    }

    void dequeue(){
        if(front < size){
            System.out.println("The deleted element is: " + q[front++]);
        }else{
            if(front == size){
                front = -1;
                System.out.println("Queue is Empty");
            }
        }
    }

    void display(){
        if(front > -1){
            System.out.println("Elements are:");
            int k = front;
            for(int i=k;i<=rear;i++){
                System.out.println(q[i]);
            }
        }
    }
}


public class demo {
    public static void main(String args[]){
        LinearQueue q = new LinearQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        System.out.println("When tried to put sixth element to full queue");
        q.enqueue(60);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println("When tried to remove sixth element from empty queue");
        q.dequeue();
        q.display();
    }
}




