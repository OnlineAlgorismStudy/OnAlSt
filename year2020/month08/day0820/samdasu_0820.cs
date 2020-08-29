using System;

namespace samdasu_0820
{
    class samdasu_0820
    {
        static void Main(string[] args)
        {
            int[,] arr = { {5,8,10,6,4 },{ 11,20,1,13,2},{7,9,14,22,3 } };

            for(int i = 0; i<3; i++)
            {
                for(int j = 0; j<5; j++)
                {
                    Console.Write("  {0}", arr[i,j]);
                }
                Console.WriteLine("");
            }
        }
    }
}
