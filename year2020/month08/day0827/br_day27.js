const initAry = [[3, 5, 9], [2, 11, 5], [8, 30, 10], [22, 5, 1]];
let sum = 0;

initAry.forEach(function(innerAry) {
  innerAry.forEach((i) => {
    sum += i;
  });
  console.log(innerAry.join(" "));
})
console.log(sum);
