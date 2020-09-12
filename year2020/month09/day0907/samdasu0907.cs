using System;

namespace samdasu_0907
{
    class samdasu0907
    {
        static void fn_calculation(double a, double b)
        {
            /*double val = 1;
            for(int i = 0; i<=b; i++)
            {
                val = a * val;
            }
            return val;*/

            var result =Math.Pow(a, b);

            Console.WriteLine(result);

            
        }
        static void Main(string[] args)
        {
            double a = Convert.ToInt32(Console.ReadLine());
            double b = Convert.ToInt32(Console.ReadLine());            

            Console.WriteLine("{0},{1}",a, b);
            fn_calculation(a,b);        
        }

        


    }
    
}
