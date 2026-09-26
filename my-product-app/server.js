const express = require('express');

const app = express();

const PORT = 3000;

app.use(express.json());

const products = [
    { id: 1, name: 'Laptop', price: 45000 },
    { id: 2, name: 'Mouse', price: 500 },
    { id: 3, name: 'Keyboard', price: 1200 }
];

app.get('/products', (req, res) => {
    res.json(products);
});

app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});