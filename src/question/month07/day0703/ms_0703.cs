using System;

namespace algorithm_05
{
    class ms_0703
    {
        static void Main(string[] args)
        {
            string[] area = Console.ReadLine().Split(new char[] {' '});
            var width = Convert.ToInt32(area[0]) + 5;
            var length = Convert.ToInt32(area[1]) * 2;

            Console.WriteLine($"width = {width}\nlength = {length}");
            Console.WriteLine($"area = {width * length}");
        }
    }
}
