    <script>
    data = prompt();
    data1 =parseInt(data);
    for(i=0;i<data1;i++){
        for(j=0;j<=i;j++){
            document.write("&nbsp");
        }
        for(k=data1;k>i;k--){
            document.write("*");
        }document.write("<br>");
    }
   
   
    </script>
