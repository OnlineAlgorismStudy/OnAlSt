using System;

namespace samdasu_0930
{
    class sandasu0930
    {
        const double py = 3.141592;
        static void Main(string[] args)
        {
            double input = Convert.ToDouble(Console.ReadLine());

            fn_circle(input);
        }

        static void fn_circle(double a)
        {
            Console.WriteLine("{0:0.000}",a * a * py);
        }
    }
}
