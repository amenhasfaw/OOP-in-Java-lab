//Basic Structure
/*

Class A{
    A(){
        //Constructor body
    }

    A(x,y){
        //Constructor body
    }
}

*/


// CONSTRUCTOR OVERLOADING

class Const{
    int a=0;
    int b=0;

    Const(){
	    a=b=1;
    }

    Const(int x, int y){
        this.a = x;
        this.b = y;
    }

    void print(){
        System.out.println("a="+ a + "  b=" + b);
    }
}


public class exp2 {
    public static void main(String args[]){
        
        System.out.println("Default Method Call");
        Const obj1 = new Const();
        obj1.print();

        System.out.println("Parameterized Method Call");
        Const obj2 = new Const(10,20);
        obj2.print();


    }
}
