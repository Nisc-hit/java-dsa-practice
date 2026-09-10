import { useState } from "react";

function Quiz({ question, options, correctAnswer }) {
  const [message, setMessage] = useState("");

  function handleAnswer(option) {
    if (option === correctAnswer) {
      setMessage("Correct!");
    } else {
      setMessage("Try Again");
    }
  }

  return (
    <div>
      <h2>{question}</h2>

      {options.map((option) => (
        <button
          key={option}
          onClick={() => handleAnswer(option)}
        >
          {option}
        </button>
      ))}

      <p>{message}</p>
    </div>
  );
}

export default Quiz;