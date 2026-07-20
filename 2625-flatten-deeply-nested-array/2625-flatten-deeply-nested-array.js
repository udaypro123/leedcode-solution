/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    let newarr = [];
    if(n==0){
        return arr;
    }

    for(let ele of arr){
        if(Array.isArray(ele)){
            newarr.push(...flat(ele, n-1));
        }else{
            newarr.push(ele)
        }
    }
    return newarr;
};