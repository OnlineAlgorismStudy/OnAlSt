    <script>
        /*숫자 출력 , 문자출력*/
       al = 65;
       nu = 1;
       number = prompt();
       for(i=0;i<number;i++){
           for(j=3;j>i;j--){
                document.write(nu);
                nu++;
           }
           for(k=0;k<=i;k++){
            document.write(String.fromCharCode(al));
            al++;
           }
           document.write("<br>");
       }
    </script>
