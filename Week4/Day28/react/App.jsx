import Quiz from "./Quiz";

function App() {
  return (
    <Quiz
      question="Which language is used with React?"
      options={["Java", "JavaScript", "Python"]}
      correctAnswer="JavaScript"
    />
  );
}

export default App;