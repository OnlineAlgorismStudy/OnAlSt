using System;

namespace algorithm_03
{   
    class ms_0701
    {
        const float YD = 91.44f;
        const float IN = 2.54f;

        static void Main(string[] args)
        {
            float x = 2.1f;
            float y = 10.5f;

            Console.WriteLine($" {x}yd = {(x*YD):.0}cm");
            Console.WriteLine($"{y}in =  {(y*IN):.0}cm");
        }
    }
}
