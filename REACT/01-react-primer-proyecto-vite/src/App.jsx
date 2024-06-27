import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import Contador from "./components/Contador";
import Datos from "./components/Datos";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <Contador inici={0} />
      <Contador inici={100} />
      {/* <Datos nom="Moha" apellido="Bouirig" altura={170} valores={[1, 2, 3]} />
      <Datos nom="Jorge" apellido="Rubiosos" altura={171} valores={[4, 5, 6]} />
      <Datos nom="Sergei" apellido="Albases" altura={172} valores={[7, 8, 9]} /> */}
    </>
  );
}

export default App;
