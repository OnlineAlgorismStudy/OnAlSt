<script>
       
        var arr1 = Array.from(Array(2), () => new Array(4));
        var arr2 = Array.from(Array(2), () => new Array(4));
        

        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                arr1[i][j] = parseInt(prompt());
                document.write(' '+arr1[i][j]);
               
            }
            document.write("<br>")
        }

        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                arr2[i][j] = parseInt(prompt());
                document.write(' '+arr2[i][j]);
            }
            document.write("<br>");
        }
        document.writeln('-----------');
        document.write("<br>");
        for(i=0;i<2;i++){
            for(j=0;j<4;j++){
                result = arr1[i][j] * arr2[i][j];
                document.write(' '+result);
            }
            document.write("<br>");
        }
    </script>
