import React, { useEffect, useState } from 'react';

function App() {
    const [pets, setPets] = useState([]);

    // Fetching data from Spring Boot API when the component mounts
    useEffect(() => {
        fetch('/api/pets')
            .then(response => response.json())
            .then(data => setPets(data))
            .catch(error => console.error('Error fetching pets:', error));
    }, []);

    return (
        <div className="App">
            <h1>List of Pets</h1>
            <ul>
                {pets.map((pet, index) => (
                    <li key={index}>{pet}</li>
                ))}
            </ul>
        </div>
    );
}

export default App;
