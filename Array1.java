public class Array1
 {
    public static void main(String Arg[])
    {
        // Static way
        int Arr1[] = {10,20,30,40};
        
        // Dynamic Way
        int Arr2[] = new int[4];
        Arr2[0] = 10;
        Arr2[1] = 20;
        Arr2[2] = 30;
        Arr2[3] = 40;

       System.out.println("Length of Arr 1 : "+Arr1.length);
       System.out.println("Length of Arr 2 : "+Arr2.length);


    }
    
}
