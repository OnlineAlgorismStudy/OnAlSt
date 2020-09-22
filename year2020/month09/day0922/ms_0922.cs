using System;

namespace algorithm_62
{
    delegate double DelegateMethod(int x, int y, int count);

    class ms_0922
    {
        public static double minusSquare(int x, int y, int count) { return Math.Pow((x - y), count); }
        public static double plusCube(int x, int y, int count) { return Math.Pow((x + y), count); }
        
        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int x = Convert.ToInt32(input[0]);
            int y = Convert.ToInt32(input[1]);

            DelegateMethod square = new DelegateMethod(minusSquare);
            DelegateMethod cube = new DelegateMethod(plusCube);

            Console.WriteLine($"({x} - {y}) ^ 2 = {square(x, y, 2)}");
            Console.WriteLine($"({x} + {y}) ^ 3 = {cube(x, y, 3)}");
        }
    }
}
