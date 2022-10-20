// METHOD OVERLOADING

class Overload{
    int a=0,b=0;
    void add(){
        System.out.println("NO or Default argument add method, sum = " + (a+b));
    }

    void add(int x, int y){
        a = x;
        b = y;
        System.out.println("Parameterized argument add method, Sum: " + (a+b));
    }
}


public class exp1 {
    public static void main(String args[]){
        Overload obj = new Overload();
        obj.add();
        obj.add(10,20);
    }
}
