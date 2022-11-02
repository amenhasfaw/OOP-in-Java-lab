//Basic Structure
/*

Class Outer{
    // Class body

    Class Inner{
        //Inner Class body
    }
    
    //more outer Class body
}

- Accessing Inner Class:
  

  Outer obj = new Outer();
  Outer.Inner obj2 = obj.new Inner();

        OR


  new Outer().new Inner()



*/


// INNER CLASSES
class Outer{
    int outData = 10;
    void display(){
        Inner inobj = new Inner();
        System.out.println("Accessing from Outer Class: ");
        System.out.println("Outer Class Data= " + outData);
        System.out.println("Inner Class Data= " + inobj.innerData);
    }

    class Inner{
        int innerData = 20;

        void indisplay(){
            System.out.println("Accesing from Inner class");
            System.out.println("Inner data is equal to: " + innerData);
            System.out.println("Sum is equal to: " + (outData + innerData));
        }
    }
}


public class exp3 {
    public static void main(String args[]){
        // Outer obj1 = new Outer();
        // obj1.display();

        // Outer.Inner obj2 = obj1.new Inner();
        // obj2.indisplay();


        Outer.Inner obj3 = new Outer().new Inner();
        obj3.indisplay();


        //new Outer().new Inner().indisplay();
    }
}
