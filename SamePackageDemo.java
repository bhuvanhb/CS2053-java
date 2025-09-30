// Same Package (Non-Subclass)
package pack1;

public class SamePackageDemo {
    public static void main(String[] args) {
        Base b = new Base();
        b.show();
        System.out.println(b.pub);   
        System.out.println(b.prot);
        System.out.println(b.def);  
        //System.out.println(b.priv);
    }
}