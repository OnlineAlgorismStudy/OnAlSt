function solution(s) {
    let result = s;
    while (/\(\)/g.test(result)) {
        result = result.replace(/\(\)/g, "");
    }
    return result === "";
}