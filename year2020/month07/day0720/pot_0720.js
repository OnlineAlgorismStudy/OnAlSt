<script>
        /*65 ~ 90 A ~ Z*/
       number = prompt();
       data = 65;
       for(i=3;i>0;i--){
           for(j=0;j<i;j++){
            document.write(String.fromCharCode(data));
            data++;
           }
           document.write("<br>");
       }
    </script>
