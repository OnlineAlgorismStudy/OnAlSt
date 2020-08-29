using System;
using System.Collections;

namespace samdasu0817
{
    class samdasu_0817
    {
        static void Main(string[] args)
        {
            var n = (Console.ReadLine());
            var n_input = n.Split(' ');

            ArrayList ar = new ArrayList();
            ArrayList arr = new ArrayList();

            if(n_input.Length < 101)
            {
                for (int i = 0; i < n_input.Length; i++)
                {
                    if (Convert.ToInt32(n_input[i]) % 2 != 0)
                    {
                        ar.Add(Convert.ToInt32(n_input[i]) * 2);
                    }
                    else if (Convert.ToInt32(n_input[i]) % 2 == 0)
                    {
                        arr.Add(Convert.ToInt32(n_input[i]) / 2);
                        arr.Remove(0);
                    }
                    else if (Convert.ToInt32(n_input[i]) == 0)
                    {
                        break;
                    }
                    else { }
                }

                for (int j = 0; j < ar.Count; j++)
                {
                    Console.Write("{0} ", ar[j]);
                }
                Console.WriteLine(" ");
                for (int k = 0; k < arr.Count; k++)
                {
                    Console.Write("{0} ", arr[k]);
                }
            }
            else
            {
                Console.Write("100개 이하의 숫자만 입력해 주세요.");
            }
            
        }
    }
}
