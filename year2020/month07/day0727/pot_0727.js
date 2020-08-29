    <script>
        
        z = 1;
        number = parseInt(prompt());
        for(i=0;i<number;i++){
            for(j=4;j>i;j--){
                document.write("&nbsp");
            }
            
            for(k=0;k<=i;k++){
                document.write(z);
                z++;
            }
            z = 1;
            document.write("<br>");
        }

    </script>
