import { useState } from 'react';
function SimpleForm() {
    const [inputValue, setInputValue] = useState('');
    const [items, setItems] = useState([]);
    function handleSubmit(e) {
        e.preventDefault(); // stops the page from refreshing
        if (inputValue.trim() === '') return;
        setItems([...items, inputValue]);
        setInputValue(''); // clear the input after submitting
    }
    return (
        <div>
            <form onSubmit={handleSubmit}>
                <input
                    type="text"
                    value={inputValue}
                    onChange={(e) => setInputValue(e.target.value)}
                />
                <button type="submit">Add</button>
            </form>
            <ul>
                {items.map((item, index) => (
                    <li key={index}>{item}</li>
                ))}
            </ul>
        </div>
    );
}
export default SimpleForm;
