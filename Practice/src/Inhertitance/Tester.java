package Inhertitance;

public class Tester {   
    public static void main( String args[] ) // ignore syntax of args, issue with canvas
    {
        C c = new C() ;
        D d = new D() ;
        F f1 = new F(c);
        F f2 = new F(d);
        f1.display();
        f2.display();
    }
}