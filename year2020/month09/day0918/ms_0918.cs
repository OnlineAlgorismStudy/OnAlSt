using System;

namespace algorithm_60
{
    class ms_0918
    {
        static void AVC(int[] X, double[] Y) // Absolute Value Calculation
        {
            Console.WriteLine((Math.Abs(X[0]) > Math.Abs(X[1])? X[0] : X[1]));
            Console.WriteLine((Math.Abs(Y[0]) > Math.Abs(Y[1])? Y[1] : Y[0]));
        }

        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            int[] intData = new int[2];

            for(int i = 0; i < intData.Length; i++)
                intData[i] = Convert.ToInt32(input[i]);
            
            input = Console.ReadLine().Split(' ');
            double[] doubleData = new double[2];

            for(int i = 0; i < doubleData.Length; i++)
                doubleData[i] = Convert.ToDouble(input[i]);

            AVC(intData, doubleData);
        }
    }
}
