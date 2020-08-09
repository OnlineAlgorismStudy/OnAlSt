using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace samdasu_0806
{
    class samdasu_0806
    {
        static void Main(string[] args)
        {
            //ArrayList n = new ArrayList();

            var input = Console.ReadLine();
            var _input = input.Split(' ');

            if(_input.Length <= 10)
            {
                
                Array.Sort(_input);
                Console.WriteLine(_input[0]);
            }
            else
            {
                Console.Write("10개 이하로 정수 입력 바랍니다.");
            }
        }
    }
}
