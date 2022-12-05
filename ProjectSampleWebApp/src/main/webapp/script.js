function init() {
    // initialize the listener for the search button and trigger the search, when clicked
    document.getElementById("searchbutton").addEventListener('click', startSearch);
}


async function startSearch() {
    // get the search term from the searchfield
    let term = document.getElementById("searchfield").value;
    console.log(term);
    // call our servlet (this is an asynchronous call, so we use await)
    const response = await fetch('./search?term='+term);
    const results = await response.json();
    // here we get our JSON from the servlet
    console.log(results);
    // display the results
    displaySearchResult(results);
}

function displaySearchResult(searchResults) {
    // get the element from html where we want to display the results
    let resultElement = document.getElementById("results");
    resultElement.innerHTML = '';
    let titleElement = document.createElement("h2");
    titleElement.innerHTML = "Results ("+searchResults.length+")";
    resultElement.appendChild(titleElement);

    // iterate over all results
    for (let i = 0; i < searchResults.length; i++) {
        let entry = searchResults[i];
        // create the html output for the person
        let personDiv = document.createElement("div");
        let nameElement = document.createElement("p");
        
        // insert the values from json
        nameElement.innerHTML = entry.firstName +", "+entry.lastName;
        nameElement.classList.add("largetext");
        
        // combine the elements and append to the results
        personDiv.appendChild(nameElement);
        resultElement.appendChild(personDiv);
    }
}