using System;

namespace samdasu_0902
{
    class samdasu_0902
    {
        static void Main(string[] args)
        {
            int radius_input = Convert.ToInt32(Console.ReadLine());
            double pi = Math.PI;


            fn_Circlearea();
            void fn_Circlearea()
            {
                Console.WriteLine("{0:.00}", pi * radius_input*radius_input);
            }
        }
    }
}
