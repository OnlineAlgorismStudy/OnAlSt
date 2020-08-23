const arrays = [
  [3, 5, 9],
  [2, 11, 5],
  [8, 30, 10],
  [22, 5, 1],
];

arrays.map((array) => console.log(array.join(" ")));
const result = arrays.reduce((result, array) => {
  return (result += array.reduce((perv, value) => (perv += value), 0));
}, 0);
console.log(result);
