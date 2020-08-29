using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace samdasu_0807
{
    class samdasu_0807
    {
        static void Main(string[] args)
        {
            int[] small = new int[10];
            int[] big = new int[10];
            
            var input = Console.ReadLine();
            var _input = input.Split(' ');
            


            for(int i = 0; i<_input.Length; i++)
            {
                if (Convert.ToInt32(_input[i]) > 1 || Convert.ToInt32(_input[i]) < 10000)
                {
                    if (Convert.ToInt32(_input[i]) < 101)
                    {
                        small[i] = (Convert.ToInt32(_input[i]));
                    }                    
                    else
                    {                        
                    }
                }
                else
                {
                    Console.WriteLine("1~10000 사이의 정수를 입력해 주세요.");
                }

            }

            for(int i = 0; i<_input.Length; i++)
            {
                if (Convert.ToInt32(_input[i]) > 1 || Convert.ToInt32(_input[i]) < 10000)
                {
                    if (Convert.ToInt32(_input[i]) > 100)
                    {
                        big[i] = Convert.ToInt32(_input[i]);
                    }
                }
            }
            Array.Sort(small);
            Array.Sort(big);

            Console.WriteLine(small[small.Length-1]);
            Console.WriteLine(big[0]);
        }
    }
}
