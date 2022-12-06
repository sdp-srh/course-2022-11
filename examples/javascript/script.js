
function initListeners() {
	console.log("initListeners")
	document.getElementById("persons_button").addEventListener('click', loadPersons)
}

function loadPersons() {
	console.log("fetch persons")
	fetch('https://jsonplaceholder.typicode.com/users')
  		.then(response => response.json())
  		.then(json => displayPersons(json))
	//console.log('we are faster')
	//debugger;
	//alert("hello")
}

function displayPersons(json) {
	let html = ''
	console.log(json)
	json.forEach(element => {
		html +=`<p>${element.name} (${element.id})</p>`
	})
	document.getElementById('result').innerHTML = html
}

initListeners()

