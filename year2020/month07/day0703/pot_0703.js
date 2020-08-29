<script>
        function change1(width,height){
            
            result1 = width * height;
            return result1;
        }

        data = prompt("입력 : ").split(" ");
        width = parseInt(data[0]) + 5;
        length = parseInt(data[1]) * 2;
        document.write("width =" + width + "<br>");
        document.write("length = " + length +"<br>");
        document.write("area = " + change1(width,length)+"<br>");
    
    </script>
