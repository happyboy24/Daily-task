function InvalidPriorityNumber(bugpriority){

bugpriority.shift();

bugpriority.pop();

return bugpriority;
}

let bugpriority = [0,1,2,3,4,5,6];
let ValidPriority = InvalidPriorityNumber(bugpriority);
console.log(ValidPriority)