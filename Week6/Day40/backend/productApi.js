const express = require('express');
const app = express();
const PORT = 3000;
app.use(express.json());
let products = [
    { id: 1, name: "Laptop", price: 45000 },
    { id: 2, name: "Mouse", price: 500 },
    { id: 3, name: "Keyboard", price: 1200 }
];
// GET all products
app.get('/products', (req, res) => {
    res.json(products);
});
// GET one product by ID
app.get('/products/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const product = products.find(p => p.id === id);
    if (!product) {
        return res.status(404).json({ error: "Product not found" });
    }
    res.json(product);
});
// POST - add a new product
app.post('/products', (req, res) => {
    const newProduct = {
        id: products.length > 0 ? products[products.length - 1].id + 1 : 1,
        name: req.body.name,
        price: req.body.price
    };
    products.push(newProduct);
    res.status(201).json(newProduct);
});
// DELETE a product by ID
app.delete('/products/:id', (req, res) => {
    const id = parseInt(req.params.id);
    const exists = products.some(p => p.id === id);
    if (!exists) {
        return res.status(404).json({ error: "Product not found" });
    }
    products = products.filter(p => p.id !== id);
    res.json({ message: `Product ${id} deleted successfully` });
});
app.listen(PORT, () => {
    console.log(`Products API running on http://localhost:${PORT}`);
});