<script>
        number = parseInt(prompt());
        for(i=0;i<number;i++){
            for(j=0;j<i;j++){
                document.write("&nbsp");
            }
            for(k=0;k<(number-i)*2-1;k++){
                document.write("*");
                
            }
            document.write("<br>");
        }   
        for(i=0;i<number-1;i++){
            for(j=1;j>i;j--){
                document.write("&nbsp");
            }
            
            for(k=1;k<(number-1)*(i+1)+2;k++){
                document.write("*");
            }
            document.write("<br>");
        }
        /*

     1 2 3 / 4
     1 2 3 4 5 / 6
     number = 3
     */
   
    </script>
