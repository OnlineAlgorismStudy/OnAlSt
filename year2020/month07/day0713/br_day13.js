for (let i = 2; i < 5; i++) {
  let logStr = "";
  for (let j = 1; j < 6; j++) {
    logStr += `${i} * ${j} = ${(i*j).toString().padStart(2, ' ')}   `
  }
  console.log(logStr.trim());
}
