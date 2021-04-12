function solution(s) {
    let zero_count = 0;
    let repeat_count = 0;

    let result = s;
    do {
        zero_count += result.match(/0/g) ? result.match(/0/g).length : 0;
        result = result.replace(/0/g, "").length.toString(2);
        repeat_count += 1;
    } while (result !== "1");

    return [repeat_count, zero_count];
}