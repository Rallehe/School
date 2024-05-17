async function showData(endpoint) {
    const url = `http://localhost:${endpoint}`;
    const data = await fetchData(url);
    renderDataList(data, endpoint);
}

async function fetchData(url) {
    const response = await fetch(url);
    const data = await response.json();
    return data;
}

function renderDataList(data, endpoint) {
    const content = document.getElementById("main")

    if (Array.isArray(data) && data.length === 0) {
        content.innerHTML = '<p>No data available.</p>';
        return;
    }
    const ul = document.createElement('ul');
    data.forEach(obj => {
        const li = document.createElement('li');
        let textContent = '';

        // Adjust text content depending on the called url
        if (endpoint === '8081/buildings') {
            content.innerHTML = '<h2>Buildings</h2>';
            textContent = `Building ID: ${obj.id}, Name: ${obj.name}, Apartments: ${obj.apartments}, Guests: ${obj.guests}, Janitor ID: ${obj.janitorId}`;
        } else if (endpoint === '8084/apartments') {
            content.innerHTML = '<h2>Apartments</h2>';
            textContent = `Apartment ID: ${obj.id}, Area: ${obj.sq_m}, Address: ${obj.address}, ZipCode: ${obj.zipCode}`;
        } else if (endpoint === '8083/janitors') {
            content.innerHTML = '<h2>Janitors</h2>';
            textContent = `Janitor ID: ${obj.id}, Name: ${obj.name}, PersonalNumber: ${obj.personalNumber}, Phone Number: ${obj.phoneNumber}`;
        } else if (endpoint === '8082/guests') {
            content.innerHTML = '<h2>Guests</h2>';
            textContent = `Guest ID: ${obj.id}, Name: ${obj.firstName} ${obj.lastName}, Phone Number: ${obj.phoneNumber}`;
        }
        li.textContent = textContent;
        ul.appendChild(li);
    });

    content.appendChild(ul);
}

function backHome() {
    const content = document.getElementById("main")
    content.innerHTML = ' <h2>Where your dream of the perfect home becomes true!</h2>';
}


