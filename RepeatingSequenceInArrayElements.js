function lowestLengthFinder(array){
  let minArr=[];
for(let i=0;i<array.length-1;i++){
  if(array[i].length<=array[i+1].length){
    minArr[0]=array[i];
  }else{
       minArr[0]=array[i+1]; 
  }
}
  return minArr[0];
}

let smallValue=lowestLengthFinder(["slithern","slathrn"]);

function findTheRepValue(array,smallValue){
console.log("Small values is:-",smallValue);
    let isCommon=false;
    let repArr=[];
    let groupTxt="";
    for(let i=0;i<smallValue.length;i++){
            let counter=0;
        for(value in array){
            if(array[value].charAt(i)===smallValue.charAt(i)){
                isCommon=true;
                counter++;
            }else{
                isCommon=false;
            }
        }
        if(isCommon && counter===array.length){
            groupTxt+=smallValue.charAt(i);
        }else{
            repArr.push(groupTxt);
            groupTxt="";
        }
    }
            return repArr.filter(val=>val!=='');
}

findTheRepValue(["slithern","slathrn"].filter((value)=>value!==smallValue),smallValue);
