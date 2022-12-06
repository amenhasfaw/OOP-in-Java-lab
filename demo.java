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






