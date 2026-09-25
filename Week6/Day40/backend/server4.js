const express = require('express');
const app = express();
const PORT = 3000;

app.get('/profile', (req, res) => {
    res.json({
        name: "Nischit",
        role: "Student",
        year: 2026
    });
});

app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});