class Class1 {
Class1()
{
System.out.println("Object created");
}
// finalize()
protected void finalize() {
System.out.println("finalize() method called before object is destroyed");
}
}
public class FinalizeDemo {
public static void main(String[] args) {
Class1 obj = new Class1();
// Make object eligible for Garbage Collector
obj = null;
// Suggest JVM to run garbage collector
System.gc();
}
}











Enter customer name: Riya
Enter number of accounts: 3
Enter balance for account 1: 15000
Enter balance for account 2: 22000.50
Enter balance for account 3: 9800

Customer: Riya
Account Balances:
₹15000.0
₹22000.5
₹9800.0