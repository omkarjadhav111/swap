import java.util.ArrayList;
class Main
{
    public static void main(String args[])
    {
         ArrayList a = new ArrayList();
         a.add("omkar");
         a.add(101);
         a.add("Satara");
         System.out.println(a);
         ArrayList a1 = new ArrayList();
         a1.add("Adarsh");
         a1.add(102);
         a1.add("pune");
         System.out.println(a1);
         a1.addAll(a);
         System.out.println(a1);


    }
}