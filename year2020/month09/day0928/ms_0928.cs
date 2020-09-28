using System;

namespace algorithm_66
{
    class ms_0928
    {
        // <summary>
        // type true : 값들을 모두 더한 후 반올림한 평균 값 return
        // type false : 반올림한 값들을 모두 더한 후 반올림한 평균 값 return
        // </summary>
        static int getRound(double[] data, Boolean type)
        {
            double sum = 0;

            for(int i = 0; i < data.Length; i++) 
            {
                if(type)
                    sum += data[i];
                else
                    sum += Math.Round(data[i]); 
            }

            return Convert.ToInt32(Math.Round(sum/3));
        }

        static void Main(string[] args)
        {
            string[] input = Console.ReadLine().Split(' ');
            double[] data = new double[3];

            for(int i = 0; i < data.Length; i++)
                data[i] = Convert.ToDouble(input[i]);

            Console.WriteLine(getRound(data, true));
            Console.WriteLine(getRound(data, false));
        }
    }
}
