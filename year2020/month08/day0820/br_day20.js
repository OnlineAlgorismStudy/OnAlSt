const ary = [[5,8,10,6,4],[11,20,1,13,2],[7,9,14,22,3]];

ary.forEach(function (item) {
  item = item.map((num) => {return (' '+num).substring(String(num).length-1);});
  console.log(item.join('   '));
})
