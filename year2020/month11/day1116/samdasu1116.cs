using System;
using System.Collections;

namespace _1116
{
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList arr = new ArrayList();
            string input = Console.ReadLine();
            foreach(char c in input)
            {
                if(!c.ToString().Contains(' '))
                {
                    arr.Add(c);
                }
                
            }
            /*string temp = "";
            for(int i = 0; i<=input.Length -1; i++)
            {
                if(input[i] != ' ')
                {
                    temp += temp + input[i];
                }
                else
                {
                    continue;
                }
            }*/



            for (int i = 0; i < arr.Count; i++)
            {
                if (arr[i].ToString().Contains(" "))
                {
                    arr.Remove(arr[i]);
                }
            }
            input = string.Empty;
            for(int i = 0;i<arr.Count; i++)
            {
                input += arr[i].ToString();
            }



            //input = input.Replace("\u3000", null);
            
            try
            {
                Console.WriteLine(input.Substring(0, 3));
                Console.WriteLine(input.Substring(3, 3));
                Console.WriteLine(input.Substring(6, 3));
                Console.WriteLine(input.Substring(9, 3));
                Console.WriteLine(input.Substring(12, 3));
                Console.WriteLine(input.Substring(15, 3));
                Console.WriteLine(input.Substring(18, 3));
                Console.WriteLine(input.Substring(21, 3));
                Console.WriteLine(input.Substring(24, 3));
            }
            catch(Exception)
            {
                Environment.Exit(0);
            }            

            
        }
    }
}
