    <script>
        data = prompt();
        for(i=0;i<data;i++){
            for(j=0;j<=i;j++){
                document.write("#");
            }
            document.write("<br>");
        }
        for(i=data-1;i>0;i--){
            for(j=data-1;j>=i;j--){
                document.write("&nbsp")
            }
            for(k=0;k<i;k++){
                document.write("#");
            }
            document.write("<br>");
        }
        
    </script>
