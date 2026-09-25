const express = require('express');
const app = express();
const PORT = 3000;

app.get('/user/:name', (req, res) => {
    res.send(`Hello, ${req.params.name}!`);
});

app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});