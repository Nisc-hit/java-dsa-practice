import { useState, useEffect } from 'react';

function ProductListLive() {
    const [products, setProducts] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState('');

    useEffect(() => {
        fetch('http://localhost:3000/products')
            .then(res => {
                if (!res.ok) {
                    throw new Error('Failed to fetch products');
                }
                return res.json();
            })
            .then(data => {
                setProducts(data);
                setLoading(false);
            })
            .catch(err => {
                setError(err.message);
                setLoading(false);
            });
    }, []);

    if (loading) return <p>Loading...</p>;

    if (error) return <p>{error}</p>;

    return (
        <ul>
            {products.map(p => (
                <li key={p.id}>
                    {p.name} - Rs.{p.price}
                </li>
            ))}
        </ul>
    );
}

export default ProductListLive;