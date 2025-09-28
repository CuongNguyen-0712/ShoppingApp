import { useState, useEffect } from "react";

export default function App() {
  const [data, setData] = useState([])

  const fecthData = async () => {
    await fetch('http://localhost:8080/api/users')
      .then(res => res.json())
      .then(data => setData(data))
  }

  useEffect(() => {
    fecthData();
  }, [])

  return (
    <>
      <h2>Hiện thị người dùng: </h2>
      {
        data.map((item, index) => (
          <div key={index}>
            <span>{item.id}</span>
            <h4>{item.name}</h4>
          </div>
        ))
      }
    </>
  )
}