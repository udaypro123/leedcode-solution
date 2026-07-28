/**
 * @param {number[][]} costs
 * @return {number}
 */
var twoCitySchedCost = function(costs) {

    let ans=0;
    for(let i=0; i<costs.length ;i++){
        let val= costs[i][0]- costs[i][1]
        costs[i].push(val)
    }

    costs.sort((a,b)=> a[2] - b[2]);

    let n=costs.length;

    for(let i=0; i<n ; i++){

            if(i< n/2){
                ans+= costs[i][0]
            }else{
                ans+= costs[i][1]

            }
    }

    return ans;
    
};