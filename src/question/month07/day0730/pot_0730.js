    <script>
        /*3x3 열
        10보다 크면 1로 초기화
        */
        data = prompt();
        number1 = 1;
        for(i=0;i<data;i++){
            for(j=0;j<data;j++){
                document.write(number1);
                number1+=2;
                if(number1>10){
                    number1 = 1;
                }
            }
            document.write("<br>");
        }
        
    </script>
