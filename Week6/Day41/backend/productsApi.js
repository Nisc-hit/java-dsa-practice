const express = require('express');
const cors = require('cors');
const app = express();
const PORT = 3000;
app.use(cors());        // allow requests from any origin (fine for local learning)
app.use(express.json());
let products = [
    { id: 1, name: "Laptop", price: 45000 },
    { id: 2, name: "Mouse", price: 500 },
    { id: 3, name: "Keyboard", price: 1200 }
];
app.get('/products', (req, res) => {
    res.json(products);
});
app.post('/products', (req, res) => {
    const newProduct = {
        id: products.length > 0 ? products[products.length - 1].id + 1 : 1,
        name: req.body.name,
        price: req.body.price
    };
    products.push(newProduct);
    res.status(201).json(newProduct);
});
app.delete('/products/:id', (req, res) => {
    const id = parseInt(req.params.id);
    products = products.filter(p => p.id !== id);
    res.json({ message: `Product ${id} deleted` });
});
app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});