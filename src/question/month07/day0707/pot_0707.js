<script>
        function chenckAnimal(number){
            switch(number){
                case 1:
                result = "dog";
                break;

                case 2:
                result = "cat";
                break;

                case 3:
                result = "chick";
                break;

                default:
                result = "I don't Know"
                break;
            }
            return result;
        }

        input1 = prompt("Number ? : ");
        Animal = parseInt(input1);
        document.write(chenckAnimal(Animal));
        
    </script>
