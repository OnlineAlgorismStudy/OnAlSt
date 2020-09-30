using System;

namespace algorithm_68
{
    class ms_0930
    {
        public const double PI = 3.141592;

        static void Circle(double radius) 
        {
            double value = PI * radius * radius;
            
            Console.WriteLine($"area : {value:#.###}");
        }

        static void Main(string[] args)
        {
            double radius;

            Console.Write("radius : ");
            radius = Convert.ToDouble(Console.ReadLine());

            Circle(radius);
        }
    }
}
