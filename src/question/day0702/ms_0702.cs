using System;

namespace algorithm_04
{
    class ms_0702
    {
        static void Main(string[] args)
        {
            const double YD = 91.44;
            
            Console.Write("yard? ");
            var input = Console.ReadLine();
            double yard = Convert.ToDouble(input);

            Console.WriteLine($"{yard}yard = {yard*YD:.0}cm");
        }
    }
}
