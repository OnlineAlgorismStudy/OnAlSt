using System;
using System.Collections;

namespace samdasu_0824
{
    class samdasu_0824
    {
        static void Main(string[] args)
        {
            string[] sum = new string[5];
            string[] n;
            int suc = 0;
            int avg = 0;

            for (int i = 0; i < sum.Length; i++)
            {
                n = Console.ReadLine().Split(' ');

                for (int j = 0; j < n.Length; j++)
                {                   
                    avg += Convert.ToInt32(n[j]);
                    
                }

                if (avg / 4 >= 80)
                {
                    Console.WriteLine("pass");
                    suc++;
                }
                else
                {
                    Console.WriteLine("fail");
                }
                avg = 0;
                Console.WriteLine("Successful : {0}", suc);
            }




            /*ArrayList n = new ArrayList();
            n.Add(Console.ReadLine());*/

            


            /*int[,] n = new int[5,4];
            int sum = 0;
            int num = 0;
            int suc = 0;
            for(int i = 0; i<n.Length; i++)
            {
                for(int j = 0; j < 4; j++)
                {
                    num = Convert.ToInt32(Console.ReadLine());
                    n[i, j] = num;
                }
            }
            for(int i = 0; i<n.Length; i++)
            {
                for(int j =0; j<4; j++)
                {
                    sum += n[i, j];
                }
                if(sum/5 >= 80)
                {
                    Console.WriteLine("합격");
                    suc++;
                }
                else
                {
                    Console.WriteLine("불합격");
                }

            }
            Console.WriteLine("Successful : {0}", suc);*/
        }
    }
}
