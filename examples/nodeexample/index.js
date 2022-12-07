

const myFunction = (x,y) => {
    return x+y
}


console.log('Start')

const a = ['1','2','Hello']

// a.forEach(el => console.log(el))

// console.log(myFunction(5,4))

const obj = {
    name: "Test",
    age: 15,
    assignedFunc: myFunction
}

console.log(obj.assignedFunc(2,1))
