import { useState } from 'react';
function WeatherStyleApp() {
    const [cityId, setCityId] = useState('');
    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState('');
    function handleFetch() {
        if (!cityId) return;
        setLoading(true);
        setError('');
        setData(null);
        fetch(`https://jsonplaceholder.typicode.com/posts/${cityId}`)
            .then(response => {
                if (!response.ok) throw new Error('City data not found');
                return response.json();
            })
            .then(result => {
                setData(result);
                setLoading(false);
            })
            .catch(err => {
                setError(err.message);
                setLoading(false);
            });
    }
    return (
        <div>
            <h2>Weather-Style Lookup (Demo API)</h2>
            <input
                type="number"
                placeholder="Enter city ID (1-100)"
                value={cityId}
                onChange={(e) => setCityId(e.target.value)}
            />
            <button onClick={handleFetch}>Get Data</button>
            {loading && <p>Loading...</p>}
            {error && <p style={{ color: 'red' }}>{error}</p>}
            {data && (
                <div style={{ border: '1px solid gray', padding: '15px', marginTop: '10px', borderRadius: '8px' }}>
                    <h3>{data.title}</h3>
                    <p>{data.body}</p>
                </div>
            )}
        </div>
    );
}
export default WeatherStyleApp;