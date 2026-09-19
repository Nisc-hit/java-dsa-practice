import { useState, useEffect } from 'react';
function RefreshableList() {
    const [items, setItems] = useState([]);
    const [loading, setLoading] = useState(true);
    function fetchItems() {
        setLoading(true);
        fetch('https://jsonplaceholder.typicode.com/posts?_limit=5')
            .then(res => res.json())
            .then(data => {
                setItems(data);
                setLoading(false);
            });
    }
    useEffect(() => {
        fetchItems();
    }, []);
    return (
        <div>
            <button onClick={fetchItems}>Refresh</button>
            {loading ? <p>Loading...</p> : (
                <ul>
                    {items.map(item => <li key={item.id}>{item.title}</li>)}
                </ul>
            )}
        </div>
    );
}
export default RefreshableList;