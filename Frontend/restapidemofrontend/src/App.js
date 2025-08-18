import React, { useEffect, useState } from "react";

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch("http://localhost:8080/api/hello")
      .then((res) => res.json())
      .then((data) => setMessage(data.message)) // uses your getMessage()
      .catch((err) => console.error(err));
  }, []);

  return (
    <div style={{ padding: "20px", fontSize: "20px" }}>
      <h1>Spring Boot + React</h1>
      <p>Message from backend: {message}</p>
    </div>
  );
}

export default App;
