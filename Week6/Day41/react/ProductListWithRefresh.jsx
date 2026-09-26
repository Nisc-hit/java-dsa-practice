import { useState, useEffect } from 'react';
function ProductListWithRefresh() {
    const [products, setProducts] = useState([]);
    const [loading, setLoading] = useState(true);
    function fetchProducts() {
        setLoading(true);
        fetch('http://localhost:3000/products')
            .then(res => res.json())
            .then(data => {
                setProducts(data);
                setLoading(false);
            });
    }
    useEffect(() => {
        fetchProducts();
    }, []);
    return (
        <div>
            <button onClick={fetchProducts} disabled={loading}>
                {loading ? 'Refreshing...' : 'Refresh'}
            </button>
            <ul>
                {products.map(p => <li key={p.id}>{p.name} - Rs.{p.price}</li>)}
            </ul>
        </div>
    );
}
export default ProductListWithRefresh