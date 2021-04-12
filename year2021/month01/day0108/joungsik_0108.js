function solution(skill, skill_trees) {    
    const answers = skill_trees.reduce((prev, skill_tree) => {
        const indexs = skill.split("").map(text => skill_tree.indexOf(text) === -1 ? null : skill_tree.indexOf(text));

        if (indexs.filter(index => index !== null).length === 0) {
            return prev + 1;
        } else {
            const check = indexs.reduce((prev, value, index, array) => {
                if (array[0] === null) {
                    return false;
                } else if (index !== array.length -1) {
                    if (array[index + 1] !== null) {
                        return prev && (value === null ? false : value < array[index + 1]);
                    } else {
                        return prev;   
                    }
                } else {
                    return prev;
                }
            }, true);
            return check ? prev + 1 : prev;
        }
    }, 0);
    return answers;
}